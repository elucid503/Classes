.data
mybytes: .byte 0,1,2,3,4,5,6,7
myword: .word 8,9,10,11,12,13,14,15

myend: .asciiz "\n"
comma: .asciiz ","

.text 
.globl main

main:
la $s0, myword # $s0 -> base addr
li $s7, 8 # $s7 -> total times thru loop

loop:
slt $t1, $t0, $s7 # compare $t0 counter to $s7
beq $t1, $zero, end_loop # jump to end_loop if $t1 == 0

move $a0, $t0
li $v0, 1
syscall # print $t0

la $s1, comma
move $a0, $s1 
li $v0, 4
syscall # print comma

sll $t1, $t0, 2
move $a0, $t1 # see what address offset is

move $a0, $t1
li $v0, 1
syscall # print $t1

la $s1, comma
move $a0, $s1 
li $v0, 4
syscall # print comma

add $t1, $s0, $t1 # put in t1 the base addr
lw $t4, 0($t1)

move $a0, $t4
li $v0, 1
syscall # print $t4

la $s1, myend
move $a0, $s1
li $v0, 4
syscall # new line

addi $t0, $t0, 1 # inc t0 and store in t0

j loop

end_loop:
li $v0, 10
syscall # exit

# TODO: Add another loop for my_bytes