package com.example.layoutinflatordemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get a reference to the already created activity
        LinearLayout mainLayout = findViewById(R.id.activity_main_layout);
        //inflate another copy of your layout

        LayoutInflater inflater = getLayoutInflater();
        View mylayout = inflater.inflate(R.layout.my_layout,mainLayout,false);

        //make change to our custom layout and its subview
        mylayout.setBackgroundColor(ContextCompat.getColor(this,R.color.purple_500));
        TextView textView = mylayout.findViewById(R.id.textView);
        textView.setText("New Layout");

        //add your custom layout to main layout
        mainLayout.addView(mylayout);

    }
}