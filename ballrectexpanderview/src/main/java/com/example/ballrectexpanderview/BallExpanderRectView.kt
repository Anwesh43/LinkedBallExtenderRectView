package com.example.ballrectexpanderview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF
import android.app.Activity
import android.content.Context

val colors : Array<Int> = arrayOf(
    "#F44336",
    "#009688",
    "#4CAF50",
    "#FFC107",
    "#03A9F4"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 3
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val rFactor : Float = 7.8f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
