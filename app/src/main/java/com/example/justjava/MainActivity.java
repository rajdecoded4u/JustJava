package com.example.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        String priceMessage = onOrderSummary(price);
        displayMessage(priceMessage);
    }

    public void increment(View view){
        quantity = quantity+1;
        display(quantity);

    }

    public void decrement(View view){
        quantity = quantity-1;
        display(quantity);
    }
    private int  calculatePrice(){
        return 5*quantity;
    }

    private String onOrderSummary(int price){
        String priceMessage = "Name : Raj Chanhcal \n";
        priceMessage+="Quantity : "+quantity+"\n";
        priceMessage+="Total: "+price+"\n";
        priceMessage+="Thank You!";
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
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }
}