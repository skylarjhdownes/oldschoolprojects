#!/usr/bin/perl
# use warnings;
use strict;
use warnings;
######################################### 	
#    CSCI 305 - Programming Lab #1		
#										
#  Skylar Downes			
#  skylarjhdownes@gmail.com  		
#										
#########################################

my $name = "Skylar Downes";
my $title;
my $line;
my $word;
my $i;

my $testVar;
my %bigramHash;
my $range = 2;

my $input;
my @wArray;

print "CSCI Lab 1 submitted by $name\n\n";

# Checks for the argument, fail if none given
if($#ARGV != 0) {
    print STDERR "You must specify the file name as the argument.\n";
    exit 4;
}

# Opens the file and assign it to handle INFILE
open(INFILE, $ARGV[0]) or die "Cannot open $ARGV[0]: $!.\n";

# This loops through each line of the file and removes the parts we aren't 
# going to use, then stores the song titles in a hash structure (bigramhash)
while($line = <INFILE>) {
	
	$title = $line;
	$title =~ s/(.*)<SEP>(.*)<SEP>(.*)<SEP>//; # Removes the stuff before the title.
	
	$title =~ s/\((.*)//; # These remove extra stuff from the titles
	$title =~ s/\[(.*)//;
	$title =~ s/\{(.*)//;
	$title =~ s/\\(.*)//;
	$title =~ s/\/(.*)//;
	$title =~ s/_(.*)//;
	$title =~ s/-(.*)//;
	$title =~ s/:(.*)//;
	$title =~ s/"(.*)//;
	$title =~ s/`(.*)//;
	$title =~ s/\+(.*)//;
	$title =~ s/=(.*)//;
	$title =~ s/\*(.*)//;
	$title =~ s/feat.(.*)//;
	
					   # These remove unusual symbols (¿¡?!;&$@%) from the titles.
	$title =~ s/\?//g; # For some reason the inverted explanation point and 
	$title =~ s/¿//g;  # question mark are leaving odd little t-shaped things
	$title =~ s/!//g;  # behind when I remove them.
	$title =~ s/¡//g;
	$title =~ s/\.//g;
	$title =~ s/;//g;
	$title =~ s/&//g;
	$title =~ s/\$//g;
	$title =~ s/@//g;
	$title =~ s/%//g;
	
	$title = lc($title); # This makes everything lowercase.
	
	$title =~ s/(the) //g; # These remove the words the, a, an, and, or, to, of, for, and from.
	$title =~ s/(a) //g;
	$title =~ s/(an) //g;
	$title =~ s/(and) //g;
	$title =~ s/(or) //g;
	$title =~ s/(to) //g;
	$title =~ s/(of) //g;
	$title =~ s/(for) //g;
	$title =~ s/(from) //g;
	
	my @wordList;
	my $wordCount = 0;
#	print $title;

	while($title =~ m/./){
		$word = $title;
		$title =~ s/(.*? .*?)|(.*)//;
		$word =~ s/ .*//;
		chomp($word);
		push @wordList, $word;
		$wordCount++;
	}
	for ($i = 0; $i < $wordCount-1; $i++){
		if (exists $bigramHash{$wordList[$i] . "-" . $wordList[$i+1]}){
			$bigramHash{$wordList[$i] . "-" . $wordList[$i+1]}++;
		}
		else{
			$bigramHash{$wordList[$i] . "-" . $wordList[$i+1]} = 1;
		}
#		foreach $testVar (keys %bigramHash){
#			print "$testVar happens $bigramHash{$testVar} time\n";
#		}
	}
}

# print mcw("love");

print "\n\nFile parsed. Bigram model built.";

# Close the file handle
close INFILE; 

# This is meant to create song titles using the mcw function.
# using q to quit does not work, and I can't, for the life of me,
# figure out why.
do {
	print "Enter a word [Enter `q' to quit]:";
	$input = <STDIN>;
	my $query = $input;
	if ($query ne "q"){
		for ($i = 0; $i < 19; $i++){
			chomp($query);
			push @wArray, $query;
			$query = mcw($query);
		}
		for ($i = 0; $i < 19; $i++){
			print $wArray[$i] . " ";
		}
		@wArray = ();
	}
}until ($input eq "q");

# Function for finding the most common following word.
# Takes a word as input, and outputs the word that most commonly comes after.
sub mcw {
	my ($firstWord) = @_;
	my $mostCommonWords = "";
	my $commonWordCount;
	my $commonWordMatchCount;
	my $commonUniqueWordCount;
	my $commonWord;
	
	foreach $testVar (keys %bigramHash){
		if ($testVar =~ m/^($firstWord)-.*?/){
			# print "$testVar happens $bigramHash{$testVar} times\n";
			$commonWordCount += $bigramHash{$testVar};
			$commonUniqueWordCount++;
			if ($mostCommonWords ne ""){
				if ($bigramHash{$testVar} > $bigramHash{$mostCommonWords}){
					$mostCommonWords = $testVar;
				}
				elsif ($bigramHash{$testVar} == $bigramHash{$mostCommonWords}){
					
					my $randomNum = int(rand($range));
					if ($randomNum == 1){
						$mostCommonWords = $testVar;
					}
				}
			}
			else{
				$mostCommonWords = $testVar;
			}

			
		}
	}
	$commonWordMatchCount = $bigramHash{$mostCommonWords};
	$commonWord = $mostCommonWords;
	$commonWord =~ s/($firstWord)-//;
	# print "the word $firstWord matches $commonWordCount times \n";
	# print "there are $commonUniqueWordCount unique matches \n";
	# print "the most common pair was $mostCommonWords \n";
	# print "The most commonly paired word matched $commonWordMatchCount times. It was: ";
	return $commonWord;
	
}
