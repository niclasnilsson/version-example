(set-env! 
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]]
  :resource-paths #{"src"})

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.0.1")

(task-options!
  pom  {:project 'niclasnilsson/version-example
        :version  +version+}
  )

