package com.example.uasample

import android.app.Application
import com.urbanairship.UAirship

class UAApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        UAirship.takeOff(this)
    }
}