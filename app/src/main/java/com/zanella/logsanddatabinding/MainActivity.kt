package com.zanella.logsanddatabinding

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zanella.logsanddatabinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil
            .setContentView<ActivityMainBinding>( this, R.layout.activity_main )



        val user = User( "Rafael", "Zanella" )

        binding.user = user
    }

    fun goToUserActivity(view: View){
        val intent = Intent(this, User::class.java)
        startActivity(intent)
    }


}
