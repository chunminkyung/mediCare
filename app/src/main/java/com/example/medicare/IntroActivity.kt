package com.example.medicare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_activity)

        SystemClock.sleep(3000) //3초 후 화면 전환
        val intent=Intent(this,MediCalendar::class.java) //3초 뒤 넘어가는 페이지 지정
        startActivity(intent) //MainActivity로 이동
        finish()
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

}