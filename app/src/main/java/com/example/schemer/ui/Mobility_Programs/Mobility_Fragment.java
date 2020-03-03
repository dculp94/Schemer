package com.example.schemer.ui.Mobility_Programs;

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

public class Mobility_Fragment extends Fragment {

    private Mobility_ViewModel mobilityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mobilityViewModel =
                ViewModelProviders.of(this).get(Mobility_ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mobility_programs, container, false);

        mobilityViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}