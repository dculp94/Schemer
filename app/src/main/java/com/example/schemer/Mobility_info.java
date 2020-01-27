package com.example.schemer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Mobility_info extends AppCompatActivity implements View.OnClickListener {
    private CardView Yoga, Static_Hold,Ankle,Spinal_Stretch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobility_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Yoga = findViewById(R.id.YogaField);
        Static_Hold = findViewById(R.id.StaticHoldField);
        Ankle = findViewById(R.id.AnkleField);
        Spinal_Stretch = findViewById(R.id.SpinalStretchField);

        Yoga.setOnClickListener(this);
        Static_Hold.setOnClickListener(this);
        Ankle.setOnClickListener(this);
        Spinal_Stretch.setOnClickListener(this);

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
            case R.id.YogaField:
                i = new Intent(this, Yoga_Info.class);startActivity(i); break;
            case R.id.StaticHoldField:
                i = new Intent(this, Static_Hold_Info.class);startActivity(i); break;
            case R.id.AnkleField:
                i = new Intent(this, Ankle_Info.class);startActivity(i); break;
            case R.id.SpinalStretchField:
                i = new Intent(this, Spinal_Stretch_Info.class);startActivity(i); break;




            default:break;
        }
    }
}
