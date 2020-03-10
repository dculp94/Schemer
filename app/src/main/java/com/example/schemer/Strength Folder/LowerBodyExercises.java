package com.example.schemer;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;

public class LowerBodyExercises extends AppCompatActivity implements View.OnClickListener {
    private CardView Squat, Hack_Squat, Deadlift, Leg_Press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_body_exercises);

        Squat = findViewById(R.id.Squat);
        Hack_Squat = findViewById(R.id.Hack_squat);
        Deadlift = findViewById(R.id.Deadlift);
        Leg_Press = findViewById(R.id.Leg_Press);

        Squat.setOnClickListener(this);
        Hack_Squat.setOnClickListener(this);
        Deadlift.setOnClickListener(this);
        Leg_Press.setOnClickListener(this);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.Squat:
                i = new Intent(this, Squat_Info.class);startActivity(i); break;
            case R.id.Hack_squat:
                i = new Intent(this, Hack_Squat_Info.class);startActivity(i); break;
            case R.id.Deadlift:
                i = new Intent(this, Deadlift_Info.class);startActivity(i); break;
            case R.id.Leg_Press:
                i = new Intent(this, Leg_Press_Info.class);startActivity(i); break;




            default:break;
        }
    }

}
