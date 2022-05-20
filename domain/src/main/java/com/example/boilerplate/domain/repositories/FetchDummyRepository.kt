package com.example.boilerplate.domain.repositories

import com.example.boilerplate.domain.either.Either
import com.example.boilerplate.domain.models.DummyModel
import kotlinx.coroutines.flow.Flow

interface FetchDummyRepository {
    fun fetchDummies(): Flow<Either<String, List<DummyModel>>>
}