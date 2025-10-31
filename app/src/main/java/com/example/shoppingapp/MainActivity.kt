package com.example.shoppingapp

import android.os.Bundle
<<<<<<< HEAD
import android.util.Log
=======
>>>>>>> 021601a8a68b9533d2f7f0394c9032b831da21d8
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
<<<<<<< HEAD

        }
        Log.d("TAG", "onCreate: "+"sdnfsnf");
=======
        }
>>>>>>> 021601a8a68b9533d2f7f0394c9032b831da21d8
    }
}