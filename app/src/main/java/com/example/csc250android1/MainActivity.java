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

    public void onFnameButtonClicked(View v)
    {
        TextView myTextView = this.findViewById(R.id.fname_tv);
        myTextView.setText("Mike");
    }

    public void onLnameButtonClicked(View v)
    {
        TextView myTextView = this.findViewById(R.id.lname_tv);
        myTextView.setText("Litman");
    }
}