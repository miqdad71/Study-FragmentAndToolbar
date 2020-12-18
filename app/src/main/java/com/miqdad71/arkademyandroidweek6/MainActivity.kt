package com.miqdad71.arkademyandroidweek6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.miqdad71.arkademyandroidweek6.toolbar.SimpleToolbarActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btn_toolbar.setOnClickListener {
        startActivity(Intent(this, SimpleToolbarActivity::class.java))
    }

    }
}