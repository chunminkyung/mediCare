package com.example.medicare

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.medicare.databinding.AlertLayoutBinding
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import java.util.*

class MediAlarm:AppCompatActivity() {

    private lateinit var binding : AlertLayoutBinding
    private lateinit var picker : MaterialTimePicker
    private lateinit var calendar: Calendar
    private lateinit var alarmManager: AlarmManager
    private lateinit var pendingIntent: PendingIntent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =AlertLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        createNotificationChannel()

        binding.selectAlarmBtn.setOnClickListener {
            showTimePicker()
        }
        binding.setAlarmBtn.setOnClickListener {
            setAlarm()
        }

        binding.cancelAlarmBtn.setOnClickListener {
            cancelAlarm()
        }


    }

    private fun cancelAlarm() {
        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)

        pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

        alarmManager.cancel(pendingIntent)

        Toast.makeText(this, "알람이 취소되었습니다. ", Toast.LENGTH_LONG).show()
    }

    private fun setAlarm() {
        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)

        pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)
        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP,  calendar.timeInMillis,
            AlarmManager.INTERVAL_DAY, pendingIntent
        )
        Toast.makeText(this, "알람이 성공적으로 설정되었습니다.", Toast.LENGTH_SHORT).show()


    }

    private fun showTimePicker() {
        picker = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_12H)
            .setHour(12)
            .setMinute(0)
            .setTitleText("알람을 설정하세요.")
            .build()

        picker.show(supportFragmentManager, "medicare")

        picker.addOnPositiveButtonClickListener {
            if (picker.hour > 12) {
                binding.selectedTime.text =
                    String.format("%02d", picker.hour - 12) + ":" + String.format(
                        "%02d", picker.minute
                    ) + "PM"
            } else {
                String.format("%02d", picker.hour) + ":" + String.format(
                    "%02d", picker.minute
                ) + "AM"
            }
            calendar = Calendar.getInstance()
            calendar[Calendar.HOUR_OF_DAY] = picker.hour
            calendar[Calendar.MINUTE] = picker.minute
            calendar[Calendar.SECOND] = 0
            calendar[Calendar.MILLISECOND] = 0
        }
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name :CharSequence = "medicareReminderChannel"
            val description = "Channel for Alarm  Manager"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel("medicare", name, importance)
            channel.description = description
            val notificationManager = getSystemService(
                NotificationManager::class.java
            )
            notificationManager.createNotificationChannel(channel)
        }
    }
}