package com.example.midtermtest_pre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class CalcuActivity extends AppCompatActivity {

    private EditText edt_var1, edt_var2;
    private TextView lb_result;
    private Button btn_reset, btn_GoMain, btn_Calc;
    private RadioButton rd_plus, rd_minus, rd_divide, rd_multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);

        // Link Gui by id
        edt_var1 = findViewById(R.id.edt_var1);
        edt_var2 = findViewById(R.id.edt_var2);

        lb_result = findViewById(R.id.lb_result);

        btn_reset = findViewById(R.id.btn_reset);
        btn_GoMain = findViewById(R.id.btn_GoMain);
        btn_Calc = findViewById(R.id.btn_Calc);

        rd_plus = findViewById(R.id.rd_plus);
        rd_minus = findViewById(R.id.rd_minus);
        rd_divide = findViewById(R.id.rd_divide);
        rd_multi = findViewById(R.id.rd_multi);

        btn_Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt_var1.getText().toString().equals("") || edt_var2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Input Value!", Toast.LENGTH_SHORT).show();
                } else {
                    String var1 = edt_var1.getText().toString();
                    String var2 = edt_var2.getText().toString();

                    if(rd_divide.isChecked() == false && rd_multi.isChecked() == false && rd_minus.isChecked() == false && rd_plus.isChecked() == false) {
                        Toast.makeText(getApplicationContext(), "Set Operator!", Toast.LENGTH_SHORT).show();
                    } else {
                        if(rd_plus.isChecked()) {
                            lb_result.setText(Integer.parseInt(var1) + Integer.parseInt(var2) + "");
                        } else if(rd_minus.isChecked()) {
                            lb_result.setText(Integer.parseInt(var1) - Integer.parseInt(var2) + "");
                        } else if(rd_multi.isChecked()) {
                            lb_result.setText(Integer.parseInt(var1) * Integer.parseInt(var2) + "");
                        } else {
                            lb_result.setText(Integer.parseInt(var1) / Integer.parseInt(var2) + "");
                        }
                    }
                }
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reset Value!", Toast.LENGTH_SHORT).show();
                lb_result.setText("Result");
                edt_var1.setText("");
                edt_var2.setText("");
                rd_multi.setChecked(false);
                rd_plus.setChecked(false);
                rd_minus.setChecked(false);
                rd_divide.setChecked(false);
            }
        });

        btn_GoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Back to Main", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CalcuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}