![travis-ci.org](https://travis-ci.org/bsvingen/clojure.utils.svg?branch=master)  

# clojure.utils

A collection of Clojure utilities.

## Usage

Leiningen coordinate:

```clj
[com.borkdal/clojure.utils "0.1.0"]
```

## Examples

### `non-empty-string?`

```clojure
(non-empty-string? "yes") => true

(non-empty-string? :no) => false

(non-empty-string? nil) => false
```

### `substring?`

```clojure
(substring? "cd" "abcdef") => true

(substring? "xxx" "abcdef") => false
```

### `to-int`

```clojure
(to-int "7") => 7
```

### `not-nil?`

```clojure
(not-nil? 7) => true

(not-nil? nil) => false
```

### `spaced-str`

```clojure
(spaced-str "abc" nil 7 "ghi") => "abc 7 ghi"
```

### `when-seq-let`

```clojure
(when-seq-let [seq nil]
  :yes) => nil

(when-seq-let [seq '()]
  :yes) => nil

(when-seq-let [seq '(1 2 3)]
  :yes) => :yes
```

