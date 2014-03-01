#include <stdio.h>
#include <stdlib.h>
#include "proto.h"

int Binarysearch(int intArray[], int middlePlace, int size, int top, int middle, int bottom, int target)
{
	int found = 0;
	iteration++;
	if (middle == target)
	{
		found = 1;
		return middlePlace;
	}
	else if(top == bottom || middlePlace < 0 || middlePlace > (size-1) || bottom < 0 || top < 0)
	{
		found = 1;
		return -1;
	}
	else if (middle > target)
	{
		top = middlePlace-1;
		middlePlace = (bottom+(top-bottom)/2);
		middle = (intArray[middlePlace]);
	}
	else if (middle < target)
	{
		bottom = middlePlace;
		middlePlace = (bottom+(top-bottom)/2+1);
		middle = (intArray[middlePlace]);
	}
		return Binarysearch(intArray, middlePlace, size, top, middle, bottom, target);
}
