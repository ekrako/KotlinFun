package com.example.kotlinfun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counterTextView = findViewById<TextView>(R.id.counterTextView)

     }

    fun resetClicked(view: View){
        counter=0
        counterTextView.text = counter.toString()

    }
    fun plusClicked(view: View){
        counter++
        counterTextView.text = counter.toString()
    }
}
