# An event logger plugin for Bukkit

A Clojure library designed to ... log Bukkit events to Mixpanel.

## Usage

Simply clone this repository and compile using `lein uberjar`. This should install the required dependencies and create the required `jar` file, for Bukkit. Copy the `jar` file into Bukkit's plugin directory and then start the server. The plugin will be loaded.

## Class path requirements

You must include clojure, the plugins and bukkit on the class path for this to work. An example would be:

```
java -cp ~\clojure-1.4.0.jar;~\bukkit\plugins\*;~\bukkit\craftbukkit.jar org.bukkit.craftbukkit.Main
```

## License

Copyright © 2013 Ryan Cole

Distributed under the Eclipse Public License, the same as Clojure.
