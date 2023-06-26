package com.example.a1lesson6g52

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.a1lesson6g52.databinding.ItemCountryBinding

class CountryAdapter(
   val countryList: ArrayList<Country>,
   val onClick: (position: Int) -> Int
    ): Adapter<CountryAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = countryList.size


    inner class ViewHolder(private val binding: ItemCountryBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = countryList[adapterPosition]

            itemView.setOnClickListener {
                onClick(adapterPosition)
            }

            binding.apply {
                tvCountry.text = item.name
                tvCapital.text = item.capital
                imgFlag.loadImage("data:image/png;base64,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")
            }
        }
    }

}