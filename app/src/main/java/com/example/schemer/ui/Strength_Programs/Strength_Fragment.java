package com.example.schemer.ui.Strength_Programs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.schemer.R;
import com.example.schemer.Strength_Member;
import com.example.schemer.User_Home_Page;
import com.example.schemer.ui.CustomizedPrograms.CustomizedProgramsViewModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Strength_Fragment extends Fragment {

    private StrengthViewModel strengthViewModelViewModel;
    Spinner spinner;
    EditText StrengthExercise,txtReps,txtSets;
    Button btnStrength;
    DatabaseReference databaseReference;
    Strength_Member strMember;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        strengthViewModelViewModel =
                ViewModelProviders.of(this).get(StrengthViewModel.class);
        View root = inflater.inflate(R.layout.fragment_strength_programs, container, false);
        spinner = (Spinner) root.findViewById(R.id.spinner_strength);
        StrengthExercise = (EditText) root.findViewById(R.id.txtStrExercise);
        txtReps = (EditText) root.findViewById(R.id.txtReps);
        txtSets = (EditText) root.findViewById(R.id.txtSets);
        btnStrength = (Button) root.findViewById(R.id.btnStrength);
        strMember=new Strength_Member();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Strength_Member");
        btnStrength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int reps = Integer.parseInt(txtReps.getText().toString().trim());
                int sets = Integer.parseInt(txtSets.getText().toString().trim());

                strMember.setExercise(StrengthExercise.getText().toString().trim());
                strMember.setRepetition(reps);
                strMember.setSets(sets);

                databaseReference.push().setValue(strMember);
                Toast.makeText(getActivity(),"Data inserted successfully!",Toast.LENGTH_LONG).show();
            }
        });

        strengthViewModelViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;



    }



}