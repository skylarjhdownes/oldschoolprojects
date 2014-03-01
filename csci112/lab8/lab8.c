#import <stdio.h>
#import "proto.h"
int
main()
{
	int rightAnswers[50];
	fgetAnswers(rightAnswers);
	int sizeOne = sizeof(rightAnswers)/sizeof(int);
	double size = sizeOne;
	printf("Exam Report\nQuestion   ");
	int i;
	int j;
	int studentAnswers[50];
	int students[1000][50];
	int c;	
	for (i=1;i<=sizeOne;i++)
	{
		printf("%d  ", i);
	}
	printf("\nAnswer     ");
	for (i=1;i<=sizeOne;i++)
	{
		printf("%d  ", rightAnswers[i-1]);
	}
	printf("\nID   Score(%)\n");
	
	int numStudents;
	for(i=1;(c = fgetAnswers(studentAnswers)) != EOF;i++)
	{
	numStudents++;
		for (j=1;j<=sizeOne;j++)
		{
			students[i][j] = studentAnswers[j];
		}
	}
	double percentages[1000];
	int missed[numStudents];
	int counter;
	for(i=1;i<sizeOne;i++)
	{
	
		for(j=1;j<sizeOne;j++)
		{
			counter = 0;
			if (students[i][j] != rightAnswers[i-1])
			{
				counter++;
			}
			percentages[i-1] = ((counter / size)*100);
			missed[i-1] = counter;
		}
	}
	for (i=1;i<numStudents;i++)
	{
		printf("%d%7f\n", students[i][0], percentages[i-1]);
	}
	printf("Question   ");
	for(i=1;i<=sizeOne;i++)
	{
		printf("i  ");
	}
	printf("\nMissed by  ");
	for(i=1;i<=sizeOne;i++)
	{
		printf("%d  ", missed[i]);
	}
	return 0;
}