(ns com.rycole.bukkit.eventlog.core
  (:require [com.rycole.bukkit.eventlog.listeners.block]
            [com.rycole.bukkit.eventlog.listeners.player])
  (:import [com.rycole.bukkit.eventlog.listeners.block.BlockListener]
           [com.rycole.bukkit.eventlog.listeners.player.PlayerListener])
  (:gen-class :name com.rycole.bukkit.eventlog.core.Main
              :extends org.bukkit.plugin.java.JavaPlugin))

(defn -onEnable [this]
  (.registerEvents (.getPluginManager (.getServer this)) (com.rycole.bukkit.eventlog.listeners.block.BlockListener.) this)
  (.registerEvents (.getPluginManager (.getServer this)) (com.rycole.bukkit.eventlog.listeners.player.PlayerListener.) this))
