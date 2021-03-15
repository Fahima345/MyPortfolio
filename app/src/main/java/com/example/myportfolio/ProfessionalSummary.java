package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfessionalSummary extends AppCompatActivity {

    TextView txtPf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_summary);
        txtPf = findViewById(R.id.txtPf);
        txtPf.setText("In terms of professional work experience, I don't have any of now because" +
                " i'm still student. For my resume you can see i worked in some restaurent like cheesecake factory." +
                 " I did some Volunteer work while i was at high school but i don't have any copy for this.");
    }
}