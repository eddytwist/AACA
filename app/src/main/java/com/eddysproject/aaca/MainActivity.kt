package com.eddysproject.aaca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.next_activity_button)
        button.setOnClickListener{moveToNextScreen() }
    }

    private fun moveToNextScreen(){
        val intent = Intent(this, MovieDetailsActivity::class.java)
        startActivity(intent)
    }
}