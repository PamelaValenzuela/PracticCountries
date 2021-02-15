package com.example.practicecountries.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practicecountries.databinding.CountriesListItemBinding
import com.example.practicecountries.model.pojos.CountriesPojoPV

class CountriesAdapterPV: RecyclerView.Adapter<CountriesAdapterPV.ViewHolderPV>() {

    private var mCountriesListAdapter = listOf<CountriesPojoPV>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPV {

       val mBindingOCVH= CountriesListItemBinding.inflate(LayoutInflater.from(parent.context))

        return ViewHolderPV(mBindingOCVH)
    }

    override fun onBindViewHolder(holder: ViewHolderPV, position: Int) {
       val mCountryOBVH= mCountriesListAdapter[position]
        holder.bind(mCountryOBVH)
    }

    override fun getItemCount(): Int {
        return mCountriesListAdapter.size
    }

    fun upDateAdapter(pCountries: List<CountriesPojoPV>){
        mCountriesListAdapter = pCountries
        notifyDataSetChanged()
    }

    class ViewHolderPV(val mBindingOCVH: CountriesListItemBinding): RecyclerView.ViewHolder(mBindingOCVH.root) {

        fun bind(country : CountriesPojoPV) {
            mBindingOCVH.textView.text = country.name

        }
    }

}




