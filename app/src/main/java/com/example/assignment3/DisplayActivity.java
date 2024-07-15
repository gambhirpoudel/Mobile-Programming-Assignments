package com.example.assignment3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    private TextView tvName, tvAddress, tvGender, tvPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvName = findViewById(R.id.tvName);
        tvAddress = findViewById(R.id.tvAddress);
        tvGender = findViewById(R.id.tvGender);
        tvPhoneNumber = findViewById(R.id.tvPhoneNumber);

        String name = getIntent().getStringExtra("name");
        String address = getIntent().getStringExtra("address");
        String phoneNumber = getIntent().getStringExtra("phoneNumber");
        String gender = getIntent().getStringExtra("gender");

        tvName.setText("Name: " + name);
        tvAddress.setText("Address: " + address);
        tvGender.setText("Gender: " + gender);
        tvPhoneNumber.setText("Phone Number: " + phoneNumber);
    }
}
