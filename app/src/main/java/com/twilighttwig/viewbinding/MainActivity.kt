package com.twilighttwig.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.twilighttwig.viewbinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnSend.setOnClickListener {
            val data = edit_text.text
            saveData(data.toString())
        }

    }

    private  fun saveData (data : String) {

        binding.textView.text = data

    }

}