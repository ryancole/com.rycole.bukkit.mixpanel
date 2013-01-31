(ns com.rycole.bukkit.eventlog.listeners.player
  (:require [clj-mixpanel.core :as mixpanel])
  (:gen-class :name com.rycole.bukkit.eventlog.listeners.player.PlayerListener
              :implements [org.bukkit.event.Listener]
              :methods [[^{org.bukkit.event.EventHandler true} onPlayerJoin [org.bukkit.event.player.PlayerJoinEvent] void]
                        [^{org.bukkit.event.EventHandler true} onPlayerQuit [org.bukkit.event.player.PlayerQuitEvent] void]]))

(def mixpanel-token "aca99527d3f43f494dd29c0c924db8ee")

(defn -onPlayerJoin [this evnt]
  (mixpanel/notify mixpanel-token "Player Joined" {:distinct-id (.getPlayerListName (.getPlayer evnt))
                                                   :player-name (.getPlayerListName (.getPlayer evnt))}))

(defn -onPlayerQuit [this evnt]
  (mixpanel/notify mixpanel-token "Player Quit" {:distinct-id (.getPlayerListName (.getPlayer evnt))
                                                 :player-name (.getPlayerListName (.getPlayer evnt))}))
