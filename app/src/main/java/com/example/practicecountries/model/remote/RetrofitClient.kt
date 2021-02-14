package com.example.practicecountries.model.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {
        private const val BASE_URL =  "https://restcountries.eu/rest/v2/"

        fun retrofitInstance(): CountriesAPIPV{
            val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(CountriesAPIPV::class.java)
        }
    }
}
