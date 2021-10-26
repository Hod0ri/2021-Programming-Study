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

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edt_passwd.getText().toString()).equals(edt_chkpasswd.getText().toString())) {
                    lb_passwd.setText(edt_passwd.getText().toString());
                } else {
                    lb_passwd.setText("비밀번호가 일치하지 않습니다!");
                }
                if(rd_male.isChecked() || rd_female.isChecked()) {
                    if (rd_male.isChecked()) {
                        lb_gender.setText("남");
                    }
                    if (rd_female.isChecked()) {
                        lb_gender.setText("여");
                    }
                } else {
                    lb_gender.setText("성별을 입력해주세요!");
                }

                String birth = edt_birth.getText().toString();
                if(birth.length() == 8) {
                    String year = birth.substring(0, 4);
                    String month = birth.substring(4, 6);
                    String day = birth.substring(6, 8);

                    lb_year.setText(year);
                    lb_month.setText(month);
                    lb_day.setText(day);

                    if(chk_calcAge.isChecked()) {
                        String age = (2021 - Integer.parseInt(year)) + "";
                        lb_age.setText(age);
                    }
                } else {
                    lb_year.setText("Error");
                    lb_month.setText("Error");
                    lb_day.setText("Error");
                }
            }
        });
    }
}