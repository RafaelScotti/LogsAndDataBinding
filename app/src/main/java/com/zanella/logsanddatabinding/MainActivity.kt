package com.zanella.logsanddatabinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zanella.logsanddatabinding.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil
            .setContentView<ActivityMainBinding>( this, R.layout.activity_main )


        val user = User( "Rafael", "Zanella" )

        binding.user = user
        binding.bindListener = BindListener()

    }

}
