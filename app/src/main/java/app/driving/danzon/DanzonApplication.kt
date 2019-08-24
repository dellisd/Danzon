package app.driving.danzon

import android.app.Application
import com.mapbox.vision.VisionManager

class DanzonApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        VisionManager.init(this, BuildConfig.MAPBOX_KEY)
    }
}