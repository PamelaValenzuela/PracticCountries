package com.example.practicecountries.model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.practicecountries.model.pojos.CountriesPojoPV
import com.example.practicecountries.model.remote.RetrofitClient

class RepositoryPV {

    val mCountriesRepo : MutableLiveData<List<CountriesPojoPV>> = MutableLiveData()

    suspend fun getCountriesRepo() {
        Log.d("FuncionaRepositoryGet","getCountries")
        val mResponseRepo = RetrofitClient.retrofitInstance().getCountriesdesdeInterface()

        if(mResponseRepo.isSuccessful) {
            mResponseRepo.body()?.let {
                Log.d("Funciona GetdeRepo", "tenemos ${it.size} paises")
                mCountriesRepo.value = it
            }
            } else {
            Log.d("NOfunciona repository","${mResponseRepo.errorBody()}")
        }
    }
}