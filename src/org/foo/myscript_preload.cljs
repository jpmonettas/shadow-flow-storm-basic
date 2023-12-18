(ns org.foo.myscript-preload
  (:require [cljs.storm.tracer]
            [flow-storm.tracer :as tracer]
            [flow-storm.runtime.debuggers-api :as dbg-api]))

(tracer/hook-clojurescript-storm)
(dbg-api/setup-runtime)
(dbg-api/remote-connect {:debugger-ws-host "localhost" :debugger-ws-port 7722})
