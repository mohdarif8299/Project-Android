package com.example.mohdarif.dostea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Cookie extends AppCompatActivity {
    Button cookie1,cookie2,cookie3,cookie4,cookie5,cookie6,cookie7,cookie8;
    EditText searchitem;
    ImageView searchButton;
    String value;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cookie);
        searchitem = findViewById(R.id.searchitem);
        searchButton = findViewById(R.id.searchbutton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = searchitem.getText().toString().trim();
                if(value.equalsIgnoreCase("Dark Chocolate Pistachio Sea Salt Cookies")) {
                    Intent intent = new Intent(getApplicationContext(),Cookie1.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("Cinnamon Roll Sugar Cookies")) {
                    Intent intent = new Intent(getApplicationContext(),Cookie2.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("Brown Butter Oatmeal Cookies")) {
                    Intent intent = new Intent(getApplicationContext(),Cookie3.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("Kitsilano Cookies")) {
                    Intent intent = new Intent(getApplicationContext(),Cookie4.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("Brown Butter Bourbon Spice Cookies")) {
                    Intent intent = new Intent(getApplicationContext(),Cookie5.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("Jelly Sandwich Cookies")) {
                    Intent intent = new Intent(getApplicationContext(),Cookie6.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("Caramel Pecan Snickerdoodle Cookies")) {
                    Intent intent = new Intent(getApplicationContext(),Cookie7.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("Apricot Pistachio Oatmeal Cookies")) {
                    Intent intent = new Intent(getApplicationContext(),Cookie8.class);
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
        cookie1 = findViewById(R.id.cookie1);
        cookie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cookie1.class);
                startActivity(intent);
                finish();
            }
        });
        cookie2 = findViewById(R.id.cookie2);
        cookie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cookie2.class);
                startActivity(intent);
                finish();
            }
        });
        cookie3 = findViewById(R.id.cookie3);
        cookie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cookie3.class);
                startActivity(intent);
                finish();
            }
        });
        cookie4 = findViewById(R.id.cookie4);
        cookie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cookie4.class);
                startActivity(intent);
                finish();
            }
        });
        cookie5 = findViewById(R.id.cookie5);
        cookie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cookie5.class);
                startActivity(intent);
                finish();
            }
        });
        cookie6 = findViewById(R.id.cookie6);
        cookie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cookie6.class);
                startActivity(intent);
                finish();
            }
        });
        cookie7 = findViewById(R.id.cookie7);
        cookie7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cookie7.class);
                startActivity(intent);
                finish();
            }
        });
        cookie8 = findViewById(R.id.cookie8);
        cookie8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cookie8.class);
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
