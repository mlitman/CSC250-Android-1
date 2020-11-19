package com.example.csc250android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button d6_button;
    private Button d20_button;
    private TextView d6_tv;
    private TextView d20_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.d6_button = this.findViewById(R.id.d6_button);
        this.d20_button = this.findViewById(R.id.d20_button);
        this.d6_tv = this.findViewById(R.id.d6_tv);
        this.d20_tv = this.findViewById(R.id.d20_tv);
    }

    public void onButtonClicked(View v)
    {
        //v is the View that called this function
        //Buttons are instances of Views
        //is the button that was push the same as the fname_button
        if(v == this.d6_button)
        {
            Dice d6 = new Dice(6);
            this.d6_tv.setText("" + d6.roll());
        }
        else if(v == this.d20_button)
        {
            Dice d20 = new Dice(20);
            this.d20_tv.setText("" + d20.roll());
        }
    }
}