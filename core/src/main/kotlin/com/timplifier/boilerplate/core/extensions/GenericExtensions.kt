package com.timplifier.boilerplate.core.extensions

inline fun <reified T : Any> T.className(): String = this::class.java.simpleName