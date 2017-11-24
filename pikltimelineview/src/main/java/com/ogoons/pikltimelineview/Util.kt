package com.ogoons.pikltimelineview

import android.content.Context
import android.util.TypedValue


/**
 * Created by OGOONS on 2017. 11. 20..
 */
object Util {

    fun spToPx(context: Context, sp: Int): Float {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp.toFloat(), context.resources.displayMetrics)
    }

    fun dpToPx(context: Context, dp: Int): Int {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), context.resources.displayMetrics).toInt()
    }

    fun pxToDp(context: Context, pixel: Int): Int {
        val metrics = context.resources.displayMetrics
        val dp = pixel / (metrics.densityDpi / 160f)
        return dp.toInt()
    }

}