package com.example.maccawinfoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

public class MangoSensation extends AppCompatActivity {

    Button buttonOrder;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mango_sensation);

//      Connect spinner by id
        spinner = findViewById(R.id.spinnerPurchaseQuantity);


//      Order Button setup
        buttonOrder = findViewById(R.id.buttonOrder);
        buttonOrder.setOnClickListener( (view) -> {
            // to do
        });


    }


}