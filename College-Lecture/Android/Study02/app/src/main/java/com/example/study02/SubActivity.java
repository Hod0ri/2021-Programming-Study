package com.example.study02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SubActivity extends AppCompatActivity {

    private ListView list_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        list_test = findViewById(R.id.list_test);

        // Data Save List
        List<String> data = new ArrayList<String>();

        // Adaptor
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        list_test.setAdapter(adapter);
        data.add("Hod0ri");
        data.add("Doonas");
        data.add("Komeg");
        data.add("Soplay");
        data.add("Night Rabbit");

        adapter.notifyDataSetChanged();
    }
}