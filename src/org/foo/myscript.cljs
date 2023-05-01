(ns org.foo.myscript
  (:require-macros [org.foo.macros :as m]))

(defn factorial [n]
  (if (zero? n)
    1
    (* n (factorial (dec n)))))

(js/console.log "Factorial of 5 is :" (m/m (factorial 5)))
