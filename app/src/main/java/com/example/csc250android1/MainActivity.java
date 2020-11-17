package com.example.csc250android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View v)
    {
        TextView myTextView = this.findViewById(R.id.myTextView);
        myTextView.setText("Hello World!!!");
    }
}