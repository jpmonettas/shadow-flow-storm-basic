Basic template for trying FlowStorm(https://github.com/jpmonettas/flow-storm-debugger) with shadow-cljs.

## Instructions

- clone this repo, and cd into it
- make sure shadow-cljs.edn contains the latest version of `com.github.jpmonettas/flow-storm-inst`
- run `npm install` to install the packages in package.json
- on one terminal run `npx shadow-cljs watch :dev-test` to watch and compile your code
- open http://localhost:8021
- connect a repl to your process ` npx shadow-cljs cljs-repl :dev-test`
- on another run the debugger `clj -Sforce -Sdeps '{:deps {com.github.flow-storm/flow-storm-dbg {:mvn/version "3.8.3"}}}' -X flow-storm.debugger.main/start-debugger :repl-type :shadow :build-id :dev-test :port 7123`

That last command should bring the debugger UI connected to your shadow nrepl server and browser application process.

Check that the bottom right indicators are (REPL and RUNTIME) are turned on (green).

Now go to your ClojureScript repl on cljs.user and eval `(defn foo [a b] (+ a b))` 
and then call it `(foo 1 2)`

The debugger UI should show a `main` thread with activity. Double click it and you will see the call tree. Double click the node and
you can step through the function.

If everything is fine, great! you are successfully running it. Checkout the user guide for documentation on each tool https://jpmonettas.github.io/flow-storm-debugger/user_guide.html




