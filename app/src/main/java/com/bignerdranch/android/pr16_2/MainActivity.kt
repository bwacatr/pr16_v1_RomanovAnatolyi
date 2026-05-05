package com.bignerdranch.android.pr16_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launch(view: View) {
        val alert = AlertDialog.Builder(this)
            .setTitle("Уведомление")
            .setMessage("Переход на следующий экран")
            .setPositiveButton("OK",null)
            .create()
            .show()
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    fun goBack(view: View) {}
}