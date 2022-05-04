package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceiver: BroadcastReceiver() {
    val TAG = "MyBroadcastReceiver"
    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.d(TAG,"Action"+ p1!!.action.toString())
        Log.d(TAG,"Airoplane Mode Status"+p1.getBooleanExtra("state",false))
        Toast.makeText(p0,"Airoplane Mode Changed",Toast.LENGTH_LONG).show()
    }
}