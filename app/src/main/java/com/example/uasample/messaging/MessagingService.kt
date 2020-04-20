package com.bskyb.messagingservice

interface MessagingService {
    fun enableUserNotifications()
    fun getChannelId(): String?
    fun addAirshipListener()
}