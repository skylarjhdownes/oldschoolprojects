#lang scheme


(define (f lst)
  ;Checks if the given list is empty (null);
  (if (null? lst)
      ;Returns an empty list;
      '()
      ;Recursively adds 1 to each element of the given list.;
      (cons (+ 1 (car lst)) (f (cdr lst)))))

(define (good-set? lst) ;Checks if a list contains only integers;
  ;Checks if the given list is empty (null);
  (if (null? lst)
      #t
      (if (integer? (car lst)) ;checks if the first piece of the list is an int;
          (good-set? (cdr lst)) ;Recurses;
          #f)))

(define (member? e list) ;Checks if the given value is in the list;
  ;Checks if the given list is empty (null);
  (if (null? list)
      #f ;Returns false;
      (if (eq? e (car list)) ;checks if the first element of the list = e; 
          #t ;Returns true;
          (member? e (cdr list))))) ;Recurses;

(define (union lst1 lst2) 
  ;Checks if the given list is empty (null);
  
  (if (null? lst1)
      lst2
      (if (member? (car lst1) lst2) 
          (union (cdr lst1) lst2) ;Recurses;
          (cons (car lst1)(union (cdr lst1) lst2)) ;Adds the current value to the list, then recurses;
          ))) 


(define (intersect lst1 lst2) 
  ;Checks if the given list is empty (null);
  (if (null? lst1)
      '()
      (if (member? (car lst1) lst2)
          (cons (car lst1)(intersect (cdr lst1) lst2)) ;Adds the current value to the list, then recurses;
          (intersect (cdr lst1) lst2)))) ;Recurses;

(f '(1 2 3 4 5 6))
(good-set? '(1 2 3 4 6))
(member? 0 '(1 2 3 4 5 6))
(member? 2 '(1 2 3 4 5 6))
(member? 1 '(1 2 3 4 5 6))
(member? 6 '(1 2 3 4 5 6))
(member? 8 '(1 2 3 4 5 6))
(member? "a" '(1 2 3 4 5 6))
(intersect '(1 9 4 30 2) '(9 4 2 55))
(intersect '(3) '(9 4 2 55))
(intersect '(9) '(9 4 2 55))
(intersect '(2 3 4 5) '(9 4 2 55))

(union '(1 9 4 30 2) '(9 4 2 55))
(union '(3) '(9 4 2 55))
(union '(9) '(9 4 2 55))
(union '(2 3 4 5) '(9 4 2 55))

(member? 'one '(1 2 3 4))
(union '(green eggs and) '(ham))
(intersect '(stewed tomatoes and macaroni) '(macaroni and cheese))