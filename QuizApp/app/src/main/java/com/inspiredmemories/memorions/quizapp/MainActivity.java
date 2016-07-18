package com.inspiredmemories.memorions.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Variable Declarations
     * @param savedInstanceState
     */
    int res = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.lisbon_radioButton:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.stockholm_radioButton:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.newyork_radioButton:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
    /**
     * Function for valiudating the Answer for the first question
     * @return Answer checked is true or false for Question 1
     */
    private boolean answerQ1 () {
        //Creating Objects and Assigning the isChecked values to the variable of type boolean
        RadioButton lisbon = (RadioButton) findViewById(R.id.lisbon_radioButton);
        boolean hasLisbon = lisbon.isChecked();
        RadioButton newYork = (RadioButton) findViewById(R.id.newyork_radioButton);
        boolean hasNewyork = newYork.isChecked();
        RadioButton stockholm = (RadioButton) findViewById(R.id.stockholm_radioButton);
        boolean hasStockholm = stockholm.isChecked();


        // Returning true iff Lisbon button is checked
        if(hasLisbon)
        {
            return true;
        } else if(hasNewyork || hasStockholm) {
            return false;
        } else
        {
            return false;
        }
    }

    /**
     * Final Call
     */
    public void finalCall(View view) {
        boolean answerQ1 = answerQ1();
        Log.v("MainActivity", "Answer" + answerQ1);
        if (answerQ1){
            res = 1;
        } else
            res = 0;

        String result = res + "/10";
        displayResult(result);
    }

    public void displayResult(String result){
        TextView finalResult = (TextView) findViewById(R.id.final_TextView);
        finalResult.setText(result);
    }
}
