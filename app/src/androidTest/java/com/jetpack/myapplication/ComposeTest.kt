package com.jetpack.myapplication

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ComposeTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun composeTest() {
        composeTestRule.setContent {
            Screen(mainViewModel = MainViewModel())
        }

        composeTestRule.onNode(hasTestTag(BUTTON_FIRST)).performClick()

        composeTestRule.onNode(hasTestTag(BUTTON_SECOND)).assertIsDisplayed()
        composeTestRule.onNode(hasTestTag(BUTTON_SECOND)).performClick()

        composeTestRule.onNode(hasTestTag(BUTTON_FIRST)).assertIsDisplayed()
    }
}