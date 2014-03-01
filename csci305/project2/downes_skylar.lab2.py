# Skylar Downes - Project 2
# Python project for CSCI305
# RPSLS
# Uses Python 3.2
from random import randint  # Random int generator
import operator  # For greater-thans and less-thans

class Element:
	name = "nonameyet"
	def _init_(self):
		self.data = []
	def getName(self):
		return self.name
	def compareTo(Element):
		raise NotImplementedError("Not yet implemented.")

class Rock(Element):
	name = "rock"
	def _init_(self,name):
		self.name = "rock"
	def compareTo(self,opponent):
		if opponent == "rock":
			print ("Rock equals rock.")
			return "tie"
		if opponent == "paper":
			print ("Paper covers rock.")
			return "lose"
		if opponent == "scissors":
			print ("Rock crushes scissors.")
			return "win"
		if opponent == "lizard":
			print ("Rock crushes lizard.")
			return "win"
		if opponent == "spock":
			print ("Spock vaporizes rock.")
			return "lose"

class Paper(Element):
	name = "paper"
	def _init_(self,name):
		self.name = "paper"
	def compareTo(self,opponent):
		if opponent == "rock":
			print ("Paper covers rock.")
			return "win"
		if opponent == "paper":
			print ("Paper equals paper.")
			return "tie"
		if opponent == "scissors":
			print ("Scissors cut paper.")
			return "lose"
		if opponent == "lizard":
			print ("Lizard eats paper.")
			return "lose"
		if opponent == "spock":
			print ("Paper disproves Spock.")
			return "win"
		
class Scissors(Element):
	name = "scissors"
	def _init_(self,name):
		self.name = "scissors"
	def compareTo(self,opponent):
		if opponent == "rock":
			print ("Rock crushes scissors.")
			return "lose"
		if opponent == "paper":
			print ("Scissors cut paper.")
			return "win"
		if opponent == "scissors":
			print ("Scissors equals scissors.")
			return "tie"
		if opponent == "lizard":
			print ("Scissors decapitate lizard.")
			return "win"
		if opponent == "spock":
			print ("Spock smashes scissors.")
			return "lose"
		
class Lizard(Element):
	name = "lizard"
	def _init_(self,name):
		self.name = "lizard"
	def compareTo(self,opponent):
		if opponent == "rock":
			print ("Rock crushes lizard.")
			return "lose"
		if opponent == "paper":
			print ("Lizard eats paper.")
			return "win"
		if opponent == "scissors":
			print ("Scissors decapitate lizard.")
			return "lose"
		if opponent == "lizard":
			print ("Lizard equals lizard.")
			return "tie"
		if opponent == "spock":
			print ("Lizard poisons Spock.")
			return "win"
		
class Spock(Element):
	name = "spock"
	def _init_(self,name):
		self.name = "spock"
	def compareTo(self,opponent):
		if opponent == "rock":
			print ("Spock vaporizes rock.")
			return "win"
		if opponent == "paper":
			print ("Paper disproves Spock.")
			return "lose"
		if opponent == "scissors":
			print ("Spock smashes scissors.")
			return "win"
		if opponent == "lizard":
			print ("Lizard poisons Spock.")
			return "lose"
		if opponent == "spock":
			print ("Apparently some kind of transposition has taken place. I find it extremely interesting. (Spock equals Spock.)")
			return "tie"
			
rockMove = Rock()
paperMove = Paper()
scissorsMove = Scissors()
lizardMove = Lizard()
spockMove = Spock()
moves = [rockMove, paperMove, scissorsMove, lizardMove, spockMove] # List of instatiated moves

class player:
	def __init__(self):
		self.name = "nonameyet"
	def getName(self):
		return self.name
	def play():
		raise NotImplementedError("Not yet implemented.")

class StupidBot(player):  # This bot only plays Spock, because he's awesome.
	def __init__(self,name):
		self.name = "stupidbot"
	def play(self):
		return moves[4]

class RandomBot(player):  # This bot plays moves at random
	def __init__(self,name):
		self.name = "randombot"
	def play(self):
		return moves[randint(0,4)]

class IterativeBot(player):  # This bot plays all of the moves in order.
	def __init__(self,name,lastCycle):
		self.name = "iterativebot"
		self.lastCycle = lastCycle
	def play(self):
		if self.lastCycle >= 4:
			self.lastCycle = 0
		else:
			self.lastCycle = self.lastCycle + 1
		return moves[self.lastCycle]

class LastplayBot(player):  # This bot only plays what the opponent played last turn.
	def __init__(self,name,lastPlay):
		self.name = "lastplaybot"
		self.lastPlay = 3
	def play(self):
		return moves[self.lastPlay]
class Human(player):  # A human controlled RPSLSer
	def __init__(self,name):
		self.name = "humanplayer"
	def play(self):
		while (True):
			try:
				print("Please choose a move:\n   (1) Rock\n   (2) Paper\n   (3) Scissors")
				choice = int(input("   (4) Lizard\n   (5) Spock\n"))
				if (operator.lt(choice, 6) & operator.gt(choice, 0)):
					break
				else:
					print("Please enter a number between 1 and 5.")
			except ValueError:
				print("Please enter a number between 1 and 5.")
		return moves[choice-1]
class MyBot(player):  # This player only chooses moves that would have won last turn.
	def __init__(self,name,lastPlay):
		self.name = "mybot"
		self.lastPlay = randint(0,4)
	def play(self):
		coinFlip = randint(0,1)
		if self.lastPlay == 0:
			if coinFlip == 0:
				return moves[1]
			else:
				return moves[4]
		if self.lastPlay == 1:
			if coinFlip == 0:
				return moves[2]
			else:
				return moves[3]
		if self.lastPlay == 2:
			if coinFlip == 0:
				return moves[0]
			else:
				return moves[4]
		if self.lastPlay == 3:
			if coinFlip == 0:
				return moves[2]
			else:
				return moves[0]
		if self.lastPlay == 4:
			if coinFlip == 0:
				return moves[1]
			else:
				return moves[3]

human = Human("Derp")
stupid = StupidBot("Derp")
random = RandomBot("Derp")
iterative = IterativeBot("Derp", 0)
last = LastplayBot("Derp",4)
my = MyBot("Derp",1)
players = [human, stupid, random, iterative, last, my] # Array of instantiated players

class main():
	# Print the menu to the user.
	print("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Skylar Downes.\n")
	while (True):
		try:
			print("Please choose two players:\n   (1) Human\n   (2) StupidBot\n   (3) RandomBot")
			choice1 = int(input("   (4) IterativeBot\n   (5) LastplayBot\n   (6) MyBot\n"))
			if (operator.lt(choice1, 7) & operator.gt(choice1, 0)):
				break
			else:
				print("Please enter a number between 1 and 6.")
		except ValueError:
			print("Please enter a number between 1 and 6.")
	
	while (True):
		try:
			choice2 = int(input("Choose a second player:\n"))
			if (operator.lt(choice2, 7) & operator.gt(choice2, 0)):
				break
			else:
				print("Please enter a number between 1 and 6.")
		except ValueError:
			print("Please enter a number between 1 and 6.")
	
	# Start the game!
	print ("\n" + players[choice1-1].getName() + " vs " + players[choice2-1].getName() + "!\n")
	
	score1 = 0
	score2 = 0
	player1 = players[choice1-1]
	player2 = players[choice2-1]
	for x in range(0,5):
		print ("Round " + str(x+1) + ", Start!")
		move1 = player1.play()
		move2 = player2.play()
		print ("player 1 chose " + str(move1.getName()))
		print ("player 2 chose " + str(move2.getName()))
		result = move1.compareTo(move2.getName())
		
		if choice1 == 5:		# These if statements send the opponents previous move to the 
			player1.lastPlay = moves.index(move2)  # LastPlayBot and MyBot so they can decide what to do.
		if choice2 == 5:
			player2.lastPlay = moves.index(move1)
		if choice1 == 6:
			player1.lastPlay = moves.index(move2)
		if choice2 == 6:
			player2.lastPlay = moves.index(move1)
		
		#Print round results.	
		if result == "win":
			print("Player 1 wins the round\n")
			score1 += 1
		elif result == "lose":
			print("Player 2 wins the round\n")
			score2 += 1
		else:
			print("The round was a tie.\n")
	#Print game results.
	print ("The score is " + str(score1) + " to " + str(score2) + ".")
	if operator.gt(score1, score2):
		print (player1.getName() + " wins!")
	elif operator.gt(score2, score1):
		print (player2.getName() + " wins!")
	else:
		print ("Game was a tie.")







		