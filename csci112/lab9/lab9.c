#include <stdio.h>
#include <stdlib.h>

#include "proto.h"


int main()
{
	int i;
	int numTargets;
	int target;
	int result;
	int *intArray;
	int size;
	scanf("%d", &size);
	intArray = (int*) calloc (size, sizeof(int));
	
	for (i = 0; i < size; i++) //fills the array
	{
		scanf("%d", &intArray[i]);
	}

	int bottom;
	int top;
	int middle;
	int middlePlace;

	scanf("%d", &numTargets);
	for (i=0;i<numTargets;i++) //loops throughthe search for all the targets
	{
		iteration = -1;
		bottom = 0;
		top = size-1;
		middle = intArray[(size/2) - 1];
		middlePlace = ((size/2) - 1);
		scanf("%d", &target);
		result = Binarysearch(intArray, middlePlace, size, top, middle, bottom, target);
		if (result == -1)
		{
			printf("%4d not found!\n", target);
		}
		else 
		{
			printf("%4d found at %4d during iteration %4d.\n", target, result, iteration);
		}
	}
	
	free(intArray);
	return 0;
}
