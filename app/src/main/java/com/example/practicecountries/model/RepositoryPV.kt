package com.example.practicecountries.model

import android.util.Log
import com.example.practicecountries.model.remote.RetrofitClient

class RepositoryPV {

    suspend fun getCountriesRepo() {
        Log.d("FuncionaRepositoryGet","getCountries")
        val mResponseRepo = RetrofitClient.retrofitInstance().getCountriesdesdeInterface()

        if(mResponseRepo.isSuccessful) {
            mResponseRepo.body()?.let {
                Log.d("Funciona GetdeRepo", "tenemos ${it.size} paises")
            }
            } else {
            Log.d("NOfunciona repository","${mResponseRepo.errorBody()}")
        }
    }
}