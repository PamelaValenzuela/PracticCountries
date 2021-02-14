package com.example.practicecountries.model.remote

import com.example.practicecountries.model.pojos.CountriesPojoPV
import retrofit2.Response
import retrofit2.http.GET

interface CountriesAPIPV {


    @GET("all")
    suspend fun getCountriesdesdeInterface(): Response<List<CountriesPojoPV>>

}