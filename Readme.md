Basic template for trying FlowStorm(http://www.flow-storm.org/) with shadow-cljs.

## Instructions

- clone this repo, and cd into it
- make sure deps.edn contains the latest version of `com.github.jpmonettas/flow-storm-inst` and `com.github.flow-storm/clojurescript`
- run `npm install` to install the packages in package.json
- `npx shadow-cljs watch :dev-test` to watch and compile your code
- `npx shadow-cljs cljs-repl :dev-test` to run a ClojureScript repl
- run the debugger UI `clj -Sforce -Sdeps '{:deps {com.github.flow-storm/flow-storm-dbg {:mvn/version "RELEASE"}}}' -X flow-storm.debugger.main/start-debugger :repl-type :shadow :build-id :dev-test :port 7123`
- open http://localhost:8021

Toggle start recording on FlowStorm's UI and then run on you cljs repl `(org.foo.myscript/factorial 5)`

You should see the recordings on the UI like in the pictures below.

![demo](./images/stepper.png)
![demo](./images/tree.png)

You can now copy the settings from this repo to your own projects and try it there.

Checkout the user guide for documentation on each tool https://jpmonettas.github.io/flow-storm-debugger/user_guide.html





