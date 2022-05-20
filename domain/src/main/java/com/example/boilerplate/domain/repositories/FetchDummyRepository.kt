package com.example.boilerplate.domain.repositories

import com.example.boilerplate.domain.either.Either
import kotlinx.coroutines.flow.Flow

interface FetchDummyRepository {
    fun fetchDummies() : Flow<Either<String,DummyModel>>
}