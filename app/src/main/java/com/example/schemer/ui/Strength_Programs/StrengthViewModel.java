package com.example.schemer.ui.Strength_Programs;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;

public class StrengthViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    Spinner spinner;
    EditText edData;
    String textData= "";
    DatabaseReference databaseReference;

    public StrengthViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }


}