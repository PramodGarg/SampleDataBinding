package com.github.pramodgarg.sampledatabinding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_list.*

/**
 * Created by pramod on 20/03/18.
 */
class ListTracksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        addTracks()
    }

    private fun addTracks() {
        rvTracks.layoutManager = LinearLayoutManager(this)
        val list = mutableListOf<Track>()

        for (i in 1..10) {
            list.add(Track("title$i", "artist$i", i, i,
                    "https://kotlinlang.org/assets/images/open-graph/kotlin_250x250.png"))
        }
        rvTracks.adapter = TrackRecyclerAdapter(list)
    }
}