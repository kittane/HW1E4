package com.frey.msu.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frey.msu.count.Counter
import android.widget.TextView
import android.widget.Button
import com.frey.msu.count.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var count: Counter
    private lateinit var display: TextView
    private lateinit var btn: Button
    // private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        count = Counter()
        display = binding.text1
        btn = binding.button1

        btn.setOnClickListener {
            count!!.addCount()
            display?.setText(count.getCount().toString())
        }



    }
}