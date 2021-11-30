package com.a_ches.mvp.choose

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.a_ches.mvp.R
import com.a_ches.mvp.activity.SingleActivity
import com.a_ches.mvp.mvp.UsersActivity

class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        val buttonActivity: Button = findViewById(R.id.activity)
        val onClickListener = buttonActivity.setOnClickListener {
            fun onClick(view: View?) {
                startActivity(Intent(this@ChooseActivity, SingleActivity::class.java))
            }
        }
        /* было
        findViewById(R.id.activity).setOnClickListener(object : OnClickListener() {
            fun onClick(view: View?) {
                startActivity(Intent(this@ChooseActivity, SingleActivity::class.java))
            }
        })

         */
        val buttonMvp: Button = findViewById(R.id.mvp)
        val onClickListener1 = buttonMvp.setOnClickListener {
            fun onClick(view: View?) {
                startActivity(Intent(this@ChooseActivity, UsersActivity::class.java))
            }
        }
            /*было
            findViewById(R.id.mvp).setOnClickListener(object : OnClickListener() {
                fun onClick(view: View?) {
                    startActivity(Intent(this@ChooseActivity, UsersActivity::class.java))
                }
            })

             */
    }
}