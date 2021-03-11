package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcademicWorkExperience extends AppCompatActivity {

    Button btnFull,btnJava,btnFull2,btnRes,btnDev,btnCap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_work_experience);

        btnFull = findViewById(R.id.btnFullStack);
        btnFull.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/Fahima345/FullStack-2"));
            startActivity(intent);
        });

        btnJava = findViewById(R.id.btnJava);
        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/Fahima345/COMP3095Assignment1"));
                startActivity(intent);

            }
        });

        btnFull2 = findViewById(R.id.btnFullStack2);
        btnFull2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/Fahima345/101185665_comp3123_a2"));
                startActivity(intent);

            }
        });

        btnRes = findViewById(R.id.btnRes);
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/vipul5219/Restaurant-Guide"));
                startActivity(intent);

            }
        });

        btnDev = findViewById(R.id.btnDevOps);
        btnDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/DevarshiKSagar/COMP3104_Group_Assignment"));
                startActivity(intent);

            }
        });

        btnCap = findViewById(R.id.btnCapstone);
        btnCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/DevarshiKSagar/capstoneProject"));
                startActivity(intent);
            }
        });








    }
}