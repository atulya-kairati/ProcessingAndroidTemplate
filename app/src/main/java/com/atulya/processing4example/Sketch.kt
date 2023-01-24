package com.atulya.processing4example

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import processing.core.PApplet


const val TAG = ">>> Sketch"
class Sketch: PApplet() {

    @RequiresApi(Build.VERSION_CODES.R)
    override fun settings(){
        Log.d(TAG, "settings: ")
        size(displayWidth, displayHeight)
    }

    override fun setup() {
        Log.d(TAG, "setup: ")
        background(0)
        noStroke()
        fill(0f, 255f, 0f)
        super.setup()
    }

    override fun draw() {
        Log.d(TAG, "draw: ")

        if (mousePressed){
            ellipse(
                mouseX.toFloat(),
                mouseY.toFloat(),
                100F,
                100F
            )
        }
    }
}