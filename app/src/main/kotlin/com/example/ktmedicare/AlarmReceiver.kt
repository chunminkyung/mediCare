package com.example.medicare

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat


class AlarmReceiver :BroadcastReceiver() {

//    private  lateinit var binding: ActivityMainBinding

    override fun onReceive(context: Context?, intent: Intent?) {

        val i = Intent(context, MediAlarm::class.java)
        intent!!.flags = Intent.FLAG_ACTIVITY_NEW_TASK  or Intent.FLAG_ACTIVITY_CLEAR_TASK
        val pendingIntent = PendingIntent.getActivity(context, 0, i, 0)

        val builder = NotificationCompat.Builder(context!!, "medicare")
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("MediCare Alarm Manager")
            .setContentText("약 복용 시간 입니다.")
            .setAutoCancel(true)
            .setDefaults(NotificationCompat.DEFAULT_ALL)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)

        val notificationManager = NotificationManagerCompat.from(context)
        notificationManager.notify(123, builder.build())

    }

}