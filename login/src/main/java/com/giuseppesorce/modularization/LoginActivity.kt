package com.giuseppesorce.modularization

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title="LOGIN"

        btHome.setOnClickListener {

            var host= resources.getString(R.string.gs_home)
            var scheme= resources.getString(R.string.appscheme)
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("$scheme://$host"))
            startActivity(intent)
            finish()

        }

        btStart.setOnClickListener {

            var host= resources.getString(R.string.gs_start)
            var scheme= resources.getString(R.string.appscheme)
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("$scheme://$host"))
            startActivity(intent)
            finish()

        }
    }



}
