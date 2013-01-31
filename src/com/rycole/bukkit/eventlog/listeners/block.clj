(ns com.rycole.bukkit.eventlog.listeners.block
  (:require [clj-mixpanel.core :as mixpanel])
  (:gen-class :name com.rycole.bukkit.eventlog.listeners.block.BlockListener
              :implements [org.bukkit.event.Listener]
              :methods [[^{org.bukkit.event.EventHandler true} onBlockBreak [org.bukkit.event.block.BlockBreakEvent] void]
                        [^{org.bukkit.event.EventHandler true} onBlockPlace [org.bukkit.event.block.BlockPlaceEvent] void]]))

(def mixpanel-token "aca99527d3f43f494dd29c0c924db8ee")

(defn -onBlockBreak [this evnt]
  (mixpanel/notify mixpanel-token "Block Broken" {:distinct-id (.getPlayerListName (.getPlayer evnt))
                                                  :player-name (.getPlayerListName (.getPlayer evnt))
                                                  :block-type (.toString (.getType (.getBlock evnt)))}))

(defn -onBlockPlace [this evnt]
  (mixpanel/notify mixpanel-token "Block Placed" {:distinct-id (.getPlayerListName (.getPlayer evnt))
                                                  :player-name (.getPlayerListName (.getPlayer evnt))
                                                  :block-type (.toString (.getType (.getBlockPlaced evnt)))}))
