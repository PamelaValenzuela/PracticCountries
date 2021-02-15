package com.example.practicecountries.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practicecountries.databinding.FragmentDetailBinding

class DetailFragmentCountry : Fragment(){

    private lateinit var mBidingDetail : FragmentDetailBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mBidingDetail= FragmentDetailBinding.inflate(layoutInflater)


        return mBidingDetail.root
    }

}