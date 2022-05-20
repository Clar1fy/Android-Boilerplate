package com.example.boilerplate.data.remote.apis

import retrofit2.http.Body
import retrofit2.http.POST

interface DummyAuthenticationApiService {
    @POST("token")
    suspend fun authenticate(@Body) : TokenDto
}