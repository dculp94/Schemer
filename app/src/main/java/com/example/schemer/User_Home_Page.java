package com.example.schemer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Calendar;

public class User_Home_Page extends AppCompatActivity implements View.OnClickListener{
    private CardView Strength;
    private CardView Cardio;
    private CardView Mobility;
    private Button CalendarPlanner;
    private Button WorkoutPlanner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Define card id
        setContentView(R.layout.user_home_page);

        Strength = findViewById(R.id.Strength);
        Cardio = findViewById(R.id.Cardio);
        Mobility = findViewById(R.id.Mobility);
        CalendarPlanner = findViewById(R.id.CalendarPlanner);
        WorkoutPlanner = findViewById(R.id.WorkoutPlanner);

        // Add click listener to each
        Strength.setOnClickListener(this);
        Cardio.setOnClickListener(this);
        Mobility.setOnClickListener(this);
        CalendarPlanner.setOnClickListener(this);
        WorkoutPlanner.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.Strength:
                i = new Intent(this, Strength_info.class);startActivity(i); break;
            case R.id.Cardio:
                i = new Intent(this, Cardio_info.class);startActivity(i); break;
            case R.id.Mobility:
                i = new Intent(this, Mobility_info.class);startActivity(i); break;
            case R.id.CalendarPlanner:
                i = new Intent(this, RoutinePlanner.class);startActivity(i); break;
            case R.id.WorkoutPlanner:
                i = new Intent(this, com.example.schemer.WorkoutPlanner.class);startActivity(i);break;

            default:break;
        }
    }
}
