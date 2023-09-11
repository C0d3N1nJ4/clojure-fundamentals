(ns side-effects.file_io
  (:require [clojure.test :refer :all]))

(def wbc-logs "
  03/22 08:51:01 INFO   :.main: *************** Coffee Agent started ***************

  03/22 08:51:01 INFO   :...locate_grinds: Specified configuration file: /u/user15/coffee.conf
  03/22 08:51:01 INFO   :.main: Using log level 511
  03/22 08:51:01 INFO   :..setwbcimage: Get WBC images rc - Operation not supported on socket.

  03/22 08:51:01 INFO   :..setwbcimage: Associate with TCP/IP image name = TCPCS
  03/22 08:51:02 INFO   :..reg_process: registering process with the system
  03/22 08:51:02 INFO   :..reg_process: attempt OS/390 registration
  03/22 08:51:02 INFO   :..reg_process: return from registration rc=0               
               ")
; Write entire string to file
(defn write-logs [filename logs] (spit filename logs))

; Read entire string from file
(defn read-logs [filename] (slurp filename))

; Write our logs to a file then read them - ensuring a match
(write-logs "coffee.log" wbc-logs)
(is (= wbc-logs (read-logs "coffee.log")))

; Write logs to file line-by-line
(with-open [writer (clojure.java.io/writer "coffee.log")]
  (doseq [line (clojure.string/split-lines wbc-logs)]
    (.write writer line)
    (.newLine writer)))

(with-open [reader (clojure.java.io/reader "coffee.log")]
  (doseq [line (line-seq reader)]
    (println line)))

