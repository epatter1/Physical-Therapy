package com.example.mycomputer.pt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void Exercise1(View View)
    {
        Intent activity1= new Intent(this,Exercise1.class);
        startActivity(activity1);

    }
}
