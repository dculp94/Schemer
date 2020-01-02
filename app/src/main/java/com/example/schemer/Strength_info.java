package com.example.schemer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class Strength_info extends AppCompatActivity implements View.OnClickListener{

    private CardView Upper_Body;
    private CardView Lower_Body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength_info);

        Upper_Body = findViewById(R.id.Upper_strength);
        Lower_Body = findViewById(R.id.Lower_strength);


        Upper_Body.setOnClickListener(this);
        Lower_Body.setOnClickListener(this);

    }

    // Sets listeners for the cards
    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.Upper_strength:
                i = new Intent(this, UpperBodyExercises.class);startActivity(i); break;
            case R.id.Lower_strength:
                i = new Intent(this, LowerBodyExercises.class);startActivity(i); break;


            default:break;
        }
    }
}
