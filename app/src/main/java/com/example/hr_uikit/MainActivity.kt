package com.example.hr_uikit

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.airbnb.android.showkase.models.Showkase

//13.05.2026
//11
//класс старта приложения
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("startActivity", "старт MainActivity")
        enableEdgeToEdge()
        startActivity(Showkase.getBrowserIntent(this))
        Log.d("start", "старт storybook")
        finish()
    }
}