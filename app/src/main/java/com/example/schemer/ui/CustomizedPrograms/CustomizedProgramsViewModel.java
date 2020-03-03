package com.example.schemer.ui.CustomizedPrograms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CustomizedProgramsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CustomizedProgramsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}