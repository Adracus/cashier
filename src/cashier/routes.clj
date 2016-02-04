(ns cashier.routes)

(defn root [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "hello HTTP!"})
