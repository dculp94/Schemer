package com.example.schemer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Interface extends AppCompatActivity implements View.OnClickListener{
    private CardView Strength;
    private CardView Cardio;
    private CardView Mobility;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Define card id
        setContentView(R.layout.user_home_page);
        Strength = findViewById(R.id.Strength);
        Cardio = findViewById(R.id.Cardio);
        Mobility = findViewById(R.id.Mobility);

        // Add click listener to each
        Strength.setOnClickListener(this);
        Cardio.setOnClickListener(this);
        Mobility.setOnClickListener(this);
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
            default:break;
        }
    }
}
