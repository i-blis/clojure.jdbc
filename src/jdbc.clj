;; Copyright 2013 Andrey Antukh <niwi@niwi.be>
;;
;; Licensed under the Apache License, Version 2.0 (the "License")
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;;     http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

(ns jdbc
  "Alternative implementation of jdbc wrapper for clojure."
  (:require [potemkin.namespaces :refer [import-vars]]
            jdbc.core))


(import-vars
 [jdbc.core

  map->properties
  uri->dbspec
  result-set->lazyseq
  result-set->vector
  execute-statement!
  make-connection
  execute!
  get-returning-records
  is-prepared-statement?
  make-prepared-statement
  execute-prepared!
  make-query
  query
  query-first
  with-query
  with-connection])
