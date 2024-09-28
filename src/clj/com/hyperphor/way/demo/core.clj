(ns com.hyperphor.way.demo.core
  (:gen-class)
  (:require [com.hyperphor.way.server :as server]
            [com.hyperphor.way.demo.handler :as handler]
            [org.candelbio.multitool.cljcore :as ju]
            [taoensso.timbre :as log]
            [com.hyperphor.way.config :as config]
            [environ.core :as env]))

(defn -main
  [& args]
  (config/read-config "config.edn")
  (let [port (or (first args) (env/env :port) )] ;Set by Heroku
    (log/info "Starting server on port" port)
    (server/start (Integer. port) (handler/app))
    ;; Smart enough to be a no-op on server
    (ju/open-url (format "http://localhost:%s" port))
    ))

