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

    /**
     * Function that returns the solution check for Question 1
     * @return true or false
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
     * Function that returns the solution check for Question 2
     * @return true or false
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

        return hasGatesChecked && hasPaulChecked && !hasJobsChecked && !hasTimCheckBox;
    }
    /**
     * Function that returns the solution check for Question 3
     * @return true or false
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
     * Function that returns the solution check for Question 4
     * @return true or false
     */
    private boolean answerQ4(){
        EditText androidOsText = (EditText) findViewById(R.id.os_EditText);
        String hasAndroidOs = androidOsText.getText().toString();
        androidOsText.setFocusable(false);
        String Cupcake = "Cupcake";

        return hasAndroidOs.equals(Cupcake);
    }

    /**
     * Function that returns the solution check for Question 5
     *
     * @return true or false
     */
    private boolean answerQ5() {
        //Creating Objects of CheckBoxes
        CheckBox steveCheckBox = (CheckBox) findViewById(R.id.steve_jobs_chcekBox);
        CheckBox weaslyCheckBox = (CheckBox) findViewById(R.id.ronald_weasly_chcekBox);
        CheckBox wayneCheckBox = (CheckBox) findViewById(R.id.ronald_wayne_chcekBox);
        CheckBox wozniakCheckBox = (CheckBox) findViewById(R.id.steve_wozniak__chcekBox);

        //Assigning Checked Boolean Status to another Boolean Variable
        boolean hasSteveChecked = steveCheckBox.isChecked();
        boolean hasWeaslyChecked = weaslyCheckBox.isChecked();
        boolean hasWayneChecked = wayneCheckBox.isChecked();
        boolean hasWozniakChecked = wozniakCheckBox.isChecked();

        //Disabling after Answering the Questions
        steveCheckBox.setClickable(false);
        weaslyCheckBox.setClickable(false);
        wayneCheckBox.setClickable(false);
        wozniakCheckBox.setClickable(false);

        return hasSteveChecked && hasWayneChecked && hasWozniakChecked && !hasWeaslyChecked;
    }

    /**
     * Function that returns the solution check for Question 6
     *
     * @return true or false
     */
    private boolean answerQ6() {
        EditText planetText = (EditText) findViewById(R.id.planet_EditText);
        String hasPlanet = planetText.getText().toString();
        planetText.setFocusable(false);
        String neptune = "Neptune";

        return hasPlanet.equals(neptune);
    }

    /**
     * Function that returns the solution check for Question 7
     *
     * @return true or false
     */
    private boolean answerQ7() {
        EditText oceanText = (EditText) findViewById(R.id.ocean_EditText);
        String hasOcean = oceanText.getText().toString();
        oceanText.setFocusable(false);
        String pacific = "Pacific";

        return hasOcean.equals(pacific);
    }

    /**
     * Function that returns the solution check for Question 8
     *
     * @return true or false
     */
    private boolean answerQ8() {
        //Creating Objects and Assigning the isChecked values to the variable of type boolean
        RadioButton dark = (RadioButton) findViewById(R.id.dark_radioButton);
        boolean hasDark = dark.isChecked();
        dark.setClickable(false);
        RadioButton blue = (RadioButton) findViewById(R.id.blue_radioButton);
        boolean hasBlue = blue.isChecked();
        blue.setClickable(false);
        RadioButton orange = (RadioButton) findViewById(R.id.orange_radioButton);
        boolean hasOrange = orange.isChecked();
        orange.setClickable(false);

        // Returning true iff Dark button is checked
        if (hasDark) {
            return true;
        } else if (hasBlue || hasOrange) {
            return false;
        } else {
            return false;
        }
    }

    /**
     * Function that returns the solution check for Question 9
     *
     * @return true or false
     */
    private boolean answerQ9() {
        //Creating Objects of CheckBoxes
        CheckBox editTextCheckBox = (CheckBox) findViewById(R.id.edit_text_checkBox);
        CheckBox viewBoxCheckBox = (CheckBox) findViewById(R.id.view_box_checkBox);
        CheckBox imageViewCheckBox = (CheckBox) findViewById(R.id.image_view_checkBox);
        CheckBox textViewCheckBox = (CheckBox) findViewById(R.id.text_view_checkBox);

        //Assigning Checked Boolean Status to another Boolean Variable
        boolean hasEditTextChecked = editTextCheckBox.isChecked();
        boolean hasViewBoxChecked = viewBoxCheckBox.isChecked();
        boolean hasImageViewChecked = imageViewCheckBox.isChecked();
        boolean hasTextViewChecked = textViewCheckBox.isChecked();

        //Disabling after Answering the Questions
        editTextCheckBox.setClickable(false);
        viewBoxCheckBox.setClickable(false);
        imageViewCheckBox.setClickable(false);
        textViewCheckBox.setClickable(false);

        return hasEditTextChecked && !hasViewBoxChecked && hasImageViewChecked && hasTextViewChecked;
    }

    /**
     * Function that returns the solution check for Question 10
     *
     * @return true or false
     */
    private boolean answerQ10() {
        //Creating Objects of CheckBoxes
        CheckBox mozillaCheckBox = (CheckBox) findViewById(R.id.mozilla_checkBox);
        CheckBox androidCheckBox = (CheckBox) findViewById(R.id.android_checkBox);
        CheckBox iosCheckBox = (CheckBox) findViewById(R.id.ios_checkBox);
        CheckBox windowsCheckBox = (CheckBox) findViewById(R.id.windows_checkBox);

        //Assigning Checked Boolean Status to another Boolean Variable
        boolean hasMozillaChecked = mozillaCheckBox.isChecked();
        boolean hasAndroidChecked = androidCheckBox.isChecked();
        boolean hasiOSChecked = iosCheckBox.isChecked();
        boolean hasWindowsChecked = windowsCheckBox.isChecked();

        //Disabling after Answering the Questions
        mozillaCheckBox.setClickable(false);
        androidCheckBox.setClickable(false);
        iosCheckBox.setClickable(false);
        windowsCheckBox.setClickable(false);

        return hasMozillaChecked && hasAndroidChecked && hasiOSChecked && hasWindowsChecked;
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
        boolean answerQ5 = answerQ5();
        boolean answerQ6 = answerQ6();
        boolean answerQ7 = answerQ7();
        boolean answerQ8 = answerQ8();
        boolean answerQ9 = answerQ9();
        boolean answerQ10 = answerQ10();
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
        prevCheckRes = res;
        //Question 5 Condition
        if (answerQ5) {
            res = res + 1;
        } else
            res = prevCheckRes;
        prevCheckRes = res;
        //Question 6 Condition
        if (answerQ6) {
            res = res + 1;
        } else
            res = prevCheckRes;
        prevCheckRes = res;
        //Question 7 Condition
        if (answerQ7) {
            res = res + 1;
        } else
            res = prevCheckRes;
        prevCheckRes = res;
        //Question 8 Condition
        if (answerQ8) {
            res = res + 1;
        } else
            res = prevCheckRes;
        prevCheckRes = res;
        //Question 8 Condition
        if (answerQ9) {
            res = res + 1;
        } else
            res = prevCheckRes;
        prevCheckRes = res;
        //Question 10 Condition
        if (answerQ10) {
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

    public void reset(View view) {
        RadioButton lisbon = (RadioButton) findViewById(R.id.lisbon_radioButton);
        RadioButton newYork = (RadioButton) findViewById(R.id.newyork_radioButton);
        RadioButton stockholm = (RadioButton) findViewById(R.id.stockholm_radioButton);
        RadioButton nile = (RadioButton) findViewById(R.id.nile_radioButton);
        RadioButton yangtze = (RadioButton) findViewById(R.id.yangtze_radioButton);
        RadioButton amazon = (RadioButton) findViewById(R.id.amazon_radioButton);
        RadioButton dark = (RadioButton) findViewById(R.id.dark_radioButton);
        RadioButton blue = (RadioButton) findViewById(R.id.blue_radioButton);
        RadioButton orange = (RadioButton) findViewById(R.id.orange_radioButton);

        CheckBox gatesCheckBox = (CheckBox) findViewById(R.id.bill_gates_chcekBox);
        CheckBox paulCheckBox = (CheckBox) findViewById(R.id.paul_allen_chcekBox);
        CheckBox jobsCheckBox = (CheckBox) findViewById(R.id.steve_chcekBox);
        CheckBox timCheckBox = (CheckBox) findViewById(R.id.tim_chcekBox);
        CheckBox steveCheckBox = (CheckBox) findViewById(R.id.steve_jobs_chcekBox);
        CheckBox weaslyCheckBox = (CheckBox) findViewById(R.id.ronald_weasly_chcekBox);
        CheckBox wayneCheckBox = (CheckBox) findViewById(R.id.ronald_wayne_chcekBox);
        CheckBox wozniakCheckBox = (CheckBox) findViewById(R.id.steve_wozniak__chcekBox);
        CheckBox editTextCheckBox = (CheckBox) findViewById(R.id.edit_text_checkBox);
        CheckBox viewBoxCheckBox = (CheckBox) findViewById(R.id.view_box_checkBox);
        CheckBox imageViewCheckBox = (CheckBox) findViewById(R.id.image_view_checkBox);
        CheckBox textViewCheckBox = (CheckBox) findViewById(R.id.text_view_checkBox);
        CheckBox mozillaCheckBox = (CheckBox) findViewById(R.id.mozilla_checkBox);
        CheckBox androidCheckBox = (CheckBox) findViewById(R.id.android_checkBox);
        CheckBox iosCheckBox = (CheckBox) findViewById(R.id.ios_checkBox);
        CheckBox windowsCheckBox = (CheckBox) findViewById(R.id.windows_checkBox);

        EditText androidOsText = (EditText) findViewById(R.id.os_EditText);
        EditText planetText = (EditText) findViewById(R.id.planet_EditText);
        EditText oceanText = (EditText) findViewById(R.id.ocean_EditText);

        lisbon.setClickable(true);
        newYork.setClickable(true);
        stockholm.setClickable(true);
        nile.setClickable(true);
        yangtze.setClickable(true);
        amazon.setClickable(true);
        dark.setClickable(true);
        blue.setClickable(true);
        orange.setClickable(true);

        gatesCheckBox.setClickable(true);
        paulCheckBox.setClickable(true);
        jobsCheckBox.setClickable(true);
        timCheckBox.setClickable(true);
        steveCheckBox.setClickable(true);
        weaslyCheckBox.setClickable(true);
        wayneCheckBox.setClickable(true);
        wozniakCheckBox.setClickable(true);
        editTextCheckBox.setClickable(true);
        viewBoxCheckBox.setClickable(true);
        imageViewCheckBox.setClickable(true);
        textViewCheckBox.setClickable(true);
        mozillaCheckBox.setClickable(true);
        androidCheckBox.setClickable(true);
        iosCheckBox.setClickable(true);
        windowsCheckBox.setClickable(true);

        androidOsText.setFocusable(true);
        planetText.setFocusable(true);
        oceanText.setFocusable(true);
    }
}
