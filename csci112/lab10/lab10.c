#include <stdio.h>
#include <stdlib.h>
#include "proto.h"

int main() {

int i;
int j;
int temp;
int listlength;
int numclasses;
int nummods;
int classestoMod;
int temp2;
char tempS[6];
int *unsortedList;
idnode_t *list;
node_t *holder;
node_t *found;

scanf("%d", &listlength);
unsortedList = (int *)calloc(listlength, sizeof(int));

int arrayId[listlength];


for(i=0;i<listlength;i++)
{
	scanf("%d", &temp);
	unsortedList[i]=temp;
}

list = (idnode_t*) calloc (listlength, sizeof(idnode_t));

sort(unsortedList, listlength);

for (i = 0; i < listlength; i++) 
{
	list[i].id = unsortedList[i];
	list[i].linkt = NULL;
}

scanf("%d", &numclasses);

holder = NULL;

for (i = 0; i < listlength; i++) { 
	unsortedList[i] = arrayId[i];
	node_t unsortedList[i];
}

  for(i=0;i<numclasses;i++)
    {
	scanf("%d ", &temp);
	temp = search(unsortedList, 0, listlength, temp);
	holder=(node_t *)malloc(sizeof(node_t)); 
	scanf("%s",holder->classId);
	scanf("%d",&(holder->classNumber));
	scanf("%d",&(holder->credits));
	
    if(list[temp].linkt==NULL)
	{
		addBeg(&(list[temp].linkt),holder);
	}
    else
	{
		addAt(&(list[temp].linkt),holder);
	}
    }

printer(list, listlength);

scanf("%d ",&classestoMod);
for(i=0;i<classestoMod;i++)
    {
		scanf("%s",tempS);
		if(tempS[0]=='a')
	{
		scanf("%d ", &temp);
		temp = search(unsortedList, 0, listlength, temp);
		holder=(node_t *)malloc(sizeof(node_t)); 
		scanf("%s",holder->classId);
        scanf("%d",&(holder->classNumber));
		scanf("%d",&(holder->credits));
	if(list[temp].linkt==NULL)
	    {
			addBeg(&(list[temp].linkt), holder);
	    }
	else{
			addAt(&(list[temp].linkt), holder); 
		}
	}
    else
	{
		scanf("%d", &temp);
		temp = search(unsortedList, 0, listlength, temp);
		scanf("%s", tempS);
		delNode(&(list[temp].linkt),tempS);
	}
}

printf("\nmodified\n\n");
  
printer(list, listlength);

free(list);
free(unsortedList);
return 0;
}
