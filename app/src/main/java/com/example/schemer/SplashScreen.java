package com.example.schemer;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreen extends AppCompatActivity{
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent loginIntent = new Intent(SplashScreen.this, User_Home_Page.class);
                startActivity(loginIntent);
                finish();
            }


        },SPLASH_TIME_OUT);

    }

}