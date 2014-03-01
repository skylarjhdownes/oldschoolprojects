#import <stdio.h>
#import "proto.h"
int
fgetAnswers(int answers[]) //int studentAnswers[])
{
	int questionTotal;
	int i = 0;
	scanf("%lf", &questionTotal);
	answers[questionTotal];
	char answer;
	for(i = 0; i < questionTotal; i++)
	{
		scanf("%c", &answer);
		answers[i] = answer;
	}
	return questionTotal;
//	int studentAnswers[][questionTotal + 1]
//	while (answer!=EOF)
//	{
//		scanf("%lf" &ID;);
//		studentAnswers[j][0];
//		for(i = 1; i <= questionTotal; i++)
//		{
//			scanf("%c", &answer);
//			studentAnswers[j][i] = answer;
//		}
//	}	
}