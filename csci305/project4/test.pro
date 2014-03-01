likes(sam,Food) :-
        indian(Food),
        mild(Food).
likes(sam,Food) :-
        chinese(Food).
likes(sam,Food) :-
        italian(Food).
likes(sam,chips).

indian(curry).
indian(dahl).
indian(tandoori).
indian(kurma).

parent(A,B) :- father(A,B).
parent(A,B) :- mother(A,B).
grandparent(C,D) :- parent(C,E), parent(E,D). 
mother(mary,sue).
mother(mary,bill).
mother(sue,nancy). 
mother(sue,jeff).
mother(jane,ron). 
father(john,sue).
father(john,bill). 
father(bob,nancy).
father(bob,jeff).
father(bill,ron). 

sibling(X,Y) :- parent(W,X), parent(W,Y), X \= Y. 
cousin(X,Y) :- parent(W,X), parent(Z,Y), sibling(W,Z), X \= Y.