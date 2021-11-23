package com.example.nov02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOActivity extends AppCompatActivity {

    Button btn_acSubmit, btn_load;
    EditText edt_id, edt_passwd;
    TextView lb_id, lb_passwd;
    String userID, passwd;

    private void LinkGUI() {
        btn_acSubmit = findViewById(R.id.btn_acSubmit);
        edt_id = findViewById(R.id.edt_id);
        edt_passwd = findViewById(R.id.edt_passwd);
        btn_load = findViewById(R.id.btn_load);
        lb_id = findViewById(R.id.lb_id);
        lb_passwd = findViewById(R.id.lb_passwd);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_ioactivity);
        LinkGUI();

        // Account Submit Button Event
        btn_acSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userID = edt_id.getText().toString();
                passwd = edt_passwd.getText().toString();

                // Catch Empty String Value for Exception Handling
                if(userID.isEmpty() || passwd.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Input id or password!", Toast.LENGTH_SHORT).show();
                } else {

                    // File Write
                    try {
                        FileOutputStream fileOutputStream = openFileOutput("UserFile.txt", Context.MODE_PRIVATE);

                        fileOutputStream.write(userID.getBytes(), 0, userID.length());
                        fileOutputStream.write('\n');
                        fileOutputStream.write(passwd.getBytes(), 0, passwd.length());

                        fileOutputStream.close();

                        Toast.makeText(getApplicationContext(), "Create UserFile.txt", Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        Toast.makeText(getApplicationContext(), "Found IOException", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        // Load File Data Event
        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    File file = new File("/data/data/com.example.nov02/files/UserFile.txt");
                    // Load Data
                    BufferedReader inFiles = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF8"));
                    String line = "";
                    String[] stemp = new String[2];
                    int i = 0;
                    while((line = inFiles.readLine()) != null) {
                        stemp[i] = line;
                        i++;
                    }
                    inFiles.close();

                    lb_id.setText(stemp[0]);
                    lb_passwd.setText(stemp[1]);
                    lb_id.setVisibility(View.VISIBLE);
                    lb_passwd.setVisibility(View.VISIBLE);

                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Cannot Find File", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}