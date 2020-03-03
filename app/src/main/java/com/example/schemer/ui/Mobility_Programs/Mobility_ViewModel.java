package com.example.schemer.ui.Mobility_Programs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Mobility_ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Mobility_ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}