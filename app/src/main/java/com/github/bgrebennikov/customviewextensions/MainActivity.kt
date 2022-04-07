package com.github.bgrebennikov.customviewextensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.bgrebennikov.customviewextensions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerMain, MainFragment.newInstance())
                .commit()
        }


    }
}