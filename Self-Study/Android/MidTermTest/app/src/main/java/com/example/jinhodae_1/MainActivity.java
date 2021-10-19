package com.example.jinhodae_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // Init GUI Variable
    private Button btn_init, btn_commit;
    private TextView lb_result, lb_pay, lb_add, lb_cellphone, lb_notebook;
    private EditText edt_cellphone, edt_notebook;
    private CheckBox chk_cellphone, chk_notebook, chk_calc;
    private RadioButton rd_card, rd_online, rd_money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link GUI by id
        btn_init = findViewById(R.id.btn_init);
        btn_commit = findViewById(R.id.btn_commit);

        lb_add = findViewById(R.id.lb_add);
        lb_result = findViewById(R.id.lb_result);
        lb_pay = findViewById(R.id.lb_pay);
        lb_cellphone = findViewById(R.id.lb_cellphone);
        lb_notebook = findViewById(R.id.lb_notebook);

        edt_cellphone = findViewById(R.id.edt_cellphone);
        edt_notebook = findViewById(R.id.edt_notebook);
        chk_calc = findViewById(R.id.chk_calc);
        chk_cellphone = findViewById(R.id.chk_cellphone);
        chk_notebook = findViewById(R.id.chk_notebook);

        rd_card = findViewById(R.id.rd_card);
        rd_online = findViewById(R.id.rd_online);
        rd_money = findViewById(R.id.rd_money);


        btn_commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount_phone, amount_notebook;

                if(chk_cellphone.isChecked()) {
                    amount_phone = edt_cellphone.getText().toString();
                } else {
                    amount_phone = "0";
                }

                if(chk_notebook.isChecked()) {
                    amount_notebook = edt_notebook.getText().toString();
                } else {
                    amount_notebook = "0";
                }

                // Set Result
                lb_cellphone.setText(amount_phone);
                lb_notebook.setText(amount_notebook);

                if(rd_card.isChecked()) {
                    lb_pay.setText("카드");
                    lb_add.setText("");
                } else if(rd_money.isChecked()) {
                    lb_pay.setText("현금");
                    lb_add.setText("");
                } else if(rd_online.isChecked()) {
                    lb_pay.setText("계좌 이체");
                    lb_add.setText("대림은행 123-4567-890");
                } else {
                    lb_pay.setText("Error");
                    Toast.makeText(getApplicationContext(), "결제 수단을 선택해주세요!", Toast.LENGTH_SHORT).show();
                }

                if(chk_calc.isChecked()) {
                    int cellphone = Integer.parseInt(amount_phone);
                    int notebook = Integer.parseInt(amount_notebook);

                    int result = cellphone * 2000 + notebook * 3000;
                    lb_result.setText(result + "");
                }

            }
        });

        btn_init.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lb_result.setText("");
                lb_cellphone.setText("");
                lb_add.setText("");
                lb_pay.setText("");
                lb_notebook.setText("");

                chk_calc.setChecked(false);
                chk_notebook.setChecked(false);
                chk_cellphone.setChecked(false);

                rd_online.setChecked(false);
                rd_money.setChecked(false);
                rd_card.setChecked(false);

                edt_notebook.setText("");
                edt_cellphone.setText("");
            }
        });

    }
}