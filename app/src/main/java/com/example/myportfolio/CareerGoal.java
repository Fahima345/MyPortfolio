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
        cg.setText("My immediate goal is to secure a position at a software company where i can continue to grow and improve myself both personally and professionally." +
                "I enjoy challenges and look forward to opportunities where i will be able to assume more responsibilities. Ultimately i would like to move into manager " +
                "posotion where i can focus on strategy and development and work my way into a long term position where i can build a solid career. I'm looking forward to being" +
                "able to take on small leadership roles, eventually working my way into a position as a manager and team leader.");
    }
}