.data
sum: .word 0

.text
.globl main

main:
li $t0, 1 # init counter
li $t1, 5 # upper limit
li $t2, 0 # temp sum
add_loop:
add $t2, $t2, $t0
addi $t0, $t0, 1

ble $t0, $t1, add_loop
sw $t2, sum
li $v0, 10
syscall