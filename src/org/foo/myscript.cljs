(ns org.foo.myscript)

(defn init []
  (js/console.log "[MYSCRIPT] Initializing myscript. Posting message ...")
  (let [worker (js/Worker. "/js/worker.js")]
    (.. worker (addEventListener "message" (fn [e]
                                             (js/console.log "[MYSCRIPT] Got message" e))))
    (.. worker (postMessage "hello world"))))
