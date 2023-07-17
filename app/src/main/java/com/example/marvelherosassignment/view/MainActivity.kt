package com.example.marvelherosassignment.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marvelherosassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}

// 1. https://gateway.marvel.com/v1/public/characters?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc

// 2. https://gateway.marvel.com/v1/public/comics?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc

// 3. https://gateway.marvel.com/v1/public/events?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc

// 4. https://gateway.marvel.com/v1/public/series?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc

// 5. https://gateway.marvel.com/v1/public/stories?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc