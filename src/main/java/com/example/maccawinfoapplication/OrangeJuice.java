package com.example.maccawinfoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

public class OrangeJuice extends AppCompatActivity {

    Button buttonOrder;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange_juice);

//      Connect spinner by id
        spinner = findViewById(R.id.spinnerPurchaseQuantity);


//      Order Button setup
        buttonOrder = findViewById(R.id.buttonOrder);
        buttonOrder.setOnClickListener( (view) -> {

            double pricePerUnit = 26.013; // price per unit

//          Get and store selected quantity
            int quantity = Integer.parseInt(spinner.getSelectedItem().toString());

//          Compute total
            double total = (double) quantity * pricePerUnit;

//          Create message
            String message = String.format("%d Orange Juice ordered! Total is LBP %.3f", quantity, total);

//          Make and show snake bar
            Snackbar.make(buttonOrder, message, Snackbar.LENGTH_SHORT).show();

        });
    }
}