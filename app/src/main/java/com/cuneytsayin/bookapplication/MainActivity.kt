package com.cuneytsayin.bookapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.color_creator_button)?.setOnClickListener {
            var redChannelText   = findViewById<TextInputEditText>(R.id.red_channel)?.text.toString()
            var greenChannelText = findViewById<TextInputEditText>(R.id.green_channel)?.text.toString()
            var blueChannelText  = findViewById<TextInputEditText>(R.id.blue_channel)?.text.toString()


            if (redChannelText.isEmpty() or greenChannelText.isEmpty() or blueChannelText.isEmpty()) {
                
            }

        }


        /*
        findViewById<Button>(R.id.enter_button)?.setOnClickListener {
            val greetingDisplay = findViewById<TextView>(R.id.greeting_display)
            val firstName = findViewById<TextInputEditText>(R.id.redchannel)?.text.toString().trim()
            val lastName  = findViewById<TextInputEditText>(R.id.bluechannel)?.text.toString().trim()
            if (firstName.isNotEmpty() && lastName.isNotEmpty()) {
                val nameToDisplay = firstName.plus(" ").plus(lastName)
                //Use Kotlin's string templates feature to display the name
                greetingDisplay?.text = " ${getString(R.string.welcome_to_the_app)}${nameToDisplay}!"
                } else {
                Toast.makeText(this, getString(R.string.please_enter_a_name),
                    Toast.LENGTH_LONG).
                apply{
                    setGravity(Gravity.CENTER, 0, 0)
                    show()
                }
            }
        }

         */
    }

}