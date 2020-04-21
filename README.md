# Urban airship sample using Kotlin and UA SDK

Urban Airship SDK version - 12.2.0

Need to add 2 files:

../app/src/main/assets/airshipconfig.preperties

../app/google-services.json

# How it works?
Main activity should show channel ID.

When we push message we should see Alert but when we click on Alert should not open message center content - Message Activity.
We stop auto launcher using https://github.com/astux7/airship_sample/blob/master/app/src/main/java/com/example/uasample/messaging/AirshipListener.kt#L22 boolean set to true.

# Branch example with custom Autopilot
Branch `custom_autopilot` has Custom autopilot which behaves as `master` branch.
