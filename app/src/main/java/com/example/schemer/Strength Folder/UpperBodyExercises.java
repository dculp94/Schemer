package com.example.schemer;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;

public class UpperBodyExercises extends AppCompatActivity implements View.OnClickListener{
    private CardView Chest_Press,Shoulder_Press,Biceps,Triceps,Horizontal_Pull;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body_exercises);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Chest_Press = findViewById(R.id.Chest_Press);
        Shoulder_Press = findViewById(R.id.Shoulder_Press);
        Biceps = findViewById(R.id.Bicep);
        Triceps = findViewById(R.id.Triceps);
        Horizontal_Pull = findViewById(R.id.Horizontal_Pull);

        Chest_Press.setOnClickListener(this);
        Shoulder_Press.setOnClickListener(this);
        Biceps.setOnClickListener(this);
        Triceps.setOnClickListener(this);
        Horizontal_Pull.setOnClickListener(this);

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
            case R.id.Chest_Press:
                i = new Intent(this, chest_press_info.class);startActivity(i); break;
            case R.id.Shoulder_Press:
                i = new Intent(this, Shoulder_Press_info.class);startActivity(i); break;
            case R.id.Bicep:
                i = new Intent(this, Bicep_Info.class);startActivity(i); break;
            case R.id.Triceps:
                i = new Intent(this, Tricep_Info.class);startActivity(i); break;
            case R.id.Horizontal_Pull:
                i = new Intent(this, Horizontal_Pull_Info.class);startActivity(i); break;



            default:break;
        }
    }
}
