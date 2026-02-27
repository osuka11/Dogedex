package com.example.dogedex.DogList

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.dogedex.Dog
import com.example.dogedex.databinding.DogListItemBinding

class DogAdapter:ListAdapter<Dog, DogAdapter.DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {

    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    inner class DogViewHolder(val binding:DogListItemBinding):RecyclerView.ViewHolder(binding.root){

    }
}