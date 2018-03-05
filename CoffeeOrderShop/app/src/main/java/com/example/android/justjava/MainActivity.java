/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        /*EditText editText = (EditText) findViewById(R.id.name);
        String name = editText.getText().toString();

        CheckBox checkBoxView = findViewById(R.id.whipped_cream_chbx);
        Boolean hasWhippedCream = checkBoxView.isChecked();
        Log.i("MainActivity"," Has Whipped Cream "+ hasWhippedCream);

        CheckBox checkBoxChocoView = findViewById(R.id.chocolate_chbx);
        Boolean hasChocoCream = checkBoxChocoView.isChecked();
        Log.i("MainActivity"," Has Chocolate "+ hasChocoCream);

        //String totalAmt = NumberFormat.getCurrencyInstance().format(quantity*5);
        int price = quantity*5;
        if (hasWhippedCream == true) {
            price += quantity*2;
        }

        if(hasChocoCream == true){
            price += quantity*1;
        }

        String priceMessage = createOrderSummary(name, price, hasWhippedCream, hasChocoCream);
        displayPrice(priceMessage);*/

        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("geo:47.6, -123.3"));
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }
    }

    private String createOrderSummary(String name, int price, boolean hasWhippedCream, boolean hasChocoCream) {
        String priceMessage = "Name: "+name;
        priceMessage += "\nAdd Whipped Cream? " + hasWhippedCream;
        priceMessage += "\nAdd Chocolate? " + hasChocoCream;
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: "+ NumberFormat.getCurrencyInstance().format(price);;
        priceMessage += "\nThank you";
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    public void increment(View view) {

        quantity += 1;
        if(quantity > 10) {
            quantity = 10;
            Toast.makeText(MainActivity.this, "You cannot order more than 10 coffee!",
                    Toast.LENGTH_LONG).show();
        }
        display(quantity);
        displayPrice("Amount: " +NumberFormat.getCurrencyInstance().format(quantity * 5));
    }

    public void decrement(View view) {
        quantity -= 1;
        if (quantity <= 0) {
            quantity = 0;
            Toast.makeText(MainActivity.this, "You cannot order less than 0 coffee!",
                    Toast.LENGTH_LONG).show();
        }
        display(quantity);
        displayPrice("Amount: " +NumberFormat.getCurrencyInstance().format(quantity * 5));
    }
}