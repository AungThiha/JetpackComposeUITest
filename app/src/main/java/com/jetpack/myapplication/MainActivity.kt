package com.jetpack.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jetpack.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Screen(mainViewModel = MainViewModel())
                }
            }
        }
    }
}

@Composable
fun Screen(mainViewModel: MainViewModel) {
    Column(
        modifier = Modifier.padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (mainViewModel.isFirstButtonShown.value) {
            Button(onClick = { mainViewModel.openCardDetails() }) {
                Text(text = "First Button", style = MaterialTheme.typography.button.copy(color = MaterialTheme.colors.onPrimary))
            }
        } else {
            Button(onClick = { mainViewModel.openHome() }) {
                Text(text = "Second Button", style = MaterialTheme.typography.button.copy(color = MaterialTheme.colors.onPrimary))
            }
        }
    }

}
