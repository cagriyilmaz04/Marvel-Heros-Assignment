package com.example.marvelherosassignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marvelherosassignment.characters.Character
import com.example.marvelherosassignment.databinding.CommonRvLayoutBinding
import com.example.marvelherosassignment.listener.CharacterClickListener
import com.example.marvelherosassignment.util.Methods

class CharactersAdapter(val list:Character,val context:Context,val listener:CharacterClickListener):RecyclerView.Adapter<CharactersAdapter.CharacterVH>() {
    class CharacterVH(val binding:CommonRvLayoutBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterVH {
        val binding = CommonRvLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CharacterVH(binding)
    }

    override fun getItemCount(): Int {
        return list.data.results.size
    }

    override fun onBindViewHolder(holder: CharacterVH, position: Int) {
        with(holder.binding){
            textViewAdapter.text = list.data.results.get(position).name
            Glide.with(context)
                .load(Methods.MergeString(list.data.results.get(position).thumbnail.path,list.data.results.get(position).thumbnail.extension))
                .into(imageViewAdapter)
        }
        holder.itemView.setOnClickListener {
            listener.onClickCharacter(position)
        }

    }




}