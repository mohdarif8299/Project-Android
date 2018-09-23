package com.example.mohdarif.dostea;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tea4 extends AppCompatActivity {
    Button confirm,add,sub;
    TextView value,amount;
    int countOrderId=1,countOrderNumber=1;
    final float initailAmount = (float) 25.00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tea4);
        value = findViewById(R.id.value);
        amount = findViewById(R.id.amount);
        add = findViewById(R.id.plusicon);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countOrderNumber++;
                if (countOrderNumber>10)  {
                    Toast.makeText(getApplicationContext(),"maximum quantity only 10 at a time",Toast.LENGTH_LONG).show();
                }
                else{
                    value.setText(""+countOrderNumber);
                    amount.setText(""+initailAmount*countOrderNumber);
                }
            }
        });
        sub = findViewById(R.id.minus);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countOrderNumber--;
                if (countOrderNumber<1) {
                    Toast.makeText(getApplicationContext(),"only 1 selected",Toast.LENGTH_LONG).show();
                }
                else {
                    value.setText(""+countOrderNumber);
                    amount.setText(""+initailAmount*countOrderNumber);
                }
            }
        });
        confirm = findViewById(R.id.orderButton);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countOrderId++;
                addNotification();
                Intent intent = new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.notificationicon)
                        .setContentTitle("Dostea")
                        .setContentText("Order Confirmed Your OrderID is"+countOrderId+"Black Tea");
        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),Tea.class);
        startActivity(intent);
        finish();
    }
}
