package com.example.marvelherosassignment.view

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.marvelherosassignment.R
import com.example.marvelherosassignment.databinding.ActivityMainBinding
import com.example.marvelherosassignment.listener.CharacterClickListener

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setStatusBarColor(this, R.color.white)
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
}

// 1. https://gateway.marvel.com/v1/public/characters?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc

// 2. https://gateway.marvel.com/v1/public/comics?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc

// 3. https://gateway.marvel.com/v1/public/events?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc

// 4. https://gateway.marvel.com/v1/public/series?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc

// 5. https://gateway.marvel.com/v1/public/stories?apikey=f2c42fe5ee5b23ba455719a164fbb4e6&ts=1&hash=3f710649b1cccf9286fe7f158af411dc