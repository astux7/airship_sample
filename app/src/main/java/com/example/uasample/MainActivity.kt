package com.example.uasample

import MessageServiceImp
import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.urbanairship.UAirship
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val messageCenter = MessageServiceImp()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        messageCenter.addAirshipListener()
        setContentView(R.layout.activity_main)

        messageCenter.enableUserNotifications()
        channel_id.text =  messageCenter.getChannelId().orEmpty()
        println("[${messageCenter.getChannelId().orEmpty()}]")
    }
}
