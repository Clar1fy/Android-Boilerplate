package com.example.boilerplate.data.remote

import com.example.boilerplate.data.extensions.createAnApi
import com.example.boilerplate.data.remote.apis.DummyApiService
import com.example.boilerplate.data.remote.apis.DummyAuthenticationApiService
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: NetworkFastBuilder,
    okHttp: OkHttp
) {
    private val retrofit = retrofitClient.provideRetrofit(okHttp.provideOkHttpClient())
    fun provideDummyApiService(): DummyApiService = retrofit.createAnApi()

    class AuthenticationClient @Inject constructor(
        retrofitClient: NetworkFastBuilder,
        okHttp: OkHttp
    ) {
        private val retrofit =
            retrofitClient.provideAuthenticationRetrofit(okHttp.provideOkHttpClient())

        fun provideDummyAuthenticationApiService(): DummyAuthenticationApiService =
            retrofit.createAnApi()

    }
}