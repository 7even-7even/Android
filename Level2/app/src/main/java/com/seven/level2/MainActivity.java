package com.seven.level2; // Change according to your package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference to ListView
        ListView listView = findViewById(R.id.listView);

        // Static data
        List<String> itemList = new ArrayList<>();
        itemList.add("Linear Layout");
        itemList.add("Constraint Layout");
        itemList.add("Frame Layout");
        itemList.add("Table Layout");

        // Adapter to populate ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.listitem, R.id.textViewItem, itemList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get selected item
                String selectedLayout = itemList.get(position);

                // Open new activity with details
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("layout_name", selectedLayout);
                startActivity(intent);
            }
        });
    }
}
