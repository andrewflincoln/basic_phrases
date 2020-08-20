package com.andrewflincoln.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void english(View view) {
        MediaPlayer englishPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
        englishPlayer.start();
    }

}