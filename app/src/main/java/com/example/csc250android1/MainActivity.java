package com.example.csc250android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView quantityTV;
    private TextView diceTV;
    private TextView totalTV;
    private TextView outputTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.quantityTV = this.findViewById(R.id.quantityTV);
        this.diceTV = this.findViewById(R.id.diceTV);
        this.totalTV = this.findViewById(R.id.total_tv);
        this.outputTV = this.findViewById(R.id.output_tv);

        //clear the interface
        this.outputTV.setText("");
        this.totalTV.setText("");
        this.quantityTV.setText("");
    }

    public void onRollButtonPressed(View v)
    {
        int quantity = 1;
        if(this.quantityTV.getText().toString().length() > 0)
        {
            quantity = Integer.parseInt(this.quantityTV.getText().toString());
        }

        String typeOfDice = this.diceTV.getText().toString();
        int numberOfSides = Integer.parseInt(typeOfDice.substring(1));
        Dice d = new Dice(numberOfSides);
        int[] theRolls = new int[quantity];
        int sum = 0;
        String outputString = "";
        for(int i = 0; i < theRolls.length; i++)
        {
            theRolls[i] = d.roll();
            sum += theRolls[i];
            if(outputString.length() == 0)
            {
                outputString += theRolls[i];
            }
            else
            {
                //there must already be something in my output string, so tack on a + each time
                outputString += "+ " + theRolls[i];
            }
        }
        this.outputTV.setText(outputString);
        this.totalTV.setText("" + sum);
    }

    public void onPercentileButtonPressed(View v)
    {
        Dice d100 = new Dice(100);
        outputTV.setText("");
        totalTV.setText("" + d100.roll());
    }

    public void onNumPadButtonPressed(View v)
    {
        Button theButton = (Button)v;
        String currentQuantity = this.quantityTV.getText().toString();
        if(theButton.getText().equals("0") && currentQuantity.length() == 0)
        {
            //don't allow a 0 to start a number
            return;
        }
        currentQuantity += theButton.getText();
        this.quantityTV.setText(currentQuantity);
    }

    public void onDiceButtonPressed(View v)
    {
        ImageButton theButton = (ImageButton)v;
        this.diceTV.setText(theButton.getTag().toString());
    }

    public void onClearButtonPressed(View v)
    {
        this.quantityTV.setText("");
    }
}