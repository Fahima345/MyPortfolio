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
        bio.setText("My Name is Fahima Chowdhury. I am studying computer programmer analyst in Georgebrown College. I'm almost done for my " +
                "3 years advanced diploma program. I was strugling a lot for my study and i'm thankfull that it's almost done. Life is too short" +
                "We have to work hard in order to achive our goal. Nothing comes easy in our life. We work hard and end of the day the taste of success is sweet." +
                "One thing i learned in my life is that there are no secrets to success" + "It is the result of preparation, hard work, and learning from failure." +
                " Don't be afraid to give up the good to go for the great");
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