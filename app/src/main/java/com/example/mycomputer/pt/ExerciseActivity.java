package com.example.mycomputer.pt;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.List;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);


        Bundle b = getIntent().getExtras();//get the exercise value from the button click event
        String currentExerciseString = b.getString("currentExercise");




        for(Exercise ex : ListActivity.exercises){
            if(ex.getName().equalsIgnoreCase(currentExerciseString)){

                ListActivity.currentExercise = ex;
            }
        }
        Log.i("ExerciseActivity", ListActivity.currentExercise.getName());

        //bind to view
        TextView exerciseTitle = (TextView)findViewById(R.id.exerciseTitle);
        exerciseTitle.setText(ListActivity.currentExercise.getName());
        TextView exerciseDesciption = (TextView)findViewById(R.id.exerciseDescription);
        exerciseDesciption.setText(ListActivity.currentExercise.description);


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
        Intent activity1= new Intent(this,ListActivity.class);
        startActivity(activity1);


    }
    //TODO get current exercise and increment by 1
    public void nextButton(View v) {

        Exercise theNextExercise = new Exercise();
        //TODO:get list of exercises from the ListActivity
        List<Exercise> list = ListActivity.exercises;
        //TDOO: get the currentExercise
        Exercise current = ListActivity.currentExercise;
        //TODO: find the index of the currentExercise in the list
        int currentExerciseIndex = 0;

        for(int i= 0; i < list.size(); i++){
            Exercise ex = list.get(i);
            if(ex.getName().equalsIgnoreCase(current.getName())){
                currentExerciseIndex = i;
                theNextExercise = list.get(i+1);
                TextView title = (TextView)findViewById(R.id.exerciseTitle);
                title.setText(theNextExercise.getName());

            }
        }

        //TODO: get the exercise at the index loation of currentExerciseIndex plus 1
        //TODO: set the view based off of the nextExercise
    }

    public void MainActivity(View View)
    {
        Intent activity1= new Intent(this,MainActivity.class);
        startActivity(activity1);

    }


}