package com.example.akbar.anketa;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TextView fio = (TextView) findViewById(R.id.uFio);
        TextView age = (TextView) findViewById(R.id.uAge);
        TextView email = (TextView) findViewById(R.id.uEmail);

        String familia = getIntent().getStringExtra("fio");
        String ageString = getIntent().getStringExtra("age");
        String emailString = getIntent().getStringExtra("email");

        fio.setText("ФИО: " + familia);
        age.setText("Возраст: " + ageString);
        email.setText("Email: " + emailString);
    }
}


