(ns org.foo.myscript)

(defn factorial [n]
  (if (zero? n)
    1
    (* n (factorial (dec n)))))

(println "Main executed. Factorial of 5 is : " (factorial 5))
