package com.example.android.audiosampleapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        Button playBtn=(Button) findViewById(R.id.play);
        Button pauseBtn=(Button) findViewById(R.id.pause);
        TextView duration= (TextView) findViewById(R.id.duration);
        int durationNum=mediaPlayer.getDuration();
        duration.setText("song duration is "+durationNum+" miilisecond");
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.start();
            }}
                );
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.pause();
            }}
        );
    }
}
