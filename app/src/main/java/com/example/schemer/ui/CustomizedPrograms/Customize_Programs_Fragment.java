package com.example.schemer.ui.CustomizedPrograms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.schemer.R;

public class Customize_Programs_Fragment extends Fragment {

    private CustomizedProgramsViewModel customizedProgramsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        customizedProgramsViewModel =
                ViewModelProviders.of(this).get(CustomizedProgramsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_custom_program, container, false);

        customizedProgramsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}