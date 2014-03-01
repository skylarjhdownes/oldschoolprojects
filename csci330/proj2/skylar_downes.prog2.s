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
#seq1: .word 16 56 84 80 48 24 20 84 56 16
seq2: .word 60 66 157 293 329 329 334 304 13 124
seq3: .word 0 56 72 80 102 420 296 274 236 0
seq1: .word 8 8 8 127 8 8 8 0 0 0
dash: .asciiz "- "
sign: .asciiz "$ "
newline: .asciiz "\n"
store: .word 55

#############################################
#                                           #
#                  Program                  #
#                                           #
#############################################
.text
main:

	
	addi $s2, $0, 0   # increments by 4 to load words for the charprint loop
	addi $s3, $0, 0   # put 0 in s2 for the incrementation in the charprint loop
	
	
charprint:  #takes a set of ten ints between 0 and 511, 
			#and prints them as a bitmap character
	
	
	# s4 will be the integer sent to rowprint
	# t1 will be the offset, to be incremented by 4 for each row 
	
	lw $s4, seq1($s2) # load the current word into s4
	addi $s2, $s2, 4  # add 4 to the counter, s2
	
	addi $s0, $0, 0   # initialize counter for the rowprint loop
	addi $s1, $0, 256   # put 256 in s1 for the incremental and logic checks
	jal rowprint
	addi $s3, $s3, 1
	slti $t5, $s3, 10
	beq $t5, $0, end  # if the loop has executed ten times, exit
	j charprint
	
rowprint: # Takes an int and prints nine characters, 
		  # one for each of the nine least significant binary digits
	
	
	and $t6, $s4, $s1 # find out if there's a 1 in each bit
	bne $t6, $0, print1  # Jump to print a - if there was a 0 instead

	
print2:
	
	la $a0 dash  			# print a -
	li $v0, 4
	syscall
	j after
	
print1:	
	
	la $a0 sign  			# print a $
	li $v0, 4
	syscall
	
after:

	srl $s1, $s1, 1
	
	addi $s0, $s0, 1
	slti $t4, $s0, 9
	bne $t4, $0, rowprint  # if s0 isn't at 9 yet, loop

	la $a0 newline  			# newline
	li $v0, 4
	syscall
	
	jr $ra

end:

	li $v0, 10				# Exit program
	syscall
	
# End of File