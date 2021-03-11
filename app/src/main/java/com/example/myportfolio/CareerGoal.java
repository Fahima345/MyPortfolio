package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CareerGoal extends AppCompatActivity {
    TextView cg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_goal);
        cg = findViewById(R.id.txtCareerGoal);
        cg.setText("I don't know");
    }
}