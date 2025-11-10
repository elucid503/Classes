.text
.globl main

main: # initializing totals/constants
        li $t0, 0 # i = 0 (total counter)
        li $t7, 100 # upper imit = 100
        li $s0, 0 # even total (div by 2 total)
        li $s1, 0 # odd total (not div by 2 total)
        li $s2, 0 # div by 7 total
        li $s3, 0 # not div by 7 total
loop: # start/entry of the loop that will run for 100 times
        rem  $t1, $t0, 2 # t1 = i mod 2
        beq  $t1, $zero, is_even # goto is_even (it is) if t1 == 0. if not, we keep going to next instruction
        addi $s1, $s1, 1 # increment odd total (not div by 2 total)
        j after_mod_two # this skips the increment of even total (we dont want that) and goes to the next condition
is_even: # work to be done when the first condition is 'true'
        addi $s0, $s0, 1 # increment even total (div by 2 total)
after_mod_two: # next step after first conditional
        rem  $t2, $t0, 7 # t2 = i % 7
        beq  $t2, $zero, is_div_seven # # goto is_div_seven and do stuff there if t2 == 0
        addi $s3, $s3, 1 # increments not div by 7 total
        j after_mod_seven # same as above, we DON'T want to keep going and increment div by 7 total
is_div_seven: # work for second condition being 'true'
        addi $s2, $s2, 1 # increments div by 7 total
after_mod_seven: # after second condition (handles loop)
        addi $t0, $t0, 1 # increment i (total counter)
        blt $t0, $t7, loop # keep doing this while i (total counter) < 100
end: # finished loop
        li $v0, 10 # exit opcode & syscall
        syscall