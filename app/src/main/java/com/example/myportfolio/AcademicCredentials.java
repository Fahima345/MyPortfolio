package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class AcademicCredentials extends AppCompatActivity {
    Button btnTra;
    PDFView pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_credentials);
        btnTra = findViewById(R.id.btnTranscript);
        pdf = findViewById(R.id.pdfViewCredentials);
        pdf.fromAsset("fahima school certificate.pdf").load();
        btnTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AcademicCredentials.this,Transcript.class));
            }
        });
    }
}