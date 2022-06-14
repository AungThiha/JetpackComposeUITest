package com.jetpack.myapplication

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var isFirstButtonShown = mutableStateOf(true)

    fun openCardDetails() {
        isFirstButtonShown.value = false
    }

    fun openHome() {
        isFirstButtonShown.value = true
    }
}