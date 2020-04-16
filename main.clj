;PROBLEM 1
(defn sequence-to-power [n l]
  (if (= n 0)
    '()
    (concat l (sequence-to-power (- n 1) l))))

;PROBLEM 2
(defn in-L? [x]
  (if (= x '())
    true
  (if (= (first x) 'a) 
    (in-L? (rest x)
    )
    false)))


;PROBLEM 3
(defn generate-an-bn [k]
    (concat (sequence-to-power k (list 'a)) (sequence-to-power k (list 'b))
    ))

;PROBLEM 4
(def reverse (fn [l]
              (if (empty? l)
                '()
                (concat (reverse (rest l)) (list(first l))
                      ))))

(defn remove-last-element [l]
  (reverse (rest (reverse l))))

;PROBLEM 5
(defn recognize-an-bn [l]
  (if (empty? l)
    true
    (if (and (= (first l) 'a) (= (first (reverse l)) 'b))
        (recognize-an-bn (rest (remove-last-element l)))
        false  
      )))

;PROBLEM 6
(defn concat-L-A [L A]
  (if (= A '())
    '()
    (concat (list (cons (first L) (first A))) (concat-L-A L (rest A))))) 

;PROBLEM 7
(def A (list 1 2 3))
(def B (list 1 2 3))

;PROBLEM 8
(def A (list (list 5 6 7) (list 4)))
(def B (list 1 2 3))


;PROBLEM 9
(def L (list ))
