package com.bskyb.messagingservice

import com.urbanairship.push.NotificationActionButtonInfo
import com.urbanairship.push.NotificationInfo
import com.urbanairship.push.NotificationListener



import com.urbanairship.channel.AirshipChannelListener

class AirshipListener : AirshipChannelListener, NotificationListener {


    override fun onNotificationPosted(notificationInfo: NotificationInfo) {

    }

    override fun onNotificationOpened(notificationInfo: NotificationInfo): Boolean {

        // Return false here to allow Airship to auto launch the launcher
        // activity for foreground notification action buttons
        return true
    }

    override fun onNotificationForegroundAction(
        notificationInfo: NotificationInfo,
        actionButtonInfo: NotificationActionButtonInfo
    ): Boolean {

        // Return false here to allow Airship to auto launch the launcher
        // activity for foreground notification action buttons
        return false
    }

    override fun onNotificationBackgroundAction(
        notificationInfo: NotificationInfo,
        actionButtonInfo: NotificationActionButtonInfo
    ) {
    }

    override fun onNotificationDismissed(notificationInfo: NotificationInfo) {

    }

    override fun onChannelCreated(channelId: String) {
    }

    override fun onChannelUpdated(channelId: String) {
    }

}