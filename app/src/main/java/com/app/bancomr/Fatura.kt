package com.app.bancomr

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.bancomr.databinding.ActivityFaturaBinding

class Fatura : AppCompatActivity() {

    private lateinit var binding: ActivityFaturaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaturaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        var toolbar = binding.toolbarFatura
        toolbar.setNavigationIcon(R.drawable.ic_back)
        toolbar.title = "Fatura"
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.setNavigationOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}