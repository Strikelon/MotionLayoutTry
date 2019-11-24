package com.strikalov.motionlayouttry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        square_scroll_button.setOnClickListener {
            startActivity(Intent(this, SquareScrollActivity::class.java))
        }

        square_click_button.setOnClickListener {
            startActivity(Intent(this, SquareClickActivity::class.java))
        }

        square_event_button.setOnClickListener {
            startActivity(Intent(this, SquareEventActivity::class.java))
        }

        square_progress_button.setOnClickListener {
            startActivity(Intent(this, SquareProgressActivity::class.java))
        }

        square_progress2_button.setOnClickListener {
            startActivity(Intent(this, SquareProgress2Activity::class.java))
        }

        square_animation_listener_button.setOnClickListener {
            startActivity(Intent(this, SquareAnimationListener::class.java))
        }

        custom_background_color.setOnClickListener {
            startActivity(Intent(this, CustomBackgroundColor::class.java))
        }

        image_filter_sample.setOnClickListener {
            startActivity(Intent(this, ImageFilterSample::class.java))
        }

        key_position_sample.setOnClickListener {
            startActivity(Intent(this, KeyPositionActivity::class.java))
        }

        key_attribute_sample.setOnClickListener {
            startActivity(Intent(this, KeyAttributeActivity::class.java))
        }
    }
}
