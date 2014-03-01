#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#include "proto.h"
int i;
//less useful
// int search(int *list, int start, int stop, int find){
	// for(start;start<=stop;start++){
		// if(list[start] == find)
		// return start;
		// else if(start==stop)
		// return -1;
	// }
// }

//better search function
int search(int *list, int start, int stop, int find)   
{ 
  int current = (start+stop)/2;
  if(list[current]==find)            
    {
      return(current);
    }
  else if(start==stop)                
    {
      return(-1);
    }
  else if(list[current]<find)        
    {
      return(search(list, current+1, stop, find));
    }
  else if(list[current]>find)          
    {
      return(search(list, start, current-1, find));
    }
  else                            
    {
      printf("blarg.\n");
      return(-1);
    }
  
}

void sort(int *list, int num) 
{
  int i;
  int j;
  int lowest;
  int temp;
  for(i=0;i<num;i++)
    {
      lowest = i;
      for(j=i;j<num;j++)
	{
	  if(list[j]<list[lowest])
	    {
	      lowest = j;
	    }
	}
      temp = list[i];
      list[i]=list[lowest];
      list[lowest]=temp;
    }
}

int compare(char* first, char* second){
	int i;
	for(i=2;i<5;i++)
    {
	if(first[i]>second[i])
	{ 
		return(0);
	}
		if(second[i]>first[i])
	{ 
		return(1);
	}
    } 
	return(2);
}

void addBeg(node_t ** Head, node_t * holder){  
   node_t *temp;  
   temp=(node_t *)malloc(sizeof(node_t)); 
   strcpy(temp->classId,holder->classId);
   temp->classNumber=holder->classNumber;
   temp->credits=holder->credits;			
   if (Head == NULL)  
   {  
      *Head=temp;  
      (*Head)->linkp=NULL;  
   }  
   else  
   {  
     temp->linkp=*Head;  
     *Head=temp;  
   }  
} 

void addAt(node_t ** Head, node_t * holder){   
   node_t *temp, *prev_ptr, *cur_ptr;  
   cur_ptr=*Head;  
   if (compare(holder->classId,cur_ptr->classId)) 
       {  
	 addBeg(Head,holder);  
       }  
       else  
       { 
	 while(compare(cur_ptr->classId,holder->classId))
           {  
               prev_ptr=cur_ptr;     
               cur_ptr=cur_ptr->linkp;
	       if(cur_ptr==NULL){
		 break;
	       }
           }  
           temp=(node_t *)malloc(sizeof(node_t));
	   strcpy(temp->classId,holder->classId);
	   temp->classNumber=holder->classNumber;
	   temp->credits=holder->credits;	
           prev_ptr->linkp=temp;  
           temp->linkp=cur_ptr;  
       }  
   
}   

int delNode(node_t **Head, char *class){  
	node_t *prev_ptr, *cur_ptr;  
  
	cur_ptr=*Head;  
	while(cur_ptr != NULL)  
	{  
	if(compare(cur_ptr->classId,class) == 2)  
	{  
		if(cur_ptr==*Head)  
		{  
            *Head=cur_ptr->linkp;  
            free(cur_ptr);  
            return 0;  
        }  
        else  
        {  
            prev_ptr->linkp=cur_ptr->linkp;  
            free(cur_ptr);  
            return 0;  
        }  
    }  
    else  
	{  
		prev_ptr=cur_ptr;  
		cur_ptr=cur_ptr->linkp;  
    }  
}
return 1;  
}

void printer(idnode_t *list, int listlength){
	int i;
	node_t *temp;
	for(i=0;i<listlength;i++)
    {
		printf("%d : ",list[i].id);
		if(list[i].linkt==NULL)
	{
		printf("\n");
	}
		else
	{
		temp = list[i].linkt;
		printf("%s %d %d\n",temp->classId,temp->classNumber,temp->credits);
		while(temp->linkp!=NULL)
		{
			temp=temp->linkp;
			printf("     : %s %d %d\n",temp->classId,temp->classNumber,temp->credits);
		}
	}
    }
}
