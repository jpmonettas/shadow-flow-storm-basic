(ns org.foo.macros
  (:require [cljs.env :as env]))

(defmacro m [x]
  (case (get-in  @env/*compiler* [:options :optimizations])
    :advanced `(js/console.log "In advanced")
    `(js/console.log "Not advanced")))
