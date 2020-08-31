(setf x (make-array '(3 3) 
   :initial-contents '((1 2 3 ) (4 5 6) (7 8 9)))
)
(write x)

(defun afisare (i j)
(print (aref x i j))
)

(afisare 0 1)

(setq a (make-array '(2 2):displaced-to x :displaced-index-offset 5 ))
(write a)


(setf (get 'student 'age) 43)
(setf (get 'student 'cnp) '123456789)
(setf (get 'student 'anstudiu) 3)
(setf (get 'student 'ioan)  1)

(terpri)
(write (symbol-plist 'student))


(defun avrege()
(terpri)
(princ "Enter number 1: ")
(setq x (read))
(write x)
(princ "enter number 2")

(setq y (read))
(write y)
(princ "enter number 3")

(setq z (read))
(write z)
(setq avrege (/ (+ x y z) 3))
(princ "avrege: ")
(write avrege)
)

(avrege))