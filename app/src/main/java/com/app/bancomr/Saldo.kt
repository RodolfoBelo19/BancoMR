package com.app.bancomr

import android.content.Intent
import android.graphics.Color
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.bancomr.databinding.ActivitySaldoBinding

class Saldo : AppCompatActivity() {

    private lateinit var binding: ActivitySaldoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()


        val toolbar = binding.toolbarSaldo
        toolbar.setNavigationIcon(R.drawable.ic_back)
        toolbar.title = "Saldo"
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.setNavigationOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}