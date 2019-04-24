package com.ebookfrenzy.viewmodeldemo.ui.main

import android.arch.lifecycle.ViewModel
import android.util.Log
import android.arch.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    // old: TODO: Implement the ViewModel

    private val usd_to_eu_rate = 0.74f
    var dollarValue: MutableLiveData<String> = MutableLiveData()
    //private var result: Float = 0f
    var result: MutableLiveData<Float> = MutableLiveData()

    fun convertValue(){
        dollarValue.let{
            if(!it.value.equals("")){
                result.value = it.value?.toFloat()?.times(usd_to_eu_rate)
            }else {
                result.value = 0f
            }
        }
    }

}
