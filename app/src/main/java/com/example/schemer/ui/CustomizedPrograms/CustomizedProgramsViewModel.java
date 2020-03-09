package com.example.schemer.ui.CustomizedPrograms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CustomizedProgramsViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    public CustomizedProgramsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Customized Program fragment");
        myRef.setValue("Hello World");
    }

    public LiveData<String> getText() {
        return mText;
    }
}