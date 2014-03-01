## Skylar Downes
## Project one
## CSCI 361
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
input1: .asciiz "Enter the first number: "
input2: .asciiz "Enter the second number: "
output1: .asciiz "The result of "
output2: .asciiz " plus "
output3: .asciiz " is "
output4: .asciiz "."


#############################################
#                                           #
#                  Program                  #
#                                           #
#############################################
.text
main:
	
	la $a0 input1  			# print the first input request
	li $v0, 4
	syscall
		
	li $v0, 5				# Request the first integer
	syscall
	
	add $t0, $v0, $0		# store the first integer
	
	la $a0 input2  			# print the second input request
	li $v0, 4
	syscall
		
	li $v0, 5				# Request the second integer
	syscall	
	
	add $t1, $v0, $0		# store the second integer
	
	add $t2, $t0, $t1		#add the two integers
	
	la $a0 output1  		# print the first output string
	li $v0, 4
	syscall
	
	add $a0, $t0, $0
	li $v0, 1 				# Print the first integer
	syscall 
	
	la $a0 output2  		# print the second output string
	li $v0, 4
	syscall
	
	add $a0, $t1, $0
	li $v0, 1 				# Print the second integer
	syscall 
	
	la $a0 output3  		# print the third output string
	li $v0, 4
	syscall
	
	add $a0, $t2, $0
	li $v0, 1 				# Print the third integer
	syscall 
	
	la $a0 output4  		# print the fourth output string
	li $v0, 4
	syscall
	
	li $v0, 10				# Exit program
	syscall

# End of File