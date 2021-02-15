package com.example.practicecountries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.practicecountries.view.ListingFragment

class MainActivity : AppCompatActivity() {

    private val mInstaciaVMenElMain by viewModels<MyViewModelPV>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mInstaciaVMenElMain.doSomething()

        mInstaciaVMenElMain.mCountriesVMEncapsulado().observe(this,{
            Log.d("MainActiviy Probado", " hasta aqui se pueden ver los paises que son ${it.size}")
        })

        supportFragmentManager.beginTransaction().add(R.id.fragmentcontainer, ListingFragment()).commit()
    }
}