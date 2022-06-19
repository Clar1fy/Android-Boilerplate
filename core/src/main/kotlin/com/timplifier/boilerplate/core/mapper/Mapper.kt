package com.timplifier.boilerplate.core.mapper

import com.timplifier.boilerplate.core.typealiases.Mapper

fun <T, R> Mapper<T, R>.fromToList(input: List<T>?) =
    input?.map {
        invoke(it)
    }
