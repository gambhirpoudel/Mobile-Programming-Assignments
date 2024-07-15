package com.example.assignment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {

    private EditText etName, etAddress, etPhoneNumber;
    private RadioGroup rgGender;
    private RadioButton rbMale, rbFemale;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        etName = findViewById(R.id.etName);
        etAddress = findViewById(R.id.etAddress);
        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                String address = etAddress.getText().toString().trim();
                String phoneNumber = etPhoneNumber.getText().toString().trim();
                String gender = rgGender.getCheckedRadioButtonId() == R.id.rbMale ? "Male" : "Female";

                Intent intent = new Intent(InputActivity.this, DisplayActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("address", address);
                intent.putExtra("phoneNumber", phoneNumber);
                intent.putExtra("gender", gender);
                startActivity(intent);
            }
        });
    }
}
