package com.app.bancomr

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.bancomr.databinding.ActivityPoupancaBinding

class Poupanca : AppCompatActivity() {

    private lateinit var binding: ActivityPoupancaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPoupancaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarPoupanca
        toolbar.setNavigationIcon(R.drawable.ic_back)
        toolbar.title = "Poupança"
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.setNavigationOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}