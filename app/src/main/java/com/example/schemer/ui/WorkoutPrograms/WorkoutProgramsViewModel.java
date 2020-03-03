package com.example.schemer.ui.WorkoutPrograms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkoutProgramsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WorkoutProgramsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}