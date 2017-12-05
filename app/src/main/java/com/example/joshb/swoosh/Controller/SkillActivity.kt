package com.example.joshb.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.joshb.swoosh.Model.Player
import com.example.joshb.swoosh.R
import com.example.joshb.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false

        if (beginnerSkillBtn.isChecked == true) {
            player.skill = "beginner"
        } else {
            player.skill = ""
        }
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false

        if (ballerSkillBtn.isChecked == true) {
            player.skill = "baller"
        } else {
            player.skill = ""
        }
    }

    fun onSkillFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}
