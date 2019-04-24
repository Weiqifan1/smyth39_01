package com.ebookfrenzy.viewmodeldemo.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ebookfrenzy.viewmodeldemo.R
import android.databinding.DataBindingUtil
import com.ebookfrenzy.viewmodeldemo.databinding.MainFragmentBinding
import com.ebookfrenzy.viewmodeldemo.BR.myViewModel
//ovenstående fejlede her: 8828/22642 - kap. 42

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    lateinit var binding: MainFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.main_fragment, container, false)
        binding.setLifecycleOwner(this)
        return binding.root
        //return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        binding.setVariable(myViewModel, viewModel)


    }

}
