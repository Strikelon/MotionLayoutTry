package com.strikalov.motionlayouttry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.activity_square_progress.*
import kotlin.math.ceil

class SquareProgressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_progress)

        motionLayout.setTransitionListener(object: MotionLayout.TransitionListener{

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {}

            override fun onTransitionChange(motionLayout: MotionLayout?,
                                            startId: Int,
                                            endId: Int,
                                            progress: Float) {

                seekbar.progress = ceil(progress * 100).toInt()

            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {}
        })
    }
}
