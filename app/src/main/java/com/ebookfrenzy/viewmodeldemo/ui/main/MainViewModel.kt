package com.ebookfrenzy.viewmodeldemo.ui.main

import android.arch.lifecycle.ViewModel
import android.util.Log
import android.arch.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    // old: TODO: Implement the ViewModel

    private val usd_to_eu_rate = 0.74f
    private var dollarText = ""
    //private var result: Float = 0f
    private var result: MutableLiveData<Float> = MutableLiveData()

    fun setAmount(value: String) {
        this.dollarText = value
        //result = value.toFloat() * usd_to_eu_rate
        result.value = value.toFloat() * usd_to_eu_rate
    }

    //fun getResult(): Float? {
    //    return result
    //}
    fun getResult(): MutableLiveData<Float> {
        return result
    }
}
