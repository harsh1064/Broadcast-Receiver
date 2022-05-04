package com.example.broadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val airPlaneModeFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(MyBroadcastReceiver(), airPlaneModeFilter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(MyBroadcastReceiver())
    }
}