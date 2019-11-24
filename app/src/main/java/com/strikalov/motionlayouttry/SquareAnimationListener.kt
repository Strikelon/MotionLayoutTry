package com.strikalov.motionlayouttry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.activity_square_animation_listener.*
import kotlin.math.ceil

class SquareAnimationListener : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_animation_listener)

        motionLayout.setTransitionListener(object: MotionLayout.TransitionListener{

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {}

            override fun onTransitionChange(motionLayout: MotionLayout?,
                                            startId: Int,
                                            endId: Int,
                                            progress: Float) {

                if (startId == R.id.end) {
                    return
                }

                seekbar.progress = ceil(progress * 100).toInt()

            }

            override fun onTransitionCompleted(motion: MotionLayout?, currentId: Int) {
                if (currentId == R.id.end) {
                    motionLayout.setTransition(R.id.end, R.id.removeSeekBar)
                    motionLayout.transitionToEnd()
                }
            }
        })
    }
}
