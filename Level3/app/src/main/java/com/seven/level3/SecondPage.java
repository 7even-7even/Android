package com.seven.level3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondPage extends AppCompatActivity {
    private TextView tvWelcome, tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        // Initialize TextViews
        tvWelcome = findViewById(R.id.tvWelcome);
        tvDetails = findViewById(R.id.tvDetails);

        // Get Data from Intent
        String name = getIntent().getStringExtra("NAME");
        String email = getIntent().getStringExtra("EMAIL");
        String phone = getIntent().getStringExtra("PHONE");
        String age = getIntent().getStringExtra("AGE");

        // Display Data
        tvWelcome.setText("Welcome, " + name + "!\nBelow is Your Details:\n");

        tvDetails.setText("Email: " + email + "\nPhone: " + phone + "\nAge: " + age);
    }
}
