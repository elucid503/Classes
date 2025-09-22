.data
.text
.globl main
main:
li $t1, 5   #upper limit
li $t2, 0 # temporary sum
addloop:   # label for loop
addi  $t2, $t2, 1

move $a0, $t2
li $v0, 1
syscall

ble $t2,$t1, addloop
li $v0,10
syscall