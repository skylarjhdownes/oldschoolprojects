

.globl main
.data
a: .word 10
.text
main:
la	 $t0, a          #loads 10 into t0
#the address bounce here was irrelevant, it undid itself.
lw	 $t1, 0($t0)     #puts $t0 in t1
#let's put 4 straight into t2, it's headed there anyway
#we don't need to do the silly +4, -8 thing either
li	 $t2, 4          #puts 4 in t2
add $t3, $t1, $t2     #put t1 + t2 in t3  t3 = 14
add  $a0, $t3, $zero #put t3 in a0
#adding zero to t3 doesn't do anything
addi $v0, $zero, 1   #set the system to print an integer from a0
syscall              #print an integer from a0
li $v0, 10           #set the system to exit
syscall              #exit
