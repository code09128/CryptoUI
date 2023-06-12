package com.ezaio.cryptoappui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.ezaio.cryptoappui.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var personName = ""
    var textPassword = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initView()
    }

    private fun initView() {
        button.setOnClickListener {
            personName = editTextPersonName.text.toString()
            textPassword = editTextPassword.text.toString()

            if (personName.isEmpty() || textPassword.isEmpty()) {
                Toast.makeText(this, "please fill the login form", Toast.LENGTH_SHORT).show()
            } else if (personName == "admin" && textPassword == "admin") {
                startActivity(Intent(this,MainActivity::class.java))
            }
        }
    }
}