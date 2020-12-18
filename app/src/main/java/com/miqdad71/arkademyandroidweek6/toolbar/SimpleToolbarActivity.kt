package com.miqdad71.arkademyandroidweek6.toolbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import com.miqdad71.arkademyandroidweek6.R
import com.miqdad71.arkademyandroidweek6.fragment.SimpleFragmentActivity

class SimpleToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_toolbar)

        var toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.simpletoolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater?.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu1 -> {
                val intent = Intent(this, SimpleFragmentActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.menu2 -> {
                Toast.makeText(this, "Menu 2", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_toast -> {
                Toast.makeText(this, "Selamat Bergadang", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}