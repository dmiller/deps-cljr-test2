(ns dct2.test
  (:require [dc1.test :as t1]))

(defn f [x] 
  (println "Managed to make it down to dct2.test/f, arg is " x)
  (println "Let's try calling out ... ")
  (t1/g x))
