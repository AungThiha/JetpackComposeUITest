package com.jetpack.myapplication

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import org.junit.Test

class OldTest {
    @Test
    fun startActivityStart() {
        launchActivity<MainActivity>()

        Espresso.onView(ViewMatchers.withText("First Button")).perform(click())

        val secondButton = Espresso.onView(ViewMatchers.withText("Second Button"))
        secondButton.check(matches(ViewMatchers.isDisplayed()))
        secondButton.perform(click())

        Espresso.onView(ViewMatchers.withText("First Button")).check(matches(ViewMatchers.isDisplayed()))

    }
}