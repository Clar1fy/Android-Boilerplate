package com.example.boilerplate.data.remote

import com.example.boilerplate.data.remote.apis.DummyAuthenticationApiService
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: NetworkFastBuilder,
    okHttp: OkHttp
) {
    private val retrofit = retrofitClient.provideRetrofit(okHttp.provideOkHttpClient())

    class AuthenticationClient @Inject constructor(
        retrofitClient: NetworkFastBuilder,
        okHttp: OkHttp
    ) {
        private val retrofit =
            retrofitClient.provideAuthenticationRetrofit(okHttp.provideOkHttpClient())
        fun provideDummyAuthenticationApiService() : DummyAuthenticationApiService = retrofit.createAnApi()

    }
}