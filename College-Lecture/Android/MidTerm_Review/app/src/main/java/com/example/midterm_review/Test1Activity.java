package com.example.midterm_review;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Test1Activity extends AppCompatActivity {

    // Initialize Variable to Link GUI Component
    private Button btn_submit, btn_init;
    private EditText edt_chkpasswd, edt_passwd, edt_birth;
    private RadioButton rd_male, rd_female;
    private CheckBox chk_calcAge;
    private TextView lb_gender, lb_year, lb_month, lb_day, lb_age, lb_passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        // Link GUI
        btn_init = findViewById(R.id.btn_init);
        btn_submit = findViewById(R.id.btn_submit);
        edt_birth = findViewById(R.id.edt_birth);
        edt_passwd = findViewById(R.id.edt_passwd);
        edt_chkpasswd = findViewById(R.id.edt_chkpasswd);
        rd_male = findViewById(R.id.rd_male);
        rd_female = findViewById(R.id.rd_female);
        chk_calcAge = findViewById(R.id.chk_calcAge);
        lb_age = findViewById(R.id.lb_age);
        lb_gender = findViewById(R.id.lb_gender);
        lb_year = findViewById(R.id.lb_year);
        lb_month = findViewById(R.id.lb_month);
        lb_day = findViewById(R.id.lb_day);
        lb_passwd = findViewById(R.id.lb_passwd);

        btn_init.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lb_age.setText("    ");
                lb_gender.setText("    ");
                lb_year.setText("    ");
                lb_month.setText("    ");
                lb_day.setText("    ");
                lb_passwd.setText("    ");
                chk_calcAge.setChecked(false);
                rd_female.setChecked(false);
                rd_male.setChecked(false);
                edt_birth.setText("");
                edt_passwd.setText("");
                edt_chkpasswd.setText("");
            }
        });
    }
}