(defproject cashier "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[http-kit "2.1.18"]
                 [org.clojure/clojure "1.7.0"]
                 [korma "0.4.0"]
                 [com.h2database/h2 "1.4.191"]]
  :main ^:skip-aot cashier.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
