package app.driving.danzon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mapbox.vision.VisionManager
import com.mapbox.vision.mobile.core.interfaces.VisionEventsListener

class MainActivity : AppCompatActivity(), VisionEventsListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        VisionManager.create()
        VisionManager.start(this)
    }

    override fun onPause() {
        super.onPause()

        VisionManager.stop()
        VisionManager.destroy()
    }
}
