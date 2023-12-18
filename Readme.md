Basic template for trying FlowStorm(https://github.com/jpmonettas/flow-storm-debugger) with shadow-cljs.

## Instructions

- clone this repo, and cd into it
- make sure deps.edn contains the latest version of `com.github.jpmonettas/flow-storm-inst` and `com.github.flow-storm/clojurescript`
- run `npm install` to install the packages in package.json
- on one terminal run `npx shadow-cljs watch :dev-test` to watch and compile your code
- open http://localhost:8021
- on two other terminals start the debugger instances 
  - For the myscript : `clj -Sforce -Sdeps '{:deps {com.github.flow-storm/flow-storm-dbg {:mvn/version "RELEASE"}}}' -X flow-storm.debugger.main/start-debugger :repl-type :shadow :build-id :dev-test :port 7123 :ws-port 7722`
  - For the worker   : `clj -Sforce -Sdeps '{:deps {com.github.flow-storm/flow-storm-dbg {:mvn/version "RELEASE"}}}' -X flow-storm.debugger.main/start-debugger :repl-type :shadow :build-id :dev-test :port 7123 :ws-port 7733`




