package com.example.marvelherosassignment.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.marvelherosassignment.Factory.MarvelViewModelFactory
import com.example.marvelherosassignment.SpacesItemDecoration
import com.example.marvelherosassignment.adapter.CharactersAdapter
import com.example.marvelherosassignment.adapter.ComicsAdapter
import com.example.marvelherosassignment.adapter.EventsAdapter
import com.example.marvelherosassignment.adapter.SeriesAdapter
import com.example.marvelherosassignment.adapter.StoriesAdapter
import com.example.marvelherosassignment.databinding.FragmentHomeBinding
import com.example.marvelherosassignment.repository.MarvelRepository
import com.example.marvelherosassignment.service.RetrofitInstance
import com.example.marvelherosassignment.viewmodel.MarvelViewModel


class HomeFragment : Fragment() {
    private lateinit var _binding : FragmentHomeBinding
    private val binding get() = _binding
    private lateinit var viewModel: MarvelViewModel
    private val timestamp = "1"
    private val apikey = "f2c42fe5ee5b23ba455719a164fbb4e6"
    private val hash = "3f710649b1cccf9286fe7f158af411dc"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val repository = MarvelRepository(RetrofitInstance.instance)
        val viewModelFactory = MarvelViewModelFactory(repository)

        viewModel = ViewModelProvider(this, viewModelFactory).get(MarvelViewModel::class.java)


        getCharacters()
        getComics()
        getEvents()
        getSeries()
        getStories()

    }

    private fun getCharacters() {
        viewModel.getCharacters(timestamp, apikey, hash)
        viewModel.characters.observe(requireActivity(), Observer { characters ->
            if (characters != null) {
                Log.e("TAG",characters.data.results.size.toString())
                val adapter = CharactersAdapter(characters,requireContext())
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewCharacter.layoutManager = layoutManager
                binding.recyclerViewCharacter.adapter = adapter
                binding.recyclerViewCharacter.adapter!!.notifyDataSetChanged()

            }
        })
    }

    private fun getComics() {
        viewModel.getComics(timestamp,apikey,hash)
        viewModel.comics.observe(requireActivity(), Observer { comics ->
            if (comics != null) {
                Log.e("TAG",comics.toString())
                val adapter = ComicsAdapter(comics,requireContext())
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewComics.layoutManager = layoutManager
                binding.recyclerViewComics.adapter = adapter
            }
        })
    }

    private fun getEvents() {
        viewModel.getEvents(timestamp,apikey,hash)
        viewModel.events.observe(requireActivity(), Observer { events ->
            if (events != null) {
                Log.e("TAG",events.toString())
                val adapter = EventsAdapter(events,requireContext())
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewEvents.layoutManager = layoutManager
                binding.recyclerViewEvents.adapter = adapter
            }
        })

    }

    private fun getSeries() {
        viewModel.getSeries(timestamp,apikey,hash)
        viewModel.series.observe(requireActivity(), Observer { series ->
            if (series != null) {
                Log.e("TAG",series.toString())
                val adapter = SeriesAdapter(series,requireContext())
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewSeries.layoutManager = layoutManager
                binding.recyclerViewSeries.adapter = adapter
            }
        })

    }

    private fun getStories() {
        viewModel.getSeries(timestamp,apikey,hash)
        viewModel.stroies.observe(requireActivity(), Observer { stories ->
            if (stories != null) {
                Log.e("TAG",stories.toString())
                val adapter = StoriesAdapter(stories,requireContext())
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewStories.layoutManager = layoutManager
                binding.recyclerViewStories.adapter = adapter
            }
        })

    }
}

