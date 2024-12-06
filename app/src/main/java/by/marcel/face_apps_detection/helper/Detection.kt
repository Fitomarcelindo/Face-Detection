package by.marcel.face_apps_detection.helper

import android.graphics.RectF

data class Detection(
    val boundingBox: RectF,
    val label: String,
    val score: Float
)
