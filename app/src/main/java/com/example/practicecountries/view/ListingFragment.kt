package com.example.practicecountries.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practicecountries.MyViewModelPV
import com.example.practicecountries.databinding.FragmentListingBinding

class ListingFragment : Fragment() {

    private lateinit var mBindingListing: FragmentListingBinding

    private val mInstanciaVMLF : MyViewModelPV by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBindingListing= FragmentListingBinding.inflate(layoutInflater)

        mBindingListing.rvListingCountries.layoutManager= LinearLayoutManager(context)

        val mAdapterEnlace = CountriesAdapterPV()
        mBindingListing.rvListingCountries.adapter = mAdapterEnlace

        mInstanciaVMLF.mCountriesVMEncapsulado().observe(viewLifecycleOwner, {
            mAdapterEnlace.upDateAdapter(it)
        })

        mAdapterEnlace.selectedItemGetter().observe(viewLifecycleOwner,{
            Log.d("ListingFragment","observando item clickeado $it")
        }
        )


        return mBindingListing.root
    }
}
