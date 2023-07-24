package com.example.marvelherosassignment.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marvelherosassignment.databinding.CommonRvLayoutBinding
import com.example.marvelherosassignment.listener.StoriesClickListener
import com.example.marvelherosassignment.series.Series
import com.example.marvelherosassignment.stories.Stories
import com.example.marvelherosassignment.util.Methods

class StoriesAdapter (val list: Stories, val context: Context,val listener:StoriesClickListener): RecyclerView.Adapter<StoriesAdapter.StoriesVH>() {
    class StoriesVH(val binding: CommonRvLayoutBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesVH{
        val binding = CommonRvLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return StoriesVH(binding)
    }

    override fun getItemCount(): Int {
        return list.data.results.size
    }

    override fun onBindViewHolder(holder: StoriesVH, position: Int) {
       // Log.e("AAA",list.data.results.get(position).thumbnail.path+list.data.results.get(position).thumbnail.extension)
       /*
        with(holder.binding){
            textViewAdapter.text = list.data.results.get(position).title
            Glide.with(context)
                .load(Methods.MergeString(list.data.results.get(position).thumbnail.path,list.data.results.get(position).thumbnail.extension))
                .into(imageViewAdapter)

        }

        */
        holder.itemView.setOnClickListener {
            listener.onClickStories(position)
        }

    }
}