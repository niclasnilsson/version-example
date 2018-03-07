# version-example

A small lib that is only useful for trying out different dependency 
features in clojure toolchains.

The only thing it provides is a function called ```ver``` that you can
call in order to check which version of the lib that has been loaded.

There are two versions pushed to clojars, 1.0.0 and 1.1.0.
There are also some commits that are only on github tha can be useful to
refer to when experimenting with git repos. See useful version information below:

```
(require '[niclasnilsson.version-example :as v])
(v/ver)  ; Will return "version 1.1.0" for example
```

## Versions


### Only on github

#### Branch 'grenen'

```
(v/ver) ; Returns "branch grenen; tag 'grenen-1'"
```

#### Clojure CLI/deps.edn:

```
niclasnilsson/version-example {:git/url "https://github.com/niclasnilsson/version-example.git"
                               :tag "grenen-1"
                               :sha "44bb94ae276d5fd137860e3d5f249fe1051ec5f1"}
```


### 1.1.0

```
(v/ver) ; Returns "version 1.1.0"
```

#### With Boot or Leiningen:

```
[niclasnilsson/version-example "1.1.0"]
```

#### Clojure CLI/deps.edn:

```
niclasnilsson/version-example {:mvn/version "1.1.0"}
```

or

```
niclasnilsson/version-example {:git/url "https://github.com/niclasnilsson/version-example.git"
                               :tag "1.0.1"
                               :sha "7e0a9c5ffc3725450daef925d826fcd6d943230f"}
```

### 1.0.0

```
(v/ver) ; Returns "version 1.0.0"
```

#### With Boot or Leiningen:

```
[niclasnilsson/version-example "1.0.0"]
```

#### Clojure CLI/deps.edn:

```
niclasnilsson/version-example {:mvn/version "1.0.0"}
```

or

```
niclasnilsson/version-example {:git/url "https://github.com/niclasnilsson/version-example.git"
                               :tag "1.0.0"
                               :sha "ac6e302c4834372cb0b07daf02c6cecf56a8a502"}
```


