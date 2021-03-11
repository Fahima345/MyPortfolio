package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

public class PersonalData extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button menu;
    TextView bio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);
        menu = findViewById(R.id.btnPersonalData);
        bio = findViewById(R.id.txtBio);
        bio.setText("My Name is Whatever");
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(PersonalData.this, v);
                popup.setOnMenuItemClickListener(PersonalData.this);
                popup.inflate(R.menu.personal_menu);
                popup.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item)
    {

        switch (item.getItemId()) {
            case R.id.resume:
                startActivity(new Intent(PersonalData.this,Resume.class));
                return true;
            case R.id.coverLetter:
                startActivity(new Intent(PersonalData.this,CoverLetter.class));
                return true;
            case R.id.careerGoal:
                startActivity(new Intent(PersonalData.this,CareerGoal.class));
                return true;
            default:
                return false;
        }
    }
}