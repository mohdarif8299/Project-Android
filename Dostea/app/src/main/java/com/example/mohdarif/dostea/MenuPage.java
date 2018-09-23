package com.example.mohdarif.dostea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MenuPage extends AppCompatActivity {
    ImageView home,menu,about,ice_cream,tea,coffee,cookie;
    EditText value;
    String getValue;
    ImageView search;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);
        home = findViewById(R.id.home);
        menu = findViewById(R.id.menu);
        search = findViewById(R.id.search);
        value = findViewById(R.id.searchitem);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValue = value.getText().toString().trim();
                if (getValue.equalsIgnoreCase("Tea")) {
                    Intent intent = new Intent(getApplicationContext(),Tea.class);
                    startActivity(intent);
                    finish();
                }
                else if (getValue.equalsIgnoreCase("coffee")) {
                    Intent intent = new Intent(getApplicationContext(),Coffee.class);
                    startActivity(intent);
                    finish();
                }
                else if (getValue.equalsIgnoreCase("cookies")) {
                    Intent intent = new Intent(getApplicationContext(),Cookie.class);
                    startActivity(intent);
                    finish();
                }
                else if (getValue.equalsIgnoreCase("icecream")) {
                    Intent intent = new Intent(getApplicationContext(),IceCream.class);
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
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
                finish();
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MenuPage.class);
                startActivity(intent);
                finish();
            }
        });
        tea = findViewById(R.id.tea);
        tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Tea.class);
                startActivity(intent);
                finish();
            }
        });
        ice_cream = findViewById(R.id.ice_cream);
        ice_cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IceCream.class);
                startActivity(intent);
                finish();
            }
        });
        coffee = findViewById(R.id.coffee);
        coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Coffee.class);
                startActivity(intent);
                finish();
            }
        });
        cookie = findViewById(R.id.cookie);
        cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Cookie.class);
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