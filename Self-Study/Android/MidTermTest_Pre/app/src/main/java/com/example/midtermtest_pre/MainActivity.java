package com.example.midtermtest_pre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_goCalc, btn_MiniGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_goCalc = findViewById(R.id.btn_goCalc);
        btn_MiniGame = findViewById(R.id.btn_MiniGame);

        btn_goCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Move to Calculator", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, CalcuActivity.class);
                startActivity(intent);
            }
        });

        btn_MiniGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Move to Mini Photo", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MiniActivity.class);
                startActivity(intent);
            }
        });
    }
}