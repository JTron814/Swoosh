package com.example.joshb.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.joshb.swoosh.Utilities.EXTRA_LEAGUE
import com.example.joshb.swoosh.R
import com.example.joshb.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false

        if (beginnerSkillBtn.isChecked == true) {
            skill = "beginner"
        } else {
            skill = ""
        }
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false

        if (ballerSkillBtn.isChecked == true) {
            skill = "baller"
        } else {
            skill = ""
        }
    }

    fun onSkillFinishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}
