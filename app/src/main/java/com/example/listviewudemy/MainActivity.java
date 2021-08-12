package com.example.listviewudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.custom_list);
        String[] vehicles = {"BMW", "Nissan", "Hundai", "Ferrari", "Honda", "Tesla", "Toyota"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.text_item, vehicles);
        listView.setAdapter(arrayAdapter);
    }
}