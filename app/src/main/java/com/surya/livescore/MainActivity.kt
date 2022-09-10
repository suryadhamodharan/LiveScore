package com.surya.livescore

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.surya.livescore.api.ApiInterface
import com.surya.livescore.api.RetrofitClient

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val retrofit = RetrofitClient.getInstance()
        val apiInterface = retrofit.create(ApiInterface::class.java)
        lifecycleScope.launchWhenCreated {
            val response=apiInterface.getMatches()
            Log.d(TAG, "onCreate: ${response.body()?.typeMatches?.get(0)?.matchType}")

        }
    }
}