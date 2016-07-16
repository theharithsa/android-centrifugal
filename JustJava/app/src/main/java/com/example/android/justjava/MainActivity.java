package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    /**
     * Variable Declaration*/
    int quantity = 1;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        //Name Field
        EditText getName = (EditText) findViewById(R.id.nameField);
        String setName = getName.getText().toString();

        //Whipped Cream CheckBox
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        //Chocolate Check Box
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();

        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String priceMessage = orderSummary(price, hasWhippedCream, hasChocolate, setName);

        String addresses = "support@inspiredmemories.in";
        String subject = "Order Summary";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:harithsa@inspiredmemories.in")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * @orderSummary returns the summary string
     */
    private String orderSummary(int price, boolean haswhippedCream, boolean hasChocolate, String setName){
        String summary = "Name: " + setName + "\n" + "Whipped Cream - " + haswhippedCream + "\n" + "Chocolate - " + hasChocolate + "\n" + "Quantity: " + quantity + "\n" + "Total: Rs." + price + ".00" + "\n" + "Thank You!!";
        return summary;
    }

    /**
     * @calculatePrice returns the total amount
     */
    private int calculatePrice(boolean a, boolean b) {
        int basePrice = 5;
        //Condition for WhippedCream Check Box
        if(a) {
            basePrice += 1;
        }
        //Condition for Chocolate CheckBox
        if(b){
            basePrice += 2;
        }

        int price = quantity * basePrice;
        return price;
    }

    /**
     * Method to Increment the Orders when +button is clicked
     */
    public void Increment(View view) {
        if (quantity <= 100) {
            quantity = quantity + 1;
            display(quantity);
        } else {
            Toast.makeText(this, "We Can't Prepare More than 100 Coffees at a time", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Method to Decrement the Orders when - Button is clicked
     */
    public void Decrement(View view) {
        if (quantity > 1) {
            quantity = quantity - 1;
            display(quantity);
        } else {
            Toast.makeText(this, "You Cant Order NUll!!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /*
    * Method to Display Message onto screen
    */
//    private void displayMessage(String message) {
//        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary__text_view);
//        orderSummaryTextView.setText(message);
//    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.justjava/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.justjava/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}