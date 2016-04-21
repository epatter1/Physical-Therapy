package com.example.mycomputer.pt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {


    public static ArrayList<Exercise> exercises = new ArrayList<Exercise>();
    public static Exercise currentExercise = new Exercise();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        exercises.add(new Exercise("Exercise1","This is descripiton of exercise1"));
        Exercise ex2 = new Exercise("Exercise2","This is descripiton of exercise2");

        exercises.add(ex2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void StartExercise(View v){
        String exerciseNumber = String.valueOf(v.getTag());
        Intent activity1= new Intent(this,ExerciseActivity.class);
        Bundle b = new Bundle();
        b.putString("currentExercise", exerciseNumber);
        activity1.putExtras(b);

        startActivity(activity1);
    }
}
