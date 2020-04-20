package com.example.uasample.messaging

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.urbanairship.push.fcm.AirshipFirebaseIntegration

class AirshipFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(p0: RemoteMessage) {
        if (p0 != null) {
            AirshipFirebaseIntegration.processMessageSync(applicationContext, p0)
        }
    }

    override fun onNewToken(p0: String) {
        AirshipFirebaseIntegration.processNewToken(applicationContext)
    }
}