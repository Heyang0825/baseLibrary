package com.hy.hylib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hy.hylibrary.MyUtils


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyUtils.getMySting()
    }
}