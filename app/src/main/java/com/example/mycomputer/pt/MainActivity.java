package com.example.mycomputer.pt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void list(View View)
    {
        Intent activity1= new Intent(this,ListActivity.class);
        startActivity(activity1);

    }

}
