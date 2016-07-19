package com.inspiredmemories.memorions.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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
        lisbon.setClickable(false);
        RadioButton newYork = (RadioButton) findViewById(R.id.newyork_radioButton);
        boolean hasNewyork = newYork.isChecked();
        newYork.setClickable(false);
        RadioButton stockholm = (RadioButton) findViewById(R.id.stockholm_radioButton);
        boolean hasStockholm = stockholm.isChecked();
        stockholm.setClickable(false);

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
     * Function for Question 2
     */
    private boolean answerQ2() {
        //Creating Objects of CheckBoxes
        CheckBox gatesCheckBox = (CheckBox) findViewById(R.id.bill_gates_chcekBox);
        CheckBox paulCheckBox = (CheckBox) findViewById(R.id.paul_allen_chcekBox);
        CheckBox jobsCheckBox = (CheckBox) findViewById(R.id.steve_chcekBox);
        CheckBox timCheckBox = (CheckBox) findViewById(R.id.tim_chcekBox);

        //Assigning Checked Boolean Status to another Boolean Variable
        boolean hasGatesChecked = gatesCheckBox.isChecked();
        boolean hasPaulChecked = paulCheckBox.isChecked();
        boolean hasJobsChecked = jobsCheckBox.isChecked();
        boolean hasTimCheckBox = timCheckBox.isChecked();

        //Disabling after Answering the Questions
        gatesCheckBox.setClickable(false);
        paulCheckBox.setClickable(false);
        jobsCheckBox.setClickable(false);
        timCheckBox.setClickable(false);

        if (hasGatesChecked && hasPaulChecked && !hasJobsChecked && !hasTimCheckBox){
            return true;
        } else
            return false;
    }
    /**
     * Function for validating the Answer for the Third question
     * @return Answer checked is true or false for Question 3
     */
    private boolean answerQ3 () {
        //Creating Objects and Assigning the isChecked values to the variable of type boolean
        RadioButton nile = (RadioButton) findViewById(R.id.nile_radioButton);
        boolean hasNile = nile.isChecked();
        nile.setClickable(false);
        RadioButton yangtze = (RadioButton) findViewById(R.id.yangtze_radioButton);
        boolean hasYangtze = yangtze.isChecked();
        yangtze.setClickable(false);
        RadioButton amazon = (RadioButton) findViewById(R.id.amazon_radioButton);
        boolean hasAmazon = amazon.isChecked();
        amazon.setClickable(false);

        // Returning true iff Nile button is checked
        if(hasNile){
            return true;
        } else if(hasYangtze || hasAmazon) {
            return false;
        } else{
            return false;
        }
    }

    /**
     * Function to Return the boolean Solution to Final Call of Question 4
     */
    private boolean answerQ4(){
        EditText androidOsText = (EditText) findViewById(R.id.os_EditText);
        String hasAndroidOs = androidOsText.getText().toString();
        androidOsText.setFocusable(false);
        String Cupcake = "Cupcake";

        if(hasAndroidOs.equals(Cupcake)){
            return true;
        } else
            return false;
    }

    /**
     * Final Call Result Button
     */
    public void finalCall(View view) {
        String status;
        boolean answerQ1 = answerQ1();
        boolean answerQ2 = answerQ2();
        boolean answerQ3 = answerQ3();
        boolean answerQ4 = answerQ4();
        Toast.makeText(this, "Your answers are Frozen!!", Toast.LENGTH_SHORT).show();

        //Question 1 Condition
        if (answerQ1){
            res = 1;
        } else
            res = 0;
        int prevCheckRes = res;

        //Question 2 Condition
        if(answerQ2) {
            res = res + 1;
        } else
            res = prevCheckRes;
        prevCheckRes = res;

        //Question 3 Condition
        if (answerQ3){
            res = res + 1;
        } else
            res = prevCheckRes;
        prevCheckRes = res;

        //Question 4 Condition
        if(answerQ4){
            res = res + 1;
        } else
            res = prevCheckRes;

        String result = res + "/10";
        displayResult(result);
    }

    /**
     * Calling Mail App to Mail the Result
     * @param view
     */
    public void mailFinalCall(View view){

        String status;
        if(res < 5) {
            status = "Failed";
        } else if ( res > 7) {
            status = "Brilliant";
        } else{
            status = "Passed";
        }
        String subject = "Quiz Results!";
        String message = "The Quiz Score is " + res + "/10" + "\n" + "You are " + status + "\n\n\n\n" + "Regards," + "\n" +  "Inspired Memories," + "\n" + "India - 572129";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:harithsa@inspiredmemories.in")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    /**
     * Function to Display the Result
     * @param result
     */
    public void displayResult(String result){
        TextView finalResult = (TextView) findViewById(R.id.final_TextView);
        finalResult.setVisibility(View.VISIBLE);
        finalResult.setText(result);
    }
}
