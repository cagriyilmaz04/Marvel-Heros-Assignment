package com.example.marvelherosassignment.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marvelherosassignment.characters.Character
import com.example.marvelherosassignment.comics.Comics
import com.example.marvelherosassignment.databinding.CommonRvLayoutBinding
import com.example.marvelherosassignment.listener.ComicClickListener
import com.example.marvelherosassignment.util.Methods

class ComicsAdapter(val list:Comics,val context:Context,val listener:ComicClickListener):RecyclerView.Adapter<ComicsAdapter.ComicsVH>() {
    class ComicsVH(val binding:CommonRvLayoutBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicsVH {
        val binding = CommonRvLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ComicsVH(binding)
    }

    override fun getItemCount(): Int {
        return list.data.results.size
    }

    override fun onBindViewHolder(holder: ComicsVH, position: Int) {
        Log.e("AAA",list.data.results.get(position).thumbnail.path+list.data.results.get(position).thumbnail.extension)
        with(holder.binding){
            textViewAdapter.text = list.data.results.get(position).title
            Glide.with(context)
                .load(Methods.MergeString(list.data.results.get(position).thumbnail.path,list.data.results.get(position).thumbnail.extension))
                .into(imageViewAdapter)

        }
        holder.itemView.setOnClickListener {
            listener.onClickComic(position)
        }

    }
}