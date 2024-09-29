(defproject com.hyperphor/way-demo "0.1.7" 
  :description "Way"
  :url "https://shrouded-escarpment-03060-744eda4cc53f.herokuapp.com/"
  :plugins [[lein-shadow "0.4.1"]]
  :dependencies [[org.clojure/clojure "1.12.0"]
                 #_ [org.clojure/clojurescript "1.11.60"] ;Causes dep problem (→ cheshire → jackson)
                 #_ [com.google.javascript/closure-compiler-unshaded "v20230802"]

                 [com.hyperphor/way "0.1.7"]
                 ]
  :main ^:skip-aot com.hyperphor.way.demo.core
  :source-paths ["src/cljc" "src/clj" "src/cljs"] 
  :clean-targets ^{:protect false} ["target" ".shadow-cljs" "resources/public/cljs-out"]

  :profiles {:uberjar {:aot :all
                       ;; :omit-source true
                       :prep-tasks [["shadow" "release" "app"] "javac" "compile"] ;NOTE if you omit the javac compile items, :aot stops working!  "javac" "compile"
                       :resource-paths ["resources"]
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]
                       }}

  :shadow-cljs {:lein true
                :builds
                {:app {:target :browser
                       :compiler-options {:infer-externs true}
                       :output-dir "resources/public/cljs-out"
                       :asset-path "/cljs-out"         ;webserver path
                       :modules {:dev-main {:entries [com.hyperphor.way.demo.app]}}
                       :devtools {:preloads [day8.re-frame-10x.preload.react-18]}
                       :dev {:compiler-options
                             {:closure-defines
                              {re-frame.trace.trace-enabled?        true
                               day8.re-frame-10x.show-panel         false ;does not work, afaict
                               day8.re-frame.tracing.trace-enabled? true}}}}}}
  )
