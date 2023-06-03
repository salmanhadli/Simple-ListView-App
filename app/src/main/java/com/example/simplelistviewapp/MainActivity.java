package com.example.simplelistviewapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] listViewDummyData = {
            "Germany",
            "Spain",
            "Brazil",
            "England",
            "USA",
            "Saudi Arabia",
            "Qatar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Adapter step
        ArrayAdapter adapter = new ArrayAdapter(
                this,
//                android.R.layout.simple_list_item_1, // predefined list item layout in android
                R.layout.my_list_item,
                R.id.textView,
                listViewDummyData
        );

        listView.setAdapter(adapter);
    }
}