(set-env! 
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]]
  :resource-paths #{"src"})

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.0.1")
(bootlaces! +version+)

(task-options!
  pom  {:project 'niclasnilsson/version-example
        :version  +version+
        :description  "Dummy lib for experimenting with dependencies."
        :url         "https://github.com/niclasnilsson/version-example"
        :scm         {:url  "https://github.com/niclasnilsson/version-example"}
        :license     {"MIT"  "http://opensource.org/licenses/mit-license.php"}}
  push {:repo "clojars" :gpg-sign false}
  )

