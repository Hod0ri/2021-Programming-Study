package com.example.study01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        test = findViewById(R.id.test);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        test.setText(str);
    }
}