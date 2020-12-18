package com.miqdad71.arkademyandroidweek6.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.miqdad71.arkademyandroidweek6.R

class SimpleFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_fragment)

        var btnSwitchA = findViewById<Button>(R.id.btn_switch_a)
        var btnSwitchB = findViewById<Button>(R.id.btn_switch_b)

        btnSwitchA.setOnClickListener {
            val aFragment = FragmentA()
            supportFragmentManager.beginTransaction().replace(R.id.fl_container, aFragment).commit()
        }

        btnSwitchB.setOnClickListener {
            val bFragment = FragmentB()
            supportFragmentManager.beginTransaction().replace(R.id.fl_container, bFragment).commit()
        }

    }
}