package com.timplifier.core.mapper

import com.timplifier.core.typealiases.Mapper

fun <T, R> Mapper<T, R>.fromToList(input: List<T>?) =
    input?.map {
        invoke(it)
    }
