package com.ebookfrenzy.viewmodeldemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ebookfrenzy.viewmodeldemo.ui.main.MainFragment

//2019-04-24 - onsdag kl. 16.48
// nået til slutning af kap. 42 (8913/22642) koden virker!!!

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
