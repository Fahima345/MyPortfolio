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
        txtPf.setText("Put Something");
    }
}