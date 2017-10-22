package com.example.mohammad.testapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.example.mohammad.testapplication.Model;

/**
 * Created by mohammad on 10/19/2017.
 */

public class MainView extends BaseObservable {


    private String editText;
    private String textView;
    @Bindable
    public String getEditText() {
        return editText;
    }
    //commite dovom
    public void setEditText(String editText) {
        this.editText = editText;
    }

    @Bindable
    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }
    public View.OnClickListener onClickListener(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Model().method(editText,textView);
                notifyPropertyChanged(com.example.mohammad.testapplication.BR.textView);
            }
        };
    }
}
