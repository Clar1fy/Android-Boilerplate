package com.example.boilerplate.data.remote.apis

import com.example.boilerplate.data.remote.dtos.DummyDto
import retrofit2.http.GET

interface DummyApiService {
    @GET("dummy")
    suspend fun getDummies(): List<DummyDto>
}