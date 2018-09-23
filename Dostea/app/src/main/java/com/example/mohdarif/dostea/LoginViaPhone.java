package com.example.mohdarif.dostea;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginViaPhone extends AppCompatActivity {
    Button generateOTP;
    EditText mobileNumber;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_via_phone);
        generateOTP = findViewById(R.id.generateOTP);
        mobileNumber = findViewById(R.id.mobileno);
        generateOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String MobileNumber = mobileNumber.getText().toString().trim();
                if (MobileNumber.isEmpty()||MobileNumber.length()<10) {
                    Toast.makeText(getApplicationContext(),"Enter a valid mobile number",Toast.LENGTH_LONG).show();
                    mobileNumber.requestFocus();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(),PhoneVerification.class);
                    startActivity(intent);
                    intent.putExtra("mobile", MobileNumber);
                    finish();
                }
            }
        });
    }
}
