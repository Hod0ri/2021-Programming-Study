package com.example.nov02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlipActivity extends AppCompatActivity {

    Button btn_next, btn_prev, btn_sSub;
    ViewFlipper vFlip;
    EditText edt_sname, edt_sid, edt_spass;
    TextView warn;

    String userID, passwd;

    private void FindViewID() {
        btn_next = findViewById(R.id.btn_next);
        btn_prev = findViewById(R.id.btn_prev);
        vFlip = findViewById(R.id.vFlip);
        btn_sSub = findViewById(R.id.btn_sSubmit);
        edt_sid = findViewById(R.id.edt_sid);
        edt_sname = findViewById(R.id.edt_sname);
        edt_spass = findViewById(R.id.edt_spass);
        warn = findViewById(R.id.warn);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip);

        FindViewID();

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlip.showPrevious();
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlip.showNext();
            }
        });

        btn_sSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userID = edt_sid.getText().toString();
                passwd = edt_spass.getText().toString();
                String[] stemp = new String[2];

                try {
                    File file = new File("/data/data/com.example.nov02/files/UserFile.txt");
                    // Load Data
                    BufferedReader inFiles = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF8"));
                    String line = "";
                    int i = 0;
                    while((line = inFiles.readLine()) != null) {
                        stemp[i] = line;
                        i++;
                    }
                    inFiles.close();

                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Cannot Find File", Toast.LENGTH_SHORT).show();
                }

                if(userID.isEmpty() || passwd.isEmpty()) {
                    warn.setText("아이디와 비밀번호 모두 입력해주세요!");
                    warn.setVisibility(View.VISIBLE);
                } else if(userID.equals(stemp[0]) && !passwd.equals(stemp[1])) {
                    warn.setText("비밀번호를 다시 입력해주세요!");
                    warn.setVisibility(View.VISIBLE);
                }else if(!userID.equals(stemp[0]) && passwd.equals(stemp[1])) {
                    warn.setText("계정을 찾을 수 없습니다!");
                    warn.setVisibility(View.VISIBLE);
                }else if(!userID.equals(stemp[0]) && !passwd.equals(stemp[1])) {
                    warn.setText("아이디와 비밀번호를 다시 입력해주세요!");
                    warn.setVisibility(View.VISIBLE);
                }else {
                    warn.setText("로그인 성공");
                    warn.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}