package com.example.marvelherosassignment.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marvelherosassignment.databinding.CommonRvLayoutBinding
import com.example.marvelherosassignment.events.Events
import com.example.marvelherosassignment.series.Series
import com.example.marvelherosassignment.util.Methods

class SeriesAdapter(val list: Series, val context: Context): RecyclerView.Adapter<SeriesAdapter.SeriesVH>() {
    class SeriesVH(val binding: CommonRvLayoutBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesVH{
        val binding = CommonRvLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SeriesVH(binding)
    }

    override fun getItemCount(): Int {
        return list.data.results.size
    }

    override fun onBindViewHolder(holder: SeriesVH, position: Int) {
        Log.e("AAA",list.data.results.get(position).thumbnail.path+list.data.results.get(position).thumbnail.extension)
        with(holder.binding){
            textViewAdapter.text = list.data.results.get(position).title
            Glide.with(context)
                .load(Methods.MergeString(list.data.results.get(position).thumbnail.path,list.data.results.get(position).thumbnail.extension))
                .into(imageViewAdapter)

        }

    }
}