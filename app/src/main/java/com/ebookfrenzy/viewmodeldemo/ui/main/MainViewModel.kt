package com.ebookfrenzy.viewmodeldemo.ui.main

import android.arch.lifecycle.ViewModel
import android.util.Log

class MainViewModel : ViewModel() {
    // old: TODO: Implement the ViewModel

    private val usd_to_eu_rate = 0.74f
    private var dollarText = ""
    private var result: Float = 0f

    fun setAmount(value: String) {
        this.dollarText = value
        result = value.toFloat() * usd_to_eu_rate
    }

    fun getResult(): Float? {
        return result
    }
}
