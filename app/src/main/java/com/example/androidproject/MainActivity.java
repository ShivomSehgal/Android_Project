package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    Button dsaButton, androidProjectButton, applicationsButton, coreFundamentalButton, interviewPrepButton, dailyTestButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent dsaIntent =new Intent(this, DataStructures.class);
        Intent androidProjectIntent = new Intent(this, AndroidProject.class);
        Intent applicationsIntent = new Intent(this, Applications.class);
        Intent coreFundamentalIntent = new Intent(this, CoreFundamentals.class);
        Intent interviewPrepIntent = new Intent(this, InterviewPrepration.class);
        Intent dailyTestIntent = new Intent(this, DailyTestQuestions.class);


        dsaButton = findViewById(R.id.dsa);
        androidProjectButton = findViewById(R.id.project);
        applicationsButton = findViewById(R.id.applications);
        coreFundamentalButton = findViewById(R.id.coreFundamentals);
        interviewPrepButton = findViewById(R.id.interviewPrep);
        dailyTestButton = findViewById(R.id.dailyTest);

        dsaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(dsaIntent);
            }
        });

        androidProjectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(androidProjectIntent);
            }
        });

        applicationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(applicationsIntent);
            }
        });

        coreFundamentalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(coreFundamentalIntent);
            }
        });

        interviewPrepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(interviewPrepIntent);
            }
        });

        dailyTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(dailyTestIntent);
            }
        });

    }
}