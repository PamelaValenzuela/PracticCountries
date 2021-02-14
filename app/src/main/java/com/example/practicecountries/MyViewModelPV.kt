package com.example.practicecountries

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicecountries.model.RepositoryPV
import kotlinx.coroutines.launch

class MyViewModelPV: ViewModel() {

    private val mInstanciaRepositoryVM = RepositoryPV()

    init {
       Log.d("init de viewmodels","cargando la información de los paises")
        viewModelScope.launch {
            mInstanciaRepositoryVM.getCountriesRepo()
        }
    }
    fun doSomething(){

    }
}