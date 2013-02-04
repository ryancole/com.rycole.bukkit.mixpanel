(ns com.rycole.bukkit.mixpanel.core
  (:require [com.rycole.bukkit.mixpanel.listeners.block]
            [com.rycole.bukkit.mixpanel.listeners.player])
  (:import [com.rycole.bukkit.mixpanel.listeners.block.BlockListener]
           [com.rycole.bukkit.mixpanel.listeners.player.PlayerListener])
  (:gen-class :name com.rycole.bukkit.mixpanel.core.Main
              :extends org.bukkit.plugin.java.JavaPlugin))

(defn -onEnable [this]
  (let [plugin-manager (.getPluginManager (.getServer this))]
    (.registerEvents plugin-manager (new com.rycole.bukkit.mixpanel.listeners.block.BlockListener this) this)
    (.registerEvents plugin-manager (new com.rycole.bukkit.mixpanel.listeners.player.PlayerListener this) this)))
