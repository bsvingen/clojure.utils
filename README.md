[![travis-ci.org](https://travis-ci.org/bsvingen/clojure.utils.svg?branch=master)](https://travis-ci.org/bsvingen/clojure.utils)

[![Examples tested with midje-readme](http://img.shields.io/badge/readme-tested-brightgreen.svg)](https://github.com/boxed/midje-readme)

# clojure.utils

A collection of Clojure utilities.

## Usage

Leiningen coordinate:

```clj
[com.borkdal/clojure.utils "0.1.0"]
```

## Examples

### Checking for non-empty string

```clojure
(non-empty-string? "yes") => true

(non-empty-string? :no) => false

(non-empty-string? nil) => false
```

### Checking for substring

```clojure
(substring? "cd" "abcdef") => true

(substring? "xxx" "abcdef") => false
```

### Converting to int

```clojure
(to-int "7") => 7
```

### Checking not nil

```clojure
(not-nil? 7) => true

(not-nil? nil) => false
```

### Joining non-nil strings with spaces

```clojure
(spaced-str "abc" nil 7 "ghi") => "abc 7 ghi"
```

### when-let for non-empty sequences

```clojure
(when-seq-let [seq nil]
  :yes) => nil

(when-seq-let [seq '()]
  :yes) => nil

(when-seq-let [seq '(1 2 3)]
  :yes) => :yes
```

