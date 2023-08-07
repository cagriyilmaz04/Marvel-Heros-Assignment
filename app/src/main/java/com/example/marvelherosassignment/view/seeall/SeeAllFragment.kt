package com.example.marvelherosassignment.view.seeall

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.marvelherosassignment.R
import com.example.marvelherosassignment.databinding.FragmentSeeAllBinding
import com.example.marvelherosassignment.util.Type


class SeeAllFragment : Fragment() {
    private lateinit var _binding:FragmentSeeAllBinding
    private val binding get() = _binding
    val args: SeeAllFragmentArgs by navArgs()
    var value = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSeeAllBinding.inflate(layoutInflater,container,false)

        when(args.type){
            Type.CHARACTERS -> {
                value = "ALL CHARACTERS"
            }
            Type.COMICS-> {
                value = "ALL COMICS"
            }
            Type.EVENTS -> {
                value = "ALL EVENTS"
            }
            Type.SERIES -> {
                value = "ALL SERIES"
            }
            Type.STORIES -> {
                value = "ALL STORIES"
            }

        }
        binding.textView.text = value
        return binding.root
    }

}