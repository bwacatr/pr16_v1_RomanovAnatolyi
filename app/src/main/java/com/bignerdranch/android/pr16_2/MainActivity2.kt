package com.bignerdranch.android.pr16_2

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    lateinit var launch: TextView

    lateinit var preferences: SharedPreferences
    lateinit var ed: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        preferences = getSharedPreferences("my_prefs",MODE_PRIVATE)
        ed = preferences.edit()


        launch = findViewById(R.id.launchText)

        var count : Int = preferences.getInt("count",0) +1

        if (count % 2 == 1)
        {
            launch.setText(count.toString())
        }
        else
        {
            launch.setText(0.toString())
        }

        ed.putInt("count",count)
        ed.apply()





    }

    fun Back(view: View) {
        val alert = AlertDialog.Builder(this)
            .setTitle("Уведомление")
            .setMessage("Переход на предыдущий экран")
            .setPositiveButton("OK",null)
            .create()
            .show()
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}