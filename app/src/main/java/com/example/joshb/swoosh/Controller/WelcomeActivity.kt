package com.example.joshb.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.joshb.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val leaguetIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leaguetIntent)
        }
    }
}
