(ns com.rycole.bukkit.eventlog.listeners.block
  (:gen-class :name com.rycole.bukkit.eventlog.listeners.block.BlockListener
              :implements [org.bukkit.event.Listener]
              :methods [[^{org.bukkit.event.EventHandler true} onBlockBreak [org.bukkit.event.block.BlockBreakEvent] void]]))

(defn -onBlockBreak [this evnt]
  (.info (org.bukkit.Bukkit/getLogger) "BLOCK BORKEN NOO"))
