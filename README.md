# version-example

A small lib that is only useful for trying out different dependency 
features in clojure toolchains.

The only thing it provides is a function called ```ver``` that you can
call in order to check which version of the lib that has been loaded.

```
(require '[niclasnilsson.version-example :as v])
(v/ver)  ; Will return 1.0.0 for example
```

## Versions

### 1.0.0

With Boot or Leiningen:

```
[niclasnilsson/version-example "1.0.0"]
```

Clojure CLI/deps.edn:

```
niclasnilsson/version-example {:mvn/version "1.0.0"}
```

### 1.1.0

With Boot or Leiningen:

```
[niclasnilsson/version-example "1.1.0"]
```

Clojure CLI/deps.edn:

```
niclasnilsson/version-example {:mvn/version "1.1.0"}
```

