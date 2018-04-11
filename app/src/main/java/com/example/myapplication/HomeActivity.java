package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openDayScreen(View view){

        Intent intent = new Intent(this, DayActivity.class);
        startActivity(intent);

    }
    public void openNightScreen(View view){

        Intent intent = new Intent(this, NightActivity.class);
        startActivity(intent);

    }
}
