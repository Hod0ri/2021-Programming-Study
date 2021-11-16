package com.example.nov02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ReceiveTestActivity extends AppCompatActivity {

    private EditText edt_rname, edt_rgamemoney;
    private RadioButton rd_rlol, rd_rflash;
    private TextView ScrHeight, ScrWidth;

    private void FindViewId() {
        edt_rname = findViewById(R.id.edt_rname);
        edt_rgamemoney = findViewById(R.id.edt_rgamemoney);

        rd_rflash = findViewById(R.id.rd_rflash);
        rd_rlol = findViewById(R.id.rd_rlol);

        ScrHeight = findViewById(R.id.ScrHeight);
        ScrWidth = findViewById(R.id.ScrWidth);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_test);

        FindViewId();

        Intent intent = getIntent();

        String name = intent.getExtras().getString("Name");
        int gamemoney = intent.getExtras().getInt("GameMoney");
        int gameType = intent.getExtras().getInt("GameType");
        int width = intent.getIntExtra("width", 0);
        int height = intent.getIntExtra("height", 0);


        ScrHeight.setText("세로 : " + height);
        ScrWidth.setText("가로 : " + width);
        edt_rname.setText(name);
        edt_rgamemoney.setText(gamemoney + "");
        if(gameType == 1) {
            rd_rlol.setChecked(true);
        } else if(gameType == 2) {
            rd_rflash.setChecked(true);
        }
    }
}