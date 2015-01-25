(defproject com.borkdal/clojure.utils "0.1.1-SNAPSHOT"
  :description "Clojure utilities."
  :url "https://github.com/bsvingen/clojure.utils"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :plugins [[midje-readme "1.0.6"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.3"]]}})
