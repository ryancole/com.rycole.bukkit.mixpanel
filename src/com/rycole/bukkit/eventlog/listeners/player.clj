(ns com.rycole.bukkit.eventlog.listeners.player
  (:gen-class :name com.rycole.bukkit.eventlog.listeners.player.PlayerListener
              :implements [org.bukkit.event.Listener]
              :methods [[^{org.bukkit.event.EventHandler true} onPlayerLoggedIn [org.bukkit.event.player.PlayerLoginEvent] void]]))

(defn -onPlayerLoggedIn [this evnt]
  (.info (org.bukkit.Bukkit/getLogger) "PLAYER LOGGED IN"))
