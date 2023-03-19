package com.pxd.kotlinbasics

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var result:TextView
    lateinit var btn:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.textView)
        btn = findViewById(R.id.button)

        btn.setOnClickListener {
            result.text = "单击"
        }

        btn.setOnLongClickListener {
            result.text = "长按"
            true
        }

        /**
         * 继承
         * 多态
         * 扩展函数
         */
    }

}