(ns side-effects.db
   (:require [clojure.java.jdbc :as sql]))


(def connection-info { 
  :subprotocol "postgresql"
  :subname "//127.0.0.1:5431/wbc"
  :user "postgres"
  :password "" })

(println (sql/query connection-info
                    ["SELECT * FROM coffee"]
                    ))

(sql/insert!
 connection-info 
 :coffee
 {:uuid (java.util.UUID/randomUUID)
  :name "Wired Brain"
  :kind "French Roast"
  :price 2.99})


(println (sql/query connection-info
                    ["DELETE FROM coffee *"]))

