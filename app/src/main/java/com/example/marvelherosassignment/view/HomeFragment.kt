package com.example.marvelherosassignment.view

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.marvelherosassignment.Factory.MarvelViewModelFactory
import com.example.marvelherosassignment.R
import com.example.marvelherosassignment.adapter.CharactersAdapter
import com.example.marvelherosassignment.adapter.ComicsAdapter
import com.example.marvelherosassignment.adapter.EventsAdapter
import com.example.marvelherosassignment.adapter.SeriesAdapter
import com.example.marvelherosassignment.adapter.StoriesAdapter
import com.example.marvelherosassignment.characters.Character
import com.example.marvelherosassignment.comics.Comics
import com.example.marvelherosassignment.databinding.FragmentHomeBinding
import com.example.marvelherosassignment.events.Events
import com.example.marvelherosassignment.listener.*
import com.example.marvelherosassignment.repository.MarvelRepository
import com.example.marvelherosassignment.series.Series
import com.example.marvelherosassignment.service.RetrofitInstance
import com.example.marvelherosassignment.stories.Stories
import com.example.marvelherosassignment.util.Methods
import com.example.marvelherosassignment.viewmodel.MarvelViewModel


class HomeFragment : Fragment(),CharacterClickListener,ComicClickListener,SeriesClickListener,EventsClickListener,StoriesClickListener {
    private lateinit var _binding : FragmentHomeBinding
    private val binding get() = _binding
    private lateinit var viewModel: MarvelViewModel
    private val timestamp = "1"
    private val apikey = "f2c42fe5ee5b23ba455719a164fbb4e6"
    private val hash = "3f710649b1cccf9286fe7f158af411dc"
    var Character : Character ? = null
    var Comic: Comics ? = null
    var Events: Events? = null
    var Series: Series? = null
    var Stories: Stories? = null
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

    override fun onStart() {
        super.onStart()
        setStatusBarColor(requireActivity(),R.color.white)
    }
    private fun getCharacters() {
        viewModel.getCharacters(timestamp, apikey, hash)
        viewModel.characters.observe(requireActivity(), Observer { characters ->
            if (characters != null) {
                Log.e("TAG",characters.data.results.size.toString())
                val adapter = CharactersAdapter(characters,requireContext(),this)
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewCharacter.layoutManager = layoutManager
                binding.recyclerViewCharacter.adapter = adapter
                binding.recyclerViewCharacter.adapter!!.notifyDataSetChanged()
                Character = characters


            }
        })
    }

    private fun getComics() {
        viewModel.getComics(timestamp,apikey,hash)
        viewModel.comics.observe(requireActivity(), Observer { comics ->
            if (comics != null) {
                Log.e("TAG",comics.toString())
                val adapter = ComicsAdapter(comics,requireContext(),this)
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewComics.layoutManager = layoutManager
                binding.recyclerViewComics.adapter = adapter
                binding.recyclerViewComics.adapter!!.notifyDataSetChanged()
                Comic = comics
            }
        })
    }

    private fun getEvents() {
        viewModel.getEvents(timestamp,apikey,hash)
        viewModel.events.observe(requireActivity(), Observer { events ->
            if (events != null) {
                Log.e("TAG",events.toString())
                val adapter = EventsAdapter(events,requireContext(),this)
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewEvents.layoutManager = layoutManager
                binding.recyclerViewEvents.adapter = adapter
                binding.recyclerViewEvents.adapter!!.notifyDataSetChanged()
                Events = events
            }
        })

    }

    private fun getSeries() {
        viewModel.getSeries(timestamp,apikey,hash)
        viewModel.series.observe(requireActivity(), Observer { series ->
            if (series != null) {
                Log.e("TAG",series.toString())
                val adapter = SeriesAdapter(series,requireContext(),this)
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewSeries.layoutManager = layoutManager
                binding.recyclerViewSeries.adapter = adapter
                binding.recyclerViewSeries.adapter!!.notifyDataSetChanged()
                Series = series
            }
        })

    }

    private fun getStories() {
        viewModel.getSeries(timestamp,apikey,hash)
        viewModel.stroies.observe(requireActivity(), Observer { stories ->
            if (stories != null) {
                Log.e("TAG",stories.toString())
                val adapter = StoriesAdapter(stories,requireContext(),this )
                val layoutManager = GridLayoutManager(requireContext(),1,GridLayoutManager.HORIZONTAL,false)
                binding.recyclerViewStories.layoutManager = layoutManager
                binding.recyclerViewStories.adapter = adapter
                binding.recyclerViewStories.adapter!!.notifyDataSetChanged()
                Stories = stories
            }
        })

    }

    override fun onClickCharacter(position: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment()
        Methods.dataCharacters = Character?.data!!.results.get(position)
        findNavController().navigate(action)
    }

    override fun onClickComic(position: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment()
        Methods.dataComic = Comic!!.data.results.get(position)
        findNavController().navigate(action)
    }

    override fun onClickEvents(position: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment()
        Methods.dataEvents = Events!!.data.results.get(position)
        findNavController().navigate(action)
    }

    override fun onClickSeries(position: Int){
        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment()
        Methods.dataSeries = Series!!.data.results.get(position)
        findNavController().navigate(action)
    }

    override fun onClickStories(position: Int){
        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment()
        Methods.dataStories = Stories!!.data.results.get(position)
        findNavController().navigate(action)
    }
}

