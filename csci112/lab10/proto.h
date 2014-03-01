#ifndef _PROTO_H
#define _PROTO_H

typedef struct node_s {
	char 				classId[6];
	int 				classNumber;
	int 				credits;
	struct node_s   	*linkp;
} node_t;

typedef struct idnode_s {
	int					id;
	node_t 	*linkt;
} idnode_t;

void sort(int *, int);
int search(int *, int, int , int);
int compare(char *, char *);
void addBeg(node_t **Head, node_t *holder);
void addAt(node_t **Head, node_t *holder);
int delNode(node_t **Head, char *);
void printer(idnode_t *list, int listlength);

#endif
