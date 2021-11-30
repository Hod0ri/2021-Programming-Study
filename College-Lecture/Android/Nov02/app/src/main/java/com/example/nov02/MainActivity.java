package com.example.nov02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_draw, btn_IntentTest, btn_file, btn_StudyWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_draw = findViewById(R.id.btn_draw);
        btn_IntentTest = findViewById(R.id.btn_IntentTest);
        btn_file = findViewById(R.id.btn_file);
        btn_StudyWidget = findViewById(R.id.btn_StudyWidget);

        // Move to Draw Activity
        btn_draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrawActivity.class);
                startActivity(intent);
            }
        });

        // Move to Intent Test Activity
        btn_IntentTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntentTestActivity.class);
                startActivity(intent);
            }
        });

        // Move to File I/O Test Activity
        btn_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FileIOActivity.class);
                startActivity(intent);
            }
        });

        btn_StudyWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HiWidgetActivity.class);
                startActivity(intent);
            }
        });
    }
}