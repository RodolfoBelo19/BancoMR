package com.app.bancomr

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.bancomr.databinding.ActivityTransferenciaBinding

class Transferencia : AppCompatActivity() {

    private lateinit var binding: ActivityTransferenciaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarTransferencia
        toolbar.setNavigationIcon(R.drawable.ic_back)
        toolbar.title = "Transferencia"
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.setNavigationOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}