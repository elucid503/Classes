.data
myb: .byte 0,1,2,3,4,5,6,7
myw: .word 8,9,10,11,12,13,14,15
endl: .asciiz "\n"
comma: .asciiz ","
.text
.globl main
main:
    # Print byte array
    la $s0, myb        # s0 = base address of myb
    addi $s7, $zero, 8 # s7 = loop count (8 bytes)
    add $t0, $zero, $zero # t0 = loop counter
BYTE_LOOP:
    slt $t1, $t0, $s7  # compare t0 to s7
    beq $t1, $zero, BYTE_END # exit if t0 >= s7
    # Print index
    addu $a0, $zero, $t0
    li $v0, 1
    syscall
    la $s1, comma
    add $a0, $zero, $s1
    li $v0, 4
    syscall
    # Print offset (t0 * 1 for bytes)
    addu $a0, $zero, $t0
    li $v0, 1
    syscall
    la $s1, comma
    add $a0, $zero, $s1
    li $v0, 4
    syscall
    # Print byte value
    add $t1, $s0, $t0  # address = base + offset
    lb $t4, 0($t1)     # load byte
    addu $a0, $zero, $t4
    li $v0, 1
    syscall
    la $s1, endl
    add $a0, $zero, $s1
    li $v0, 4
    syscall
    addi $t0, $t0, 1   # increment counter
    j BYTE_LOOP
BYTE_END:
    # Print word array
    la $s0, myw        # s0 = base address of myw
    addi $s7, $zero, 8 # s7 = loop count (8 words)
    add $t0, $zero, $zero # reset t0
WORD_LOOP:
    slt $t1, $t0, $s7  # compare t0 to s7
    beq $t1, $zero, ENDLP # exit if t0 >= s7
    # Print index
    addu $a0, $zero, $t0
    li $v0, 1
    syscall
    la $s1, comma
    add $a0, $zero, $s1
    li $v0, 4
    syscall
    # Print offset (t0 * 4 for words)
    sll $t1, $t0, 2    # offset = t0 * 4
    addu $a0, $zero, $t1
    li $v0, 1
    syscall
    la $s1, comma
    add $a0, $zero, $s1
    li $v0, 4
    syscall
    # Print word value
    add $t1, $s0, $t1  # address = base + offset
    lw $t4, 0($t1)     # load word
    addu $a0, $zero, $t4
    li $v0, 1
    syscall
    la $s1, endl
    add $a0, $zero, $s1
    li $v0, 4
    syscall
    addi $t0, $t0, 1   # increment counter
    j WORD_LOOP
ENDLP:
    li $v0, 10         # halt
    syscall