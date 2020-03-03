package com.example.schemer.ui.WorkoutPrograms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.schemer.R;

public class WorkoutProgramsFragment extends Fragment implements View.OnClickListener {

    private WorkoutProgramsViewModel workoutProgramsViewModel;

    @Nullable
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        workoutProgramsViewModel =
                ViewModelProviders.of(this).get(WorkoutProgramsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_workout_programs, container, false);

        workoutProgramsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;


    }

    @Override
    public void onClick(View view) {

    }
}