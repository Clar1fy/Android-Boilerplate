package com.example.boilerplate.data.repositories

import com.example.boilerplate.data.remote.apis.DummyApiService
import com.example.boilerplate.data.remote.dtos.toDomain
import com.example.boilerplate.data.repositories.base.BaseRepositoryImpl
import com.example.boilerplate.domain.repositories.FetchDummyRepository
import javax.inject.Inject

class FetchDummiesRepositoryImpl @Inject constructor(
    private val dummyApiService: DummyApiService
) : BaseRepositoryImpl(), FetchDummyRepository {
    override fun fetchDummies() = sendRequest {
        dummyApiService.getDummies().map { it.toDomain() }
    }
}