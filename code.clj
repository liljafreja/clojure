; Given a list of integers, create a function that returns the highest product between three of those numbers.
; For example, given the list [1, 10, 2, 6, 5, 3], the highest product would be 10 * 6 * 5 = 300

(defn highest-product-of-three [numbers]
  (let [sorted (sort > numbers)
        top-three (take 3 sorted)
        top-two (take 2 sorted)
        bottom-two (take 2 (reverse sorted))
        bottom-three (take 3 (reverse sorted))]    ; Addition for all negative cases
    (max
      ; product of the top three numbers
      (reduce * top-three)
      ; product of the two highest and the lowest number (could be negative)
      (* (apply * top-two) (last sorted))
      ; product of the three lowest numbers
      (reduce * bottom-three))))                   ; Addition for all negative cases

(println (highest-product-of-three [1, 10, 2, 6, 5, 3])) ; prints 300
(println (highest-product-of-three [-10, -10, 5, 2, 0])) ; prints 500
(println (highest-product-of-three [-10, -10, -5, -2, -2])) 