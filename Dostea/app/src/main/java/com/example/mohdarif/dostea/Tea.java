package com.example.mohdarif.dostea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Tea extends AppCompatActivity {
    Button tea1,tea2,tea3,tea4,tea5,tea6,tea7,tea8;
    EditText searchitem;
    ImageView searchButton;
    String value;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tea);
        searchitem = findViewById(R.id.searchitem);
        searchButton = findViewById(R.id.searchbutton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = searchitem.getText().toString().trim();
                if(value.equalsIgnoreCase("white tea")) {
                    Intent intent = new Intent(getApplicationContext(),Tea1.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("green tea")) {
                    Intent intent = new Intent(getApplicationContext(),Tea2.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("oolong tea")) {
                    Intent intent = new Intent(getApplicationContext(),Tea3.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("black tea")) {
                    Intent intent = new Intent(getApplicationContext(),Tea4.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("herbal tea")) {
                    Intent intent = new Intent(getApplicationContext(),Tea5.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("rooibos tea")) {
                    Intent intent = new Intent(getApplicationContext(),Tea6.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("mate tea")) {
                    Intent intent = new Intent(getApplicationContext(),Tea7.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("bloomy tea")) {
                    Intent intent = new Intent(getApplicationContext(),Tea8.class);
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
        tea1 = findViewById(R.id.tea1);
        tea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tea1.class);
                startActivity(intent);
                finish();
            }
        });
        tea2 = findViewById(R.id.tea2);
        tea2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tea2.class);
                startActivity(intent);
                finish();
            }
        });
        tea3 = findViewById(R.id.tea3);
        tea3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tea3.class);
                startActivity(intent);
                finish();
            }
        });
        tea4 = findViewById(R.id.tea4);
        tea4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tea4.class);
                startActivity(intent);
                finish();
            }
        });
        tea5 = findViewById(R.id.tea5);
        tea5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tea5.class);
                startActivity(intent);
                finish();
            }
        });
        tea6 = findViewById(R.id.tea6);
        tea6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tea6.class);
                startActivity(intent);
                finish();
            }
        });
        tea7 = findViewById(R.id.tea7);
        tea7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tea7.class);
                startActivity(intent);
                finish();
            }
        });
        tea8 = findViewById(R.id.tea8);
        tea8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tea8.class);
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
