package com.example.ktmedicare

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.medicare.MainMenuMediCalendarFragment
import com.example.medicare.MediAlarm
import com.example.medicare.R

class MediAdd : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medi_add)

        val medi_name : EditText = findViewById(R.id.medi_name)
        val medi_regi : Button = findViewById(R.id.btn_regi)
        val toolbar_back : ImageView = findViewById(R.id.toolbar_back)
        val btn_add : Button = findViewById(R.id.btn_add)

        //checkBox -> 요일
        val checkMonday = findViewById<CheckBox>(R.id.checkMon)
        val checkTuesday = findViewById<CheckBox>(R.id.checkTue)
        val checkWednesday = findViewById<CheckBox>(R.id.checkWed)
        val checkThursday = findViewById<CheckBox>(R.id.checkThu)
        val checkFriday = findViewById<CheckBox>(R.id.checkFri)
        val checkSaturday = findViewById<CheckBox>(R.id.checkSat)
        val checkSunday = findViewById<CheckBox>(R.id.checkSun)

        checkMonday.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "월요일", Toast.LENGTH_SHORT).show()
            }
        }
        checkTuesday.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "화요일", Toast.LENGTH_SHORT).show()
            }
        }
        checkWednesday.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "수요일", Toast.LENGTH_SHORT).show()
            }
        }
        checkThursday.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "목요일", Toast.LENGTH_SHORT).show()
            }
        }
        checkFriday.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "금요일", Toast.LENGTH_SHORT).show()
            }
        }
        checkSaturday.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "토요일", Toast.LENGTH_SHORT).show()
            }
        }
        checkSunday.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "일요일", Toast.LENGTH_SHORT).show()
            }
        }

        //checkBox -> 시간
        /*
        val checkAm8 = findViewById<CheckBox>(R.id.am8)
        val checkAm11 = findViewById<CheckBox>(R.id.am11)
        val checkPm1 = findViewById<CheckBox>(R.id.pm1)
        val checkPm3 = findViewById<CheckBox>(R.id.pm3)
        val checkPm5 = findViewById<CheckBox>(R.id.pm5)
        val checkPm7 = findViewById<CheckBox>(R.id.pm7)
        val checkPm9 = findViewById<CheckBox>(R.id.pm9)
        val checkPm10 = findViewById<CheckBox>(R.id.pm10)
        val checkPm11 = findViewById<CheckBox>(R.id.pm11)

        checkAm8.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "8시", Toast.LENGTH_SHORT).show()
            }
        }
        checkAm11.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "11시", Toast.LENGTH_SHORT).show()
            }
        }
        checkPm1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "13시", Toast.LENGTH_SHORT).show()
            }
        }
        checkPm3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "15시", Toast.LENGTH_SHORT).show()
            }
        }
        checkPm5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "17시", Toast.LENGTH_SHORT).show()
            }
        }
        checkPm7.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "19시", Toast.LENGTH_SHORT).show()
            }
        }
        checkPm9.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "21시", Toast.LENGTH_SHORT).show()
            }
        }
        checkPm10.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "22시", Toast.LENGTH_SHORT).show()
            }
        }

        checkPm11.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "23시", Toast.LENGTH_SHORT).show()
            }
        }
 */


        val secondIntent = Intent(this, MediAlarm::class.java)

        medi_regi.setOnClickListener{
           startActivity(secondIntent)
        }

        val intent = Intent(this,MediList::class.java)

        btn_add.setOnClickListener{
            startActivity(intent)
            Toast.makeText(applicationContext,"약 등록이 완료되었습니다.",Toast.LENGTH_SHORT).show();
        }
/*
        toolbar_back.setOnClickListener{
        val intent = Intent(this,MainMenuMediCalendarFragment::class.java)
        startActivity(intent)
        }

 */
    }
}