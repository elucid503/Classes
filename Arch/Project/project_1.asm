.data

    # arrays

    my_arr: .space 200 # space for 50 integers (4 bytes each)
    my_second_arr: .space 100 # space for 25 integers (4 bytes each)

    # strings

    space_str: .asciiz " " # utility; used in print_array
    newline_str: .asciiz "\n" # utility; used in print_array and print_loop_count
 
    loop_count_str: .asciiz "Loop count: " # used in print_loop_count

    first_arr_str: .asciiz "First array: " # used in print_array
    second_arr_str: .asciiz "Second array: " # also used in print_array

.text

.globl main

main:

    # GOAL: initializes my_arr as 0, 2, 4, ..., 98 and then computes my_second_arr as the sum of pairs from the start and end of my_arr (so my_second_arr[0] = my_arr[0] + my_arr[49], my_second_arr[1] = my_arr[1] + my_arr[48], etc.)
    # OUTPUT: my_second_arr should contain 98, 98, 98, ..., 98 (25 times)

    # setting arguments for init_array. a0 = address of my_arr, a1 = size of array (50 elements)

    la $a0, my_arr # these are the arguments for init_array. see documentation of init_array
    li $a1, 50

    jal init_array # calling init_array and saving the line after in ra

    la $t0, my_arr # used for iterating through my_arr
    la $t3, my_arr # used for iterating through my_arr in reverse

    addi $t3, $t3, 196 # important: we set t3 to point to the last element of my_arr (49 * 4 = 196)

    la $t1, my_second_arr # used for iterating through my_second_arr

    li $t2, 0 # counter to keep track for later
   
loop:

    beq $t2, 25, done # loop counter == size of second array ? goto done
   
    lw $a0, 0($t0) # loading the two numbers to be summed into a0 and a1
    lw $a1, 0($t3)
   
    jal sum_numbers # procedure call: sum_numbers(a0, a1) -> v0
   
    sw $v0, 0($t1) # stores the summed result in second array. assumes base index (t1) is updated correctly
   
    # updating base addresses and loop counter

    addi $t0, $t0, 4 # moving t0 to the next element in my_arr
    addi $t3, $t3, -4 # moving t3 to the previous element in my_arr
    addi $t1, $t1, 4 # moving t1 to the next element in my_second_arr to insert correctly (above)

    addi $t2, $t2, 1 # incrementing main loop counter for later use

    j loop

done:

    move $a1, $t2 # moving loop count into a1 for printing
    jal print_loop_count
   
    # arguments for print_array to print my_arr. see documentation of print_array

    la $a0, first_arr_str
    la $a1, my_arr
    li $a2, 50

    jal print_array

    # arguments for second call to print_array to print my_second_arr
   
    la $a0, second_arr_str
    la $a1, my_second_arr
    li $a2, 25

    jal print_array
   
    j exit # done; jumps directly to exit procedure at the EOF

init_array:

    # procedure to initialize an array with (index of the current word offset) * 2, starting from 0

    addi $sp, $sp, -8 # making room on the stack for saving registers. we don't want to overwrite any values happening in the main program
    sw $ra, 0($sp)
    sw $t0, 4($sp)
    sw $t1, 8($sp)

    li $t0, 0 # loop counter
    li $t1, 0 # value to be stored in the array

    init_loop:

        beq $t0, $a1, init_done # loop counter == size of array ? goto init_done
        sw $t1, 0($a0) # storing t1 in the array

        addi $t1, $t1, 2 # incrementing value by 2
        addi $a0, $a0, 4 # moving to the next word in the array. since we can't do a[i], we change the base. could also use sll here
        addi $t0, $t0, 1 # incrementing loop counter

        j init_loop

    init_done:

        lw $ra, 0($sp) # restoring saved registers
        lw $t0, 4($sp)
        lw $t1, 8($sp)
        addi $sp, $sp, 8 # restoring stack pointer

        jr $ra # returning to the line after the jal in main

print_loop_count:

    # procedure to print the loop count

    li $v0, 4 # print str opcode
    la $a0, loop_count_str
    syscall # prints "Loop count: "

    li $v0, 1 # print int opcode
    move $a0, $a1
    syscall # prints the actual loop count

    li $v0, 4 # print str opcode
    la $a0, newline_str
    syscall # prints a newline

    jr $ra

sum_numbers:

    # pretty self-explanatory procedure to sum two numbers and return the result in v0

    add $v0, $a0, $a1
    
    jr $ra # returning to line after call/jal

print_array:

    # generalized procedure to print an array of integers. a0 = string to print before the array, a1 = address of the array, a2 = size of the array

    addi $sp, $sp, -16 # making room on the stack for saving registers. same reasoning as init_array
    sw $ra, 0($sp)
    sw $t0, 4($sp)
    sw $t1, 8($sp)
    sw $t2, 12($sp)
   
    li $v0, 4 
    syscall # this already assumes the string address is in a0. generally iffy behavior, because we are now entirely dependent on the caller
   
    move $t0, $a1 # base address of the array goes into t0 so we don't mess with a1
    move $t1, $a2 # size of array -> t1; same reasoning as above
    
    li $t2, 0 # loop counter
   
    print_array_loop:

        beq $t2, $t1, print_done # loop counter == size of array ? goto print_done
       
        li $v0, 1 # print int opcode
        lw $a0, 0($t0) # loading the current element of the array into a0 for printing
        syscall 
       
        li $v0, 4 # print str opcode
        la $a0, space_str
        syscall # prints " " between elements
       
        addi $t0, $t0, 4 # moving to the next word in the array
        addi $t2, $t2, 1 # incrementing loop counter

        j print_array_loop
       
    print_done:

        li $v0, 4 # print str opcode
        la $a0, newline_str # printing a newline at the end of the array
        syscall

        lw $ra, 0($sp) # restoring saved registers
        lw $t0, 4($sp)
        lw $t1, 8($sp)
        lw $t2, 12($sp)
        addi $sp, $sp, 16 # restoring stack pointer

        jr $ra

exit:

    li $v0, 10 # exit opcode
    syscall


