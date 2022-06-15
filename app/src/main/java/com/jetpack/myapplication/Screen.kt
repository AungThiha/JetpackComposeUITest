package com.jetpack.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp

const val BUTTON_FIRST = "BUTTON_FIRST"
const val BUTTON_SECOND = "BUTTON_SECOND"

@Composable
fun Screen(mainViewModel: MainViewModel) {
    Column(
        modifier = Modifier.padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (mainViewModel.isFirstButtonShown.value) {
            Button(
                modifier = Modifier.testTag(BUTTON_FIRST),
                onClick = { mainViewModel.onFirstButtonClicked() }) {
                Text(
                    text = "First Button",
                    style = MaterialTheme.typography.button.copy(color = MaterialTheme.colors.onPrimary)
                )
            }
        } else {
            Button(
                modifier = Modifier.testTag(BUTTON_FIRST),
                onClick = { mainViewModel.onSecondButtonClicked() }) {
                Text(
                    text = "Second Button",
                    style = MaterialTheme.typography.button.copy(color = MaterialTheme.colors.onPrimary)
                )
            }
        }
    }

}
