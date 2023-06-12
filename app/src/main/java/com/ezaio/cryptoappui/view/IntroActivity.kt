package com.ezaio.cryptoappui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ezaio.cryptoappui.R
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        initView()
    }

    private fun initView() {
        imageView3.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}