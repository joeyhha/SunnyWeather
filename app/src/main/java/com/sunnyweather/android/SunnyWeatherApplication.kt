package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * SunnyWeatherApplication
 * 描述:
 * 作者: wanghui
 * 日期: 2024/9/24
 */

class SunnyWeatherApplication:Application() {



    companion object {
        const val TOKEN = "tI1M1cdhQK8p1631"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}