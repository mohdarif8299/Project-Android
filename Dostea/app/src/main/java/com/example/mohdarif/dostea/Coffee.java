package com.example.mohdarif.dostea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Coffee extends AppCompatActivity {
    Button coffee1,coffee2,coffee3,coffee4,coffee5,coffee6,coffee7,coffee8;
    EditText searchitem;
    ImageView searchButton;
    String value;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coffee);
        searchitem = findViewById(R.id.searchitem);
        searchButton = findViewById(R.id.searchbutton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = searchitem.getText().toString().trim();
                if(value.equalsIgnoreCase("coffee americano")) {
                    Intent intent = new Intent(getApplicationContext(),Coffee1.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("coffee latte")) {
                    Intent intent = new Intent(getApplicationContext(),Coffee2.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("cappuccino")) {
                    Intent intent = new Intent(getApplicationContext(),Coffee3.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("espresso")) {
                    Intent intent = new Intent(getApplicationContext(),Coffee4.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("flat white")) {
                    Intent intent = new Intent(getApplicationContext(),Coffee5.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("long black")) {
                    Intent intent = new Intent(getApplicationContext(),Coffee6.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("irish coffee")) {
                    Intent intent = new Intent(getApplicationContext(),Coffee7.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("macchiato")) {
                    Intent intent = new Intent(getApplicationContext(),Coffee8.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(),NotFound.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        String searchValue = searchitem.getText().toString().trim();
        if (searchValue.equals("Coffee Americano")) {
            Intent intent = new Intent(getApplicationContext(),Coffee1.class);
            startActivity(intent);
            finish();
        }
        coffee1 = findViewById(R.id.coffe1);
        coffee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Coffee1.class);
                startActivity(intent);
                finish();
            }
        });
        coffee2 = findViewById(R.id.coffee2);
        coffee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Coffee2.class);
                startActivity(intent);
                finish();
            }
        });
        coffee3 = findViewById(R.id.coffee3);
        coffee3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Coffee3.class);
                startActivity(intent);
                finish();
            }
        });
        coffee4 = findViewById(R.id.coffee4);
        coffee4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Coffee4.class);
                startActivity(intent);
                finish();
            }
        });
        coffee5 = findViewById(R.id.coffee5);
        coffee5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Coffee5.class);
                startActivity(intent);
                finish();
            }
        });
        coffee6 = findViewById(R.id.coffee6);
        coffee6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Coffee6.class);
                startActivity(intent);
                finish();
            }
        });
        coffee7 = findViewById(R.id.coffee7);
        coffee7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Coffee7.class);
                startActivity(intent);
                finish();
            }
        });
        coffee8 = findViewById(R.id.coffee8);
        coffee8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Coffee8.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),HomePage.class);
        startActivity(intent);
        finish();
    }
}
