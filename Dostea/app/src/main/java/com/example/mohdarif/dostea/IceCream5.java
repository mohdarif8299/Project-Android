package com.example.mohdarif.dostea;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IceCream5 extends AppCompatActivity {
    Button confirm,add,sub;
    TextView value,amount;
    EditText getMobile;
    int countOrderId=1,countOrderNumber=1,countOrder=0;
    final float initailAmount = (float) 109.00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icecream5);
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
                countOrderId++;
                countOrder++;
                String number = getMobile.getText().toString().trim();
                if (number.isEmpty()||number.length()<10) {
                    Toast.makeText(getApplicationContext(),"Enter a valid number",Toast.LENGTH_LONG).show();
                    getMobile.requestFocus();
                }
                else {
                    addNotification();
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0);

                    //Get the SmsManager instance and call the sendTextMessage method to send message
                    SmsManager sms= SmsManager.getDefault();
                    sms.sendTextMessage(number, null, "Your Order for "+countOrderNumber+ "  Butter Scotch has been confirmed Kindly Pay Rs "+amount.getText(), null,null);

                    Toast.makeText(getApplicationContext(), "Order recieved successfully!",
                            Toast.LENGTH_LONG).show();
                    Intent intent1 = new Intent(getApplicationContext(),IceCream.class);
                    startActivity(intent1);
                }
            }
        });
        getMobile = findViewById(R.id.getMobile);
        confirm = findViewById(R.id.orderButton);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countOrderId++;
                countOrder++;
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
                        .setContentText("Thanks for Ordering with us !!");
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
        Intent intent = new Intent(getApplicationContext(),IceCream.class);
        startActivity(intent);
        finish();
    }
}
