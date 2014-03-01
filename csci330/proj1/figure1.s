.globl main
.data
a: .word 10
.text
main:
la	 $t0, a          #loads 10 into t0
addi $8, -4          #Bounces the address back,
lw	 $9, 4($t0)      #and forth.
li	 $t4, 4          #puts 4 in t4
addi $t2, $t4, 0     #replace t2 with t4, t2 = 4
sub  $t0, $9, $t2    #subtract t2 from t1, put in t0,  t0 = 6
addi $t3, $8, 8      #put t0 + 8 in t3  t3 = 14
addi $11, $t3, 0     #add 0 to t3
add  $4, $t3, $zero  #put t3 in a0
addi $v0, $zero, 1   #put 1 in v0
syscall              #print the int in a0
li $v0, 10           #put 10 in v0
syscall              #exit
