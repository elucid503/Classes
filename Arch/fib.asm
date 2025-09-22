.data
space: .asciiz " "
.text

.globl main

main:

li $v0, 5 # syscall for user int input 
syscall # init syscall

move $t5, $v0 # move $v0 (int read) into $t5

li $t4, 0 # counter 

li $t1, 0 # fib 1
li $t2, 1 # fib 2

li $t3, 0 # current fib

fibloop:   # label for loop
add $t3, $t1, $t2 # adding the last two fibs together, storing in $t3
move $t1, $t2 # sets fib 1 to fib 2 (previous)
move $t2, $t3 # sets fib 2 to current fib (for next time)

addi $t4, $t4, 1 # increment counter

move $a0, $t3 # load $t3 into arg for syscall
li $v0, 1 # syscall 1 - print int 
syscall # print the int

la $a0, space
li $v0, 4 # syscall 4 - print string 
syscall # print the int

ble $t4,$t5, fibloop # branch back to loop if $t4 is less than or eq to $t5

li $v0,10 # exit op
syscall # exit call