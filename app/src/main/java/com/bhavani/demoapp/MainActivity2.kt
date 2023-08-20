package com.bhavani.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val helloTv=findViewById<TextView>(R.id.my)
        helloTv.setOnClickListener {
            Toast.makeText(this,"welcome back",Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity ::class.java)
            startActivity(intent)


        }
    }
}