package com.example.mohdarif.dostea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class IceCream extends AppCompatActivity {
    Button ice1,ice2,ice3,ice4,ice5,ice6,ice7,ice8;
    EditText searchitem;
    ImageView searchButton;
    String value;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ice_cream);
        searchitem = findViewById(R.id.searchitem);
        searchButton = findViewById(R.id.searchbutton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = searchitem.getText().toString().trim();
                if(value.equalsIgnoreCase("vanilla icecream")) {
                    Intent intent = new Intent(getApplicationContext(),IceCream1.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("cherry icecream")) {
                    Intent intent = new Intent(getApplicationContext(),IceCream2.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("Banana icecream")) {
                    Intent intent = new Intent(getApplicationContext(),IceCream3.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("chocolate cherry")) {
                    Intent intent = new Intent(getApplicationContext(),IceCream4.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("butter scotch")) {
                    Intent intent = new Intent(getApplicationContext(),IceCream5.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("choco milk")) {
                    Intent intent = new Intent(getApplicationContext(),IceCream6.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("butter cream")) {
                    Intent intent = new Intent(getApplicationContext(),IceCream7.class);
                    startActivity(intent);
                    finish();
                }
                else if(value.equalsIgnoreCase("choco cream")) {
                    Intent intent = new Intent(getApplicationContext(),IceCream8.class);
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
        ice1 = findViewById(R.id.ice1);
        ice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IceCream1.class);
                startActivity(intent);
                finish();
            }
        });
        ice2 = findViewById(R.id.ice2);
        ice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IceCream2.class);
                startActivity(intent);
                finish();
            }
        });
        ice3 = findViewById(R.id.ice3);
        ice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IceCream3.class);
                startActivity(intent);
                finish();
            }
        });
        ice4 = findViewById(R.id.ice4);
        ice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IceCream4.class);
                startActivity(intent);
                finish();
            }
        });
        ice5 = findViewById(R.id.ice5);
        ice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IceCream5.class);
                startActivity(intent);
                finish();
            }
        });
        ice6 = findViewById(R.id.ice6);
        ice6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IceCream6.class);
                startActivity(intent);
                finish();
            }
        });
        ice7 = findViewById(R.id.ice7);
        ice7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IceCream7.class);
                startActivity(intent);
                finish();
            }
        });
        ice8 = findViewById(R.id.ice8);
        ice8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IceCream8.class);
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
