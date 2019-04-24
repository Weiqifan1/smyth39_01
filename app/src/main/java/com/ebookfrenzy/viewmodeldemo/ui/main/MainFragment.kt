package com.ebookfrenzy.viewmodeldemo.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ebookfrenzy.viewmodeldemo.R
import kotlinx.android.synthetic.main.main_fragment.*
import android.arch.lifecycle.Observer


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        //8344/22642 - tilføj kode til at bruge observer
        val resultObserver = Observer<Float>{
            result -> resultText.text = result.toString()
        }
        viewModel.getResult().observe(this, resultObserver)
        convertButton.setOnClickListener{
            if(dollarText.text.isNotEmpty()){
                viewModel.setAmount(dollarText.text.toString())
                //resultText.text = viewModel.getResult().toString()
            } else {
                resultText.text = "No value"
            }
        }

    }

}
