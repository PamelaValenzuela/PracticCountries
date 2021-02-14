package com.example.practicecountries

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicecountries.model.RepositoryPV
import com.example.practicecountries.model.pojos.CountriesPojoPV
import kotlinx.coroutines.launch

class MyViewModelPV: ViewModel() {

    private val mInstanciaRepositoryVM = RepositoryPV()

    private val mCountriesVM = mInstanciaRepositoryVM.mCountriesRepo


        init {
       Log.d("init de viewmodels","cargando la información de los paises")
        viewModelScope.launch {
            mInstanciaRepositoryVM.getCountriesRepo()
                                }
            }

    fun doSomething(){

                    }
    fun mCountriesVMEncapsulado(): LiveData<List<CountriesPojoPV>> = mCountriesVM
}