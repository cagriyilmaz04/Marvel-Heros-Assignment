package com.example.marvelherosassignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelherosassignment.R
import com.example.marvelherosassignment.databinding.AttributeBarBinding


class BarAdapter (val maxValue: Int, var value: Int) : RecyclerView.Adapter<BarAdapter.AttributeVH>() {
    val ITEM_COUNT = 50

    class AttributeVH(val binding: AttributeBarBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttributeVH {
        val binding = AttributeBarBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AttributeVH(binding)
    }

    override fun getItemCount(): Int {
        return ITEM_COUNT
    }

    override fun onBindViewHolder(holder: AttributeVH, position: Int) {

        var x = maxValue + maxValue* 0.2
        var y = x/ITEM_COUNT
        var z = (value/y).toInt()

        if(value==0){
            holder.binding.imageView.setImageResource(R.drawable.bar_8dp)
            holder.binding.imageView.alpha= 0.25f
        }
        else if(position < z){
            holder.binding.imageView.setImageResource(R.drawable.bar_8dp)
        }else if(z == position){

            holder.binding.imageView.setImageResource(R.drawable.bar_12dp)
        }else{
            holder.binding.imageView.setImageResource(R.drawable.bar_8dp)
            holder.binding.imageView.alpha= 0.25f
        }

    }


}
