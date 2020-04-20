
import com.bskyb.messagingservice.AirshipListener
import com.bskyb.messagingservice.MessagingService
import com.urbanairship.UAirship

class MessageServiceImp : MessagingService {
    override fun enableUserNotifications() {
        UAirship.shared().pushManager.userNotificationsEnabled = true
    }

    override fun getChannelId(): String? {
        return UAirship.shared().channel.id
    }

    override fun addAirshipListener() {
        UAirship.shared().channel.addChannelListener(AirshipListener())
    }

}