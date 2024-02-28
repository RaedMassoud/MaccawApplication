package com.example.maccawinfoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button MangoSensation, OrangeJuice, AppleNectar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//      Link Button objects to xml buttons
        MangoSensation = findViewById(R.id.buttonMango);
        OrangeJuice = findViewById(R.id.buttonOrangeJuice);
        AppleNectar = findViewById(R.id.buttonAppleNectar);

//      Start Mango Info View
        MangoSensation.setOnClickListener( (view) -> {
            Intent intent = new Intent(MainActivity.this, MangoSensation.class);
            startActivity(intent);

        });

//      Start Orange Info View
        OrangeJuice.setOnClickListener( (view) -> {
                    Intent intent = new Intent(MainActivity.this, OrangeJuice.class);
                    startActivity(intent);
                }
        );

//      Start Apple Info View
        AppleNectar.setOnClickListener( (view) -> {
                    Intent intent = new Intent(MainActivity.this, AppleNectar.class);
                    startActivity(intent);
                }
        );

    }
}