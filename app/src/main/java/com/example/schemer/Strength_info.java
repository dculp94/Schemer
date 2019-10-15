package com.example.schemer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.schemer.BackStrength.BackStrengthListActivity;
import com.example.schemer.Lower_Body_Strength.LowerBackStrengthDetailActivity;
import com.example.schemer.Lower_Body_Strength.LowerBackStrengthListActivity;
import com.example.schemer.Upper_Body_Strength.UpperBodyStrengthListActivity;

public class Strength_info extends AppCompatActivity implements View.OnClickListener{

    private CardView Upper_Body;
    private CardView Lower_Body;
    private CardView Back_Body;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength_info);

        Upper_Body = findViewById(R.id.Upper_strength);
        Lower_Body = findViewById(R.id.Lower_strength);
        Back_Body = findViewById(R.id.Back_strength);

        Upper_Body.setOnClickListener(this);
        Lower_Body.setOnClickListener(this);
        Back_Body.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.Upper_strength:
                i = new Intent(this, UpperBodyStrengthListActivity.class);startActivity(i); break;
            case R.id.Lower_strength:
                i = new Intent(this, LowerBackStrengthListActivity.class);startActivity(i); break;
            case R.id.Back_strength:
                i = new Intent(this, BackStrengthListActivity.class);startActivity(i); break;

            default:break;
        }
    }
}
