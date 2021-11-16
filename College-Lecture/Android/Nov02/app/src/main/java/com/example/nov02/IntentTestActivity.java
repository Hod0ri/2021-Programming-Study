package com.example.nov02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class IntentTestActivity extends AppCompatActivity {

    private Button btn_submit;
    private RadioButton rd_lol, rd_flash;
    private EditText edt_name, edt_gamemoney;

    private void FindViewId() {
        btn_submit = findViewById(R.id.btn_submit);

        rd_flash = findViewById(R.id.rd_flash);
        rd_lol = findViewById(R.id.rd_lol);

        edt_gamemoney = findViewById(R.id.edt_gamemoney);
        edt_name = findViewById(R.id.edt_name);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_test);

        FindViewId();

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

                int nDeviceWidth = displayMetrics.widthPixels;
                int nHeight = displayMetrics.heightPixels;

                // Send Value
                String name = edt_name.getText().toString();
                String gTemp = edt_gamemoney.getText().toString();
                int gamemoney = Integer.parseInt(gTemp);

                int nGame = 0; // lol이면 1, flash면 2
                if(rd_lol.isChecked()) {
                    nGame = 1;
                } else if(rd_flash.isChecked()) {
                    nGame = 2;
                }

                Intent intent = new Intent(getApplicationContext(), ReceiveTestActivity.class);

                intent.putExtra("Name", name);
                intent.putExtra("GameMoney", gamemoney);
                intent.putExtra("GameType", nGame);
                intent.putExtra("width", nDeviceWidth);
                intent.putExtra("height", nHeight);

                startActivity(intent);
            }
        });
    }
}