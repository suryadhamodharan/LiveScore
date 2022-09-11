package com.surya.livescore

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.surya.livescore.api.ApiInterface
import com.surya.livescore.api.RetrofitClient
import com.surya.livescore.models.Match

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.rvMatches)

        val retrofit = RetrofitClient.getInstance()
        val apiInterface = retrofit.create(ApiInterface::class.java)
        lifecycleScope.launchWhenCreated {
            val response = apiInterface.getMatches()
            val cricket = response.body()


            val matches: MutableList<Match> = mutableListOf()

            cricket?.typeMatches?.forEach { typeMatche ->
                typeMatche.seriesAdWrapper?.forEach { seriesAdWrapper ->
                    seriesAdWrapper.seriesMatches?.matches?.let { value: List<Match> ->
                        matches.addAll(value)
                    }
                }

            }
            Log.d(TAG, "onCreate: ${matches.size}")

            recyclerView.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = MatchesAdapter(this@MainActivity, matches)
            }

//            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
//            recyclerView.adapter = MatchesAdapter(this@MainActivity, matches)
        }
    }
}