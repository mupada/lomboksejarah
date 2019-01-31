package com.example.bibdev.sejarahlombok


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var  button3: Button
    lateinit var  button4: Button
    lateinit var button5: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1= findViewById(R.id.button1)
        button1.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener {
            startActivity(Intent(this,ThreeActivity::class.java))
        }

        button3 = findViewById(R.id.button3)
        button3.setOnClickListener{
            startActivity(Intent(this,AlbumActivity::class.java))
        }
        button4=findViewById(R.id.button4)
        button4.setOnClickListener{
            startActivity(Intent(this,StrukturActivity::class.java))
        }
        button5 = findViewById(R.id.button5)
        button5.setOnClickListener{
            startActivity(Intent(this,KepercayaanActivity::class.java))
        }

    }
}
