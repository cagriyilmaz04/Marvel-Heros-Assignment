package com.example.marvelherosassignment.view

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marvelherosassignment.R
import com.example.marvelherosassignment.adapter.BarAdapter
import com.example.marvelherosassignment.databinding.FragmentDetailBinding
import com.example.marvelherosassignment.util.Methods


class DetailFragment : Fragment() {
    private lateinit var _binding: FragmentDetailBinding
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(layoutInflater,container,false)
        if(Methods.dataCharacters!= null) {
            with(binding){
                textComics.text = Methods.dataCharacters!!.comics.available.toString()
                textSeries.text = Methods.dataCharacters!!.events.available.toString()
                textStories.text = Methods.dataCharacters!!.series.available.toString()
                textEvents.text = Methods.dataCharacters!!.stories.available.toString()

                if(!Methods.dataCharacters!!.description.isNullOrEmpty()){
                    textDescription.text = Methods.dataCharacters!!.description.toString()
                }
                val linearLayout = LinearLayoutManager(requireContext())
                linearLayout.orientation = RecyclerView.HORIZONTAL
                val adapter = BarAdapter(20,Methods.dataCharacters!!.comics.items.size)
                binding.recyclerComics.layoutManager = linearLayout
                binding.recyclerComics.adapter = adapter

                val linearLayoutSeries = LinearLayoutManager(requireContext())
                linearLayoutSeries.orientation = RecyclerView.HORIZONTAL
                binding.recyclerViewSeries.layoutManager = linearLayoutSeries
                val adapterComics = BarAdapter(20,Methods.dataCharacters!!.series.items.size)
                binding.recyclerViewSeries.adapter = adapterComics

                val adapterCharacters = BarAdapter(20,Methods.dataCharacters!!.stories.items.size.toInt())

                val linearLayoutCharacters = LinearLayoutManager(requireContext())
                linearLayoutCharacters.orientation = RecyclerView.HORIZONTAL
                binding.recyclerViewStories.layoutManager = linearLayoutCharacters
                binding.recyclerViewStories.adapter = adapterCharacters

                val adapterEvents = BarAdapter(20,Methods.dataCharacters!!.events.available.toInt())

                val linearLayoutEvents = LinearLayoutManager(requireContext())
                linearLayoutEvents.orientation = RecyclerView.HORIZONTAL
                binding.recyclerViewEvents.layoutManager = linearLayoutEvents
                binding.recyclerViewEvents.adapter = adapterEvents

            }

            Glide.with(this).load(Methods.mergeString(Methods.dataCharacters!!.thumbnail.path,Methods.dataCharacters!!.thumbnail.extension))
                .into(binding.image)
        }
        else if(Methods.dataComic != null) {

            binding.textConst1.text = requireContext().getString(R.string.creators)
            binding.textConst2.text = requireContext().getString(R.string.characters)
            binding.textConst3.text = requireContext().getString(R.string.stories)
            binding.textConst4.text = requireContext().getString(R.string.events)

            binding.textComics.text = Methods.dataComic!!.creators.available.toString()

            if(!Methods.dataComic!!.description.isNullOrEmpty()){
                binding.textDescription.text = Methods.dataComic!!.description.toString()
            }
            val linearLayout = LinearLayoutManager(requireContext())
            linearLayout.orientation = RecyclerView.HORIZONTAL
            val adapter = BarAdapter(20,Methods.dataComic!!.creators.available)
            binding.recyclerComics.layoutManager = linearLayout
            binding.recyclerComics.adapter = adapter

            val linearLayoutSeries = LinearLayoutManager(requireContext())
            linearLayoutSeries.orientation = RecyclerView.HORIZONTAL
            binding.recyclerViewSeries.layoutManager = linearLayoutSeries
            val adapterComics = BarAdapter(20,Methods.dataComic!!.characters.available)
            binding.recyclerViewSeries.adapter = adapterComics

            val adapterCharacters = BarAdapter(20,Methods.dataComic!!.stories.available)

            val linearLayoutCharacters = LinearLayoutManager(requireContext())
            linearLayoutCharacters.orientation = RecyclerView.HORIZONTAL
            binding.recyclerViewStories.layoutManager = linearLayoutCharacters
            binding.recyclerViewStories.adapter = adapterCharacters

            val adapterEvents = BarAdapter(20,Methods.dataComic!!.stories.available)

            val linearLayoutEvents = LinearLayoutManager(requireContext())
            linearLayoutEvents.orientation = RecyclerView.HORIZONTAL
            binding.recyclerViewEvents.layoutManager = linearLayoutEvents
            binding.recyclerViewEvents.adapter = adapterEvents

            with(binding) {
                textComics.text = Methods.dataComic?.characters?.available.toString()
                textSeries.text = Methods.dataComic?.creators?.available.toString()
                textStories.text = Methods.dataComic?.events?.available.toString()
                textEvents.text = Methods.dataComic?.stories?.available.toString()


                if(Methods.dataComic!!.description != ""){
                    binding.textDescription.text = Methods.dataComic!!.description.toString()
                }
                Glide.with(requireActivity()).load(Methods.mergeString(Methods.dataComic!!.thumbnail.path,Methods.dataComic!!.thumbnail.extension))
                    .into(image)
            }


        } else if(Methods.dataEvents != null) {
            binding.textConst1.text = requireContext().getString(R.string.creators)
            binding.textConst2.text = requireContext().getString(R.string.characters)
            binding.textConst3.text = requireContext().getString(R.string.stories)
            binding.textConst4.text = requireContext().getString(R.string.comics)


            with(binding) {

                textComics.text = Methods.dataEvents?.characters?.available.toString()
                textSeries.text = Methods.dataEvents?.creators?.available.toString()
                textStories.text = Methods.dataEvents?.series?.available.toString()
                textEvents.text =  Methods.dataEvents?.stories?.available.toString()
                if(!Methods.dataEvents!!.description.isNullOrEmpty()){
                    binding.textDescription.text = Methods.dataEvents!!.description.toString()
                }
                val linearLayout = LinearLayoutManager(requireContext())
                linearLayout.orientation = RecyclerView.HORIZONTAL
                val adapter = BarAdapter(Methods.dataEvents!!.creators.items.size+22,Methods.dataEvents!!.creators.items.size)
                binding.recyclerComics.layoutManager = linearLayout
                binding.recyclerComics.adapter = adapter

                val linearLayoutSeries = LinearLayoutManager(requireContext())
                linearLayoutSeries.orientation = RecyclerView.HORIZONTAL
                binding.recyclerViewSeries.layoutManager = linearLayoutSeries
                val adapterComics = BarAdapter(200,Methods.dataEvents!!.series.items.size)
                binding.recyclerViewSeries.adapter = adapterComics

                val adapterCharacters = BarAdapter(20,Methods.dataEvents!!.stories.items.size.toInt())

                val linearLayoutCharacters = LinearLayoutManager(requireContext())
                linearLayoutCharacters.orientation = RecyclerView.HORIZONTAL
                binding.recyclerViewStories.layoutManager = linearLayoutCharacters
                binding.recyclerViewStories.adapter = adapterCharacters

                //val adapterEvents = BarAdapter(20,Methods.dataEvents!!.events.available.toInt())

                val linearLayoutEvents = LinearLayoutManager(requireContext())
                linearLayoutEvents.orientation = RecyclerView.HORIZONTAL
                binding.recyclerViewEvents.layoutManager = linearLayoutEvents
                //binding.recyclerViewEvents.adapter = adapterEvents

                Glide.with(requireActivity()).load(Methods.mergeString(Methods.dataEvents!!.thumbnail.path,Methods.dataEvents!!.thumbnail.extension))
                    .into(image)
            }

        } else if(Methods.dataSeries != null) {
                with(binding) {
                    textComics.text = Methods.dataSeries!!.characters.available.toString()
                    textSeries.text = Methods.dataSeries!!.events.available.toString()
                    textStories.text = Methods.dataSeries!!.creators.available.toString()
                    textEvents.text = Methods.dataSeries!!.stories.available.toString()

                    if(!(Methods.dataSeries!!.description.isNullOrEmpty())) {
                    textDescription.text = Methods.dataSeries!!.description.toString()
                    }
                    Glide.with(requireActivity()).load(Methods.mergeString(Methods.dataSeries!!.thumbnail.path,Methods.dataSeries!!.thumbnail.extension))
                        .into(image)
                }
        }
        binding.imageBack.setOnClickListener {
            //requireActivity().onBackPressed()
            findNavController().popBackStack()
        }

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        setStatusBarColor(requireActivity(),R.color.primary_dark)
    }
    fun setStatusBarColor(activity: Activity, colorResId: Int) {


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window: Window = activity.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = ContextCompat.getColor(activity, colorResId)

            if (colorResId == R.color.white && Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            }

        }
    }

    override fun onPause() {
        super.onPause()
        Methods.dataCharacters = null
        Methods.dataComic = null
        Methods.dataSeries = null
        Methods.dataEvents = null
        Methods.dataStories = null
    }


}