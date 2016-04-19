package com.example.mycomputer.pt;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Exercise1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
//        final VideoView videoView =
//                (VideoView) findViewById(R.id.videoView1);
//       videoView.setVideoPath(
//             "android.resource://" + getPackageName() + "/" + R.raw.movie);
//        videoView.start();
        final VideoView videoView =
                (VideoView) findViewById(R.id.videoView1);
        videoView.setVisibility(View.GONE);
    }


    private static void sleep(long t) {
        try {
            Thread.sleep(t);
        } catch (Exception e) {
        }
    }


    public void start1(View View) {

        setContentView(R.layout.activity_exercise1);
        final VideoView videoView = (VideoView) findViewById(R.id.videoView1);
        videoView.setVideoPath(
                "android.resource://" + getPackageName() + "/" + R.raw.movie);
        videoView.start();
        //   sleep(16200);
        //videoView.setVisibility(View.GONE);
    }

    public void hide1(View View) {
        final VideoView videoView = (VideoView) findViewById(R.id.videoView1);

        videoView.setVisibility(View.GONE);

    }

    public void start2(View View) {
        setContentView(R.layout.activity_exercise1);
        final VideoView videoView = (VideoView) findViewById(R.id.videoView1);

        videoView.setVisibility(View.GONE);

        final TextView text1;
        text1= (TextView) findViewById(R.id.textView4);
        new CountDownTimer(8000, 1000) {

            public void onTick(long millisUntilFinished) {
                text1.setText("" + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                text1.setText("");
            }

        }.start();

    }


    public void demo(View View) {
        setContentView(R.layout.activity_exercise1);
            final VideoView videoView = (VideoView)
                findViewById(R.id.videoView1);

        videoView.setVideoPath(
                "android.resource://" + getPackageName() + "/" + R.raw.movie);

        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
            videoView.start();
    }



    public void list(View View)
    {
        Intent activity1= new Intent(this,list.class);
        startActivity(activity1);

    }


    public void MainActivity(View View)
    {
        Intent activity1= new Intent(this,MainActivity.class);
        startActivity(activity1);

    }


}