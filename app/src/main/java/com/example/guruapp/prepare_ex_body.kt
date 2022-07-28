package com.example.guruapp

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button

import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class prepare_ex_body : YouTubeBaseActivity() {

    val videoId = "aeHVX2P4kaQ"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prepare_ex_body)


        val youtubeView = findViewById<YouTubePlayerView>(R.id.youTubePlayerView_body)

        youtubeView.initialize("develop", object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                provider: YouTubePlayer.Provider,
                player: YouTubePlayer,
                wasRestored: Boolean
            ) {
                if (!wasRestored) {
                    player.cueVideo(videoId)
                }
            }

            override fun onInitializationFailure(
                provider: YouTubePlayer.Provider?,
                result: YouTubeInitializationResult?
            ) {

            }
        })
    }


}