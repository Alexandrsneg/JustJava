package com.example.android.justjava;



import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    int price = 10;

    String text = "ИТОГО: ";

    public void increment(View view) {

        display(++quantity);

    }

    public void decrement(View view) {
        if (quantity>0){
            display(--quantity);
        }
        else {
            display(0);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(text + (quantity * price));
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("quantity", quantity);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        quantity = savedInstanceState.getInt("quantity");
        
    }

}
    /**
     * This method displays the given price on the screen.
     */
   /** private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }*/

