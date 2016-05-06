# CUBLONO HTML

  [![Build Status](https://travis-ci.org/s-ted/cublono-html.svg)](https://travis-ci.org/s-ted/cublono-html)
  [![Dependencies Status](http://jarkeeper.com/cubane/cublono-html/status.svg)](http://jarkeeper.com/cubane/cublono-html)
  [![Download Status](https://jarkeeper.com/cubane/cublono-html/downloads.svg)](https://jarkeeper.com/cubane/cublono-html)

  Lisp/Hiccup style templating in [ClojureScript](https://github.com/clojure/clojurescript]) producing HTML.

## Installation

   [![Clojar link](https://clojars.org/cubane/cublono-html/latest-version.svg)](https://clojars.org/cubane/cublono-html)

## Dependencies

   *Cublono-html* depends on:
   - [cublono](https://github.com/s-ted/cublono) for the generic parsing process,
   - [hiccup](https://github.com/weavejester/hiccup) for the specific HTML generation.

## Usage

```clojure
(ns myns
  (:require [cublono-html.core :as c]))

(c/html [:div.my-class#my-id {:attr "value"} "substuff..."])
"<div class="my-class" id="my-id" attr="value">substuff...</div>"
```

See test cases for more examples.

## License

   Copyright © 2016 [Sylvain Tedoldi](https://github.com/s-ted)

   Distributed under the Eclipse Public License either version 1.0 or
   (at your option) any later version.
