% Skylar Downes
% CSCI 305 Lab 4

%consult('royal.pl') % This appears not to be working for me as well, I've been loading it manually  

mother(M,C):- parent(M,C), female(M).
father(F,C):- parent(F,C), male(F).
spouse(H,W):- married(H,W).
spouse(W,H):- married(H,W).
child(C,P):- parent(P,C).
daughter(C,P):- child(C,P), female(C).
son(C,P):- child(C,P), male(C).
sibling(X,Y) :- father(W,X), father(W,Y), mother(Z,X), mother(Z,Y), X \= Y. 
brother(X,Y) :- sibling(X,Y), male(X).
sister(X,Y) :- sibling(X,Y), female(X).
unclebyblood(X,Y) :- child(Y,P), brother(X,P), X \= Y, X \= P.
unclebymarriage(X,Y) :- child(Y,P), sibling(Z,P), spouse(X,Z), male(X), X \= Y, X \= P.
uncle(X,Y) :- unclebymarriage(X,Y).
uncle(X,Y) :- unclebyblood(X,Y).
auntbyblood(X,Y) :- child(Y,P), sister(X,P), X \= Y, X \= P.
auntbymarriage(X,Y) :- child(Y,P), sibling(Z,P), spouse(X,Z), female(X), X \= Y, X \= P.
aunt(X,Y) :- auntbymarriage(X,Y).
aunt(X,Y) :- auntbyblood(X,Y).
grandparent(X,Y) :- parent(P,Y), parent(X,P).
grandfather(X,Y) :- grandparent(X,Y), male(X).
grandmother(X,Y) :- grandparent(X,Y), female(X).
grandchild(X,Y) :- grandparent(Y,X).
ancestor(X,Y) :-  parent(X,Y).
ancestor(X,Y) :- parent(X,Z), ancestor(Z,Y).
descendant(X,Y) :- child(X,Y).
descendant(X,Y) :- child(X,Z), descendant(Z,Y).
older(X,Y) :- born(X,Z), born(Y,W), Z<W.
younger(X,Y) :- born(X,Z), born(Y,W), Z>W.
regentwhenborn(X,Y) :- born(Y,Z), reigned(X,W,Q), Z>W, Z<Q.

cousin(X,Y) :- parent(W,X), parent(Z,Y), sibling(W,Z), X \= Y.