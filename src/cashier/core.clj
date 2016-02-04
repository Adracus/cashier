(ns cashier.core
  (:require [cashier.routes :as routes])
  (:use org.httpkit.server)
  (:gen-class))

(defonce server (atom nil))

(defn stop-server []
  (when-not (nil? @server)
    (@server :timeout 100)
    (reset! server nil)))

(defn -main
  "Starts the http server"
  [& args]
  (reset! server (run-server #'routes/root {:port 8080})))
