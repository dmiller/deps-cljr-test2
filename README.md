# deps-cljr-test2
ClojureCLR project for testing cljr git coordinates

This project is used for the test suite for the Deps.Cljr project.
It relies on the deps-cljr-test1 project to test chaining of references in deps.edn.

## Releases

Latest release: 1.0.0

[CLI/deps.edn](https://clojure.org/reference/deps_and_cli) dependency information:

```
io.github.dmiller/deps-cljr-test2 {:git/tag "v1.0.0" :git/sha "1234567"}
```

## Example usage

```
(require '[dct2.test :as t2])

(t2/f 12)
```
