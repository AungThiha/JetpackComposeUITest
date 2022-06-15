package com.jetpack.myapplication

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var isFirstButtonShown = mutableStateOf(true)

    fun onFirstButtonClicked() {
        isFirstButtonShown.value = false
    }

    fun onSecondButtonClicked() {
        isFirstButtonShown.value = true
    }
}