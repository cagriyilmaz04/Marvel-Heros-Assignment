package com.example.marvelherosassignment.view

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.compose.ui.text.style.TextAlign
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.marvelherosassignment.R
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
                textComics.text = Methods.dataCharacters!!.comics.items.size.toString()
                textEvents.text = Methods.dataCharacters!!.events.items.size.toString()
                textSeries.text = Methods.dataCharacters!!.series.items.size.toString()
                textStories.text = Methods.dataCharacters!!.stories.items.size.toString()
                if(!Methods.dataCharacters!!.description.isNullOrEmpty()){
                    textDescription.text = Methods.dataCharacters!!.description.toString()
                }


            }

            Glide.with(this).load(Methods.MergeString(Methods.dataCharacters!!.thumbnail.path,Methods.dataCharacters!!.thumbnail.extension))
                .into(binding.image)
        } else if(Methods.dataComic != null) {
            with(binding) {
                textEvents.text = Methods.dataComic!!.events.items.size.toString()
                textStories.text = Methods.dataComic!!.stories.items.size.toString()

                if(Methods.dataComic!!.description != ""){
                    binding.textDescription.text = Methods.dataComic!!.description.toString()
                }
                Glide.with(requireActivity()).load(Methods.MergeString(Methods.dataComic!!.thumbnail.path,Methods.dataComic!!.thumbnail.extension))
                    .into(image)
            }


        } else if(Methods.dataEvents != null) {
            with(binding) {
                textComics.text = Methods.dataEvents!!.comics.items.size.toString()
                textStories.text = Methods.dataEvents!!.stories.items.size.toString()
                textSeries.text = Methods.dataEvents!!.series.items.size.toString()
                if(!Methods.dataEvents!!.description.isNullOrEmpty()){
                    binding.textDescription.text = Methods.dataEvents!!.description.toString()
                }
                Glide.with(requireActivity()).load(Methods.MergeString(Methods.dataEvents!!.thumbnail.path,Methods.dataEvents!!.thumbnail.extension))
                    .into(image)
            }

        } else if(Methods.dataSeries != null) {
            Log.e("DENEME",Methods.dataSeries!!.comics.items.size.toString())
                with(binding) {
                    textComics.text = Methods.dataSeries!!.comics.items.size.toString()
                    textStories.text = Methods.dataSeries!!.stories.items.size.toString()
                    textStories.text = Methods.dataSeries!!.stories.items.size.toString()
                    textEvents.text = Methods.dataSeries!!.events.items.size.toString()

                    if(!(Methods.dataSeries!!.description.isNullOrEmpty())) {
                    textDescription.text = Methods.dataSeries!!.description.toString()
                    }
                    Glide.with(requireActivity()).load(Methods.MergeString(Methods.dataSeries!!.thumbnail.path,Methods.dataSeries!!.thumbnail.extension))
                        .into(image)
                }
        }
        binding.imageBack.setOnClickListener {
            requireActivity().onBackPressed()
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