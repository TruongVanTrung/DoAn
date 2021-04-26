package com.example.agricultural_products_store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_login)
        text3.setOnClickListener {
            val intent: Intent = Intent(this, RegisterActivity:: class.java)
            startActivity(intent)
        }
        button_login.setOnClickListener {
            val intent: Intent = Intent(this, IndexActivity:: class.java)
        }


    }
}