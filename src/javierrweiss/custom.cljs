(ns javierrweiss.custom)

;; ## Custom ClojureScript
;;
;; This namespace contains custom ClojureScript definitions used by the
;; {{raw/name}} project.

;; With the default configuration in `javierrweiss.sci-extensions`, any function
;; or var you add here will be available inside your SCI viewers as
;; `javierrweiss.custom/<fname>`.

(defn square
  "Returns the square of `x`."
  [x]
  (* x x))
 

(defn give-me-your-name
  []
  (str "My name is Javier"))
  
