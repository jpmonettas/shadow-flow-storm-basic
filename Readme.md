Basic template for trying FlowStorm(https://github.com/jpmonettas/flow-storm-debugger) with shadow-cljs.

## Instructions

- clone this repo, and cd into it
- make sure shadow-cljs.edn contains the latest version of `com.github.jpmonettas/flow-storm-inst`
- run `npm install` to install the packages in package.json
- on one terminal run `npx shadow-cljs watch :dev-test` to watch and compile your code
- open http://localhost:8000
- connect a repl to your process `npx shadow-cljs cljs-repl :dev-test`
- on another run the debugger `clj -Sforce -Sdeps '{:deps {com.github.jpmonettas/flow-storm-dbg {:mvn/version "RELEASE"}}}' -X flow-storm.debugger.main/start-debugger :repl-type :shadow :build-id :dev-test :port 7123`

That last command should bring the debugger UI connected to your shadow nrepl server and browser application process.

Check that the bottom right indicators are (REPL and RUNTIME) are turned on (green).

Now go to your ClojureScript repl and eval `#rtrace (+ 1 2 (* 3 4))` to run some instrumented code.

The debugger UI should show a tab under Flows. Double click the main thread so it opens the thread explorer and then
click on the bottom left tab that contains the `()` icon. You should see the traced form there.
Use the controls to step back and forth.

Check out the FlowStorm browser. Look for the tab called Browser on your left margin. 
Single click on namespaces and vars to check everything is working.

If everything is fine, great! you are successfully running it. Checkout the user guide for documentation on each tool https://jpmonettas.github.io/flow-storm-debugger/user_guide.html




