package com.example.mystudy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class WTest2Activity extends AppCompatActivity {

    // Set GUI Linker Variable
    private Button btn_test, btn_calc;
    private EditText edt_test, edt_test2, edt_num1, edt_num2;
    private TextView label_test, label_result;
    private RadioButton rd_minus, rd_multi, rd_divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest2);

        // Link GUI by ID
        btn_test = findViewById(R.id.btn_test);
        btn_calc = findViewById(R.id.btn_calc);
        edt_test = findViewById(R.id.edt_test);
        edt_test2 = findViewById(R.id.edt_test2);
        edt_num1 = findViewById(R.id.edt_num1);
        edt_num2 = findViewById(R.id.edt_num2);
        label_test = findViewById(R.id.label_test);
        label_result = findViewById(R.id.label_result);
        rd_minus = findViewById(R.id.rd_minus);
        rd_multi = findViewById(R.id.rd_multiply);
        rd_divide = findViewById(R.id.rd_divide);


        // Init Edit Text
        String initmsg = label_test.getText().toString();
        edt_test.setHint(initmsg);
        edt_test2.setHint(initmsg);

        // Set Radio Button Activate
        rd_minus.setChecked(true);

        // Button Click Listener
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg1 = edt_test.getText().toString();
                String msg2 = edt_test2.getText().toString();

                if(msg1.equals(msg2)) {
                    Toast.makeText(getApplicationContext(), "Equal", Toast.LENGTH_SHORT).show();
                    label_test.setText("Equal");
                } else {
                    Toast.makeText(getApplicationContext(), "Not Equal", Toast.LENGTH_SHORT).show();
                    label_test.setText("Not Equal");
                }
            }
        });

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(edt_num1.getText().toString());
                int num2 = Integer.parseInt(edt_num2.getText().toString());
                int result =0;

                // Condition by Radio Button
                if(rd_minus.isChecked()) {
                    result = num1 - num2;
                } else if(rd_multi.isChecked()) {
                    result = num1 * num2;
                } else if(rd_divide.isChecked()) {
                    result = num1 / num2;
                } else {
                    result = num1 + num2;
                }

                // Set String - Solution 01
                label_result.setText(result + "");
            }
        });
    }
}