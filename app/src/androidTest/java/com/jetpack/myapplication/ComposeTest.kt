package com.jetpack.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.compose.ui.test.performClick
import androidx.test.core.app.launchActivity
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.jetpack.myapplication.ui.theme.MyApplicationTheme

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ComposeTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun composeTest() {
        composeTestRule.setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Screen(mainViewModel = MainViewModel())
                }
            }
        }

        composeTestRule.onNode(hasTestTag(BUTTON_FIRST)).performClick()

        composeTestRule.onNode(hasTestTag(BUTTON_SECOND)).assertIsDisplayed()
        composeTestRule.onNode(hasTestTag(BUTTON_SECOND)).performClick()

        composeTestRule.onNode(hasTestTag(BUTTON_FIRST)).assertIsDisplayed()
    }
}