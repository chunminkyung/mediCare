package com.example.medicare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.ImageView

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        SystemClock.sleep(3000) //3초 후 화면 전환
        val intent = Intent(this, MediCalendar::class.java)
        startActivity(intent) //내가 지정한 페이지로 이동
        finish()
    }
}