package com.inspiredmemories.memorions.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

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
}
