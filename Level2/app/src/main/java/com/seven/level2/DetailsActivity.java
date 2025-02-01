package com.seven.level2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Get the selected layout name from Intent
        String layoutName = getIntent().getStringExtra("layout_name");

        // Reference to TextView
        TextView textView = findViewById(R.id.textViewDetail);

        // Display layout details
        if (layoutName != null) {
            switch (layoutName) {
                case "Linear Layout":
                    textView.setText(R.string.Linear);
                    break;
                case "Constraint Layout":
                    textView.setText(R.string.Constraint);
                    break;
                case "Frame Layout":
                    textView.setText(R.string.Frame);
                    break;
                case "Table Layout":
                    textView.setText(R.string.Table);
                    break;
                default:
                    textView.setText("No details available.");
            }
        }
    }
}
