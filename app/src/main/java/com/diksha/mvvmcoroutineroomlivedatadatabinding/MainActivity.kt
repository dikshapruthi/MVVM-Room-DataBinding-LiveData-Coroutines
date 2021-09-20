package com.diksha.mvvmcoroutineroomlivedatadatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.diksha.mvvmcoroutineroomlivedatadatabinding.db.database.SubscriberDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}