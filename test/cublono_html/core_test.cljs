;   Copyright (c)  Sylvain Tedoldi. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.
;
(ns cublono-html.core-test
  (:require-macros [cljs.test :refer [is are deftest testing]])
  (:require
    [cublono-html.core :as c]
    cljs.test))

(deftest test-change-tag-name
  (is (= "<div class=\"c\"></div>"
         (c/html [:div.a.a.b.b.c {:class "c"}]))))

(deftest test-change-tag-name-with-children
  (is (= "<div class=\"c\">childchild2</div>"
         (c/html [:div.a.a.b.b.c {:class "c"} "child" "child2"]))))

(deftest test-change-tag-name-deep
  (is (= "<div class=\"c\">child<span>deep</span></div>"
         (c/html [:div.a.a.b.b.c {:class "c"}
                       "child"
                       [:span {} "deep"]]))))
