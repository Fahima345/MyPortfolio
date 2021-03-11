package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = findViewById(R.id.btnMenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, v);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.popup_menu);
                popup.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.personal_data:
                startActivity(new Intent(MainActivity.this, PersonalData.class));
                return true;
            case R.id.aca_cre:
                startActivity(new Intent(MainActivity.this, AcademicCredentials.class));
                return true;
            case R.id.aca_work:
               startActivity(new Intent(MainActivity.this, AcademicWorkExperience.class));
                return true;
            case R.id.pro_summ:
                startActivity(new Intent(MainActivity.this, ProfessionalSummary.class));
                return true;
            default:
                return false;
        }
    }
}
