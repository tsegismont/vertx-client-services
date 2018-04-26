package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.BlockingQueryOptions

fun BlockingQueryOptions(
  index: Long? = null,
  wait: String? = null): BlockingQueryOptions = io.vertx.ext.consul.BlockingQueryOptions().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (wait != null) {
    this.setWait(wait)
  }
}

