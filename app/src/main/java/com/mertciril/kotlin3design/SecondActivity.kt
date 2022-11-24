package com.mertciril.kotlin3design

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent //sayfa değiştirmede kullanılmayacağı için küçük intent (veri alırken kullanılır)
        //sayfa değiştirirken büyük Intent kullanılır.
        val text = intent.getStringExtra("input")//diğer sayfadan gelen veriyi alıyor.
        textView.text = text

        println("On Create")

    }
    fun goBack(view: View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onStart() {
        super.onStart()
        println("On Start")
    }

    override fun onResume() {
        super.onResume()
        println("On Resume")
    }

    override fun onPause() {
        super.onPause()
        println("On Pause")
    }

    override fun onStop() {
        super.onStop()
        println("On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("On Destroy")
    }
}