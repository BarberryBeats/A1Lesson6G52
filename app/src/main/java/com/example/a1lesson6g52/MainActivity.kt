package com.example.a1lesson6g52

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a1lesson6g52.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val countryList = ArrayList<Country>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        val adapter = CountryAdapter(countryList, this::onClick)
        binding.recyclerView.adapter = adapter

    }

    private fun loadData() {
        countryList.apply {
            add(Country("Kyrgyzstan", "Bishkek"))
            add(Country("United Kingdom" , "London"))
            add(Country("Kazakhstan", "Astana"))
            add(Country("Estonia", "Tallinn"))
            add(Country())
            add(Country())
            add(Country())
            add(Country())
        }

    }


    private fun onClick(position: Int){
        Toast.makeText(this, countryList[position].toString(), Toast.LENGTH_SHORT).show()
    }
}