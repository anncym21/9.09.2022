package com.example.zad1

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//https://developer.android.com/develop/ui/views/layout/declaring-layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity:MainActivity = MainActivity()

        val button = findViewById<Button>(R.id.tak)
        var clicks = 0
        button.setOnClickListener {
            clicks += 1

            when(clicks){
                button.setTypeface(Typeface.SANS_SERIF)
                        button.text = "Sans Sherif"

            }
        }

        close = findViewById<Button>(R.id.close)

        close.SetOnClickListener{
            activity.finish()

            System.exit(0)
        }
    }
}