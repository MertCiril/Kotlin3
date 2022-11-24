package com.mertciril.kotlin3design

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeActivity(view: View) {
        val newText = editText.text.toString()
        val intent = Intent(applicationContext, SecondActivity::class.java)
        // kullanıcıdan aldığımız veriyi sayfayı başlatmadan önce diğer sayfaya yolluyoruz
        intent.putExtra("input", newText) //map mantığı anahtar , değer

        startActivity(intent)
        finish()//bu aktiviteyi bitirir
    }
}