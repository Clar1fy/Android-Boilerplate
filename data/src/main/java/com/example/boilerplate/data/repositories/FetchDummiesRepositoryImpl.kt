package com.example.boilerplate.data.repositories

import com.example.boilerplate.data.repositories.base.BaseRepositoryImpl
import com.example.boilerplate.domain.repositories.FetchDummyRepository

class FetchDummiesRepositoryImpl : BaseRepositoryImpl(), FetchDummyRepository {
    override fun fetchDummies() = sendRequest {
        fetchDummies().toDomain()
    }
}