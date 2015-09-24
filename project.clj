(defproject om-leafletjs "0.1.0-SNAPSHOT"
  :description "Single Page Application to demonstrate leafletjs usage with ClojureScript and Om"
  :url "http://github.com/nikos/om-leafletjs"
  :license {:name "Creative Commons Zero"
            :url  "http://creativecommons.org/publicdomain/zero/1.0/"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3211"]
                 [sablono "0.2.20"]
                 [cljs-ajax "0.3.14"]
                 [org.omcljs/om "0.8.8"]]

  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-figwheel "0.3.1"]]

  :figwheel {:nrepl-port 7888}
  :target-path "target/%s"
  :clean-targets ^{:protect false} [:target-path "out"]

  :cljsbuild {:builds [{:id           "dev"
                        :source-paths ["src"]
                        :figwheel     true
                        :compiler     {:main       om-leafletjs.core
                                       :source-map true}}
                       {:id           "prod"
                        :source-paths ["src"]
                        :compiler     {:optimizations :advanced
                                       :output-to     "target/js"}
                        :externs      ["marked.min.js"]}]})
