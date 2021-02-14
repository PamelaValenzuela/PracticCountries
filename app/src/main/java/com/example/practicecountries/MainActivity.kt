package com.example.practicecountries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    private val mInstaciaVMenElMain by viewModels<MyViewModelPV>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mInstaciaVMenElMain.doSomething()
    }
}