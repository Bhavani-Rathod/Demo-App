package com.bhavani.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.bhavani.demoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button= findViewById<Button>(R.id.button)
        val textView=findViewById<TextView>(R.id.textView)

        textView.setOnClickListener {
            Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        }

        button.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}