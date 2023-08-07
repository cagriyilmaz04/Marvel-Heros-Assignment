package com.example.marvelherosassignment.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marvelherosassignment.databinding.CommonRvLayoutBinding
import com.example.marvelherosassignment.model.events.Events
import com.example.marvelherosassignment.util.listener.EventsClickListener
import com.example.marvelherosassignment.util.Methods

class EventsAdapter (val list: Events, val context: Context, val listener: EventsClickListener): RecyclerView.Adapter<EventsAdapter.EventVH>() {
    class EventVH(val binding: CommonRvLayoutBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventVH{
        val binding = CommonRvLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return EventVH(binding)
    }

    override fun getItemCount(): Int {
        return list.data.results.size
    }

    override fun onBindViewHolder(holder: EventVH, position: Int) {
        Log.e("AAA",list.data.results.get(position).thumbnail.path+list.data.results.get(position).thumbnail.extension)
        with(holder.binding){
            textViewAdapter.text = list.data.results.get(position).title
            Glide.with(context)
                .load(Methods.mergeString(list.data.results.get(position).thumbnail.path,list.data.results.get(position).thumbnail.extension))
                .into(imageViewAdapter)

        }
        holder.itemView.setOnClickListener {
            listener.onClickEvents(position)
        }

    }
}