package com.example.schemer.ui.Cardio_Programs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.schemer.R;
import com.example.schemer.ui.CustomizedPrograms.CustomizedProgramsViewModel;

public class Cardio_Fragment extends Fragment {

    private CardioViewModel cardioViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cardioViewModel =
                ViewModelProviders.of(this).get(CardioViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cardio_programs, container, false);

        cardioViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}