package com.jetpack.myapplication

import androidx.test.core.app.launchActivity
import org.junit.Test

class OldTest {
    @Test
    fun startActivityStart() {
        launchActivity<MainActivity>()
        Thread.sleep(1000000000)
    }
}