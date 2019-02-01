(ns showcase.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/showcase/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(def app-state (atom {}))

(defn navbar-component []
  [:nav
   [:a {:href "#"} "About"]
   [:a {:href "#"} "Projects"]
   [:a {:href "#"} "Contact"]
   [:a.social {:href "#"} "Github"]
   [:a.social {:href "#"} "LinkedIn"]])


(defn main-component []
  [:div
   (navbar-component)])

(reagent/render-component [main-component]
                          (. js/document (getElementById "app")))

(defn on-js-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
