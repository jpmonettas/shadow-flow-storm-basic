(ns org.foo.worker)

(defn init []
  (js/console.log "[WORKER] Initializing worker.")
  (js/self.addEventListener "message"
                            (fn [^js e]
                              (js/console.log "[WORKER] Got message, echoing back ...")
                              (js/postMessage (.. e -data)))))
