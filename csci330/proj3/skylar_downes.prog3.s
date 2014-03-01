## 
##  Explain your program here
##
##
##
##

.globl main

#############################################
#                                           #
#                   Data                    #
#                                           #
#############################################
.data
input1: .asciiz "Enter the Nth Pell number to calculate: "
output1: .asciiz "The result of Pell("
output2: .asciiz ") = "
output3: .asciiz "."
#############################################
#                                           #
#                  Program                  #
#                                           #
#############################################
.text

main:
	la $a0 input1  			# Print the first input request
	li $v0, 4
	syscall
	
	li $v0, 5				# Request N
	syscall

	add $t0, $v0, $0		# Store N
	
	la $a0 output1  		# Print the first output string
	li $v0, 4
	syscall
	
	add $a0, $t0, $0
	li $v0, 1				# Print N
	syscall
	
	la $a0 output2  		# Print the second output string
	li $v0, 4
	syscall

	add $a0, $t0, $0
	jal pell 				# Call pell function
	
	
	add $a0,$v0,$zero		# Print the Pell number
	li $v0,1
	syscall
	
	la $a0 output3  		# Print the third output string
	li $v0, 4
	syscall
		
	li $v0, 10				# Exit program
	syscall

pell:						# Takes N as input, outputs Nth pell number
	addi $sp,$sp,-12 		# Save things on the stack
	sw $ra,0($sp)
	sw $s0,4($sp)
	sw $s1,8($sp)
	
	add $s0,$a0,$zero 		# Put a0 in s0
	
	addi $t1,$zero,1		# Put 1 in t0
	beq $s0,$zero,return0 	# Leave if s0 is 0
	beq $s0,$t1,return1		# or 1
	
	addi $a0,$s0,-1			# Put s0-1 in a0
	
	jal pell				# Recursive call
	
	
	add $s1,$zero,$v0     
	sll $s1,$s1,1			# s1=2*pell(y-1)
	
	addi $a0,$s0,-2
	
	jal pell           	    # Recursive call, v0=pell(n-2)
	
	add $v0,$v0,$s1       	# v0=pell(n-2)+$s1
	
exitpell:
	lw $ra,0($sp)       	# Read registers from the stack
	lw $s0,4($sp)
	lw $s1,8($sp)
	addi $sp,$sp,12      	# Bring back stack pointer
	jr $ra
	
return1:					# Put 1 in v0
	li $v0,1
	j exitpell
	
return0 :     				# Put 0 in v0
	li $v0,0
	j exitpell
	
# End of File