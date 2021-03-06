package com.jetpack.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp

const val BUTTON_FIRST = "BUTTON_FIRST"
const val BUTTON_SECOND = "BUTTON_SECOND"

@Composable
fun Screen(mainViewModel: MainViewModel) {
    Column(
        modifier = Modifier.padding(top = 100.dp, start = 100.dp),
    ) {
        if (mainViewModel.isFirstButtonShown.value) {
            Button(
                modifier = Modifier.testTag(BUTTON_FIRST),
                onClick = { mainViewModel.onFirstButtonClicked() }) {
                Text(
                    text = "First Button"
                )
            }
        } else {
            Button(
                modifier = Modifier.testTag(BUTTON_SECOND),
                onClick = { mainViewModel.onSecondButtonClicked() }) {
                Text(
                    text = "Second Button"
                )
            }
        }
    }

}
