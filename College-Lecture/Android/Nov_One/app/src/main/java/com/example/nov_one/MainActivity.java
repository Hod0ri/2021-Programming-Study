package com.example.nov_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn_rcp, btn_minus, btn_init;
    private TextView lb_user, lb_computer, lb_win, tb_sci, tb_paper, tb_rock, tbu_sci, tbu_rock, tbu_paper;
    private CheckBox chk_sci, chk_rock, chk_paper;

    Random rand = new Random();

    public void setVisiblePic(String name) {
        if(name.equals("가위")) {
            tb_sci.setVisibility(View.VISIBLE);
        } else if(name.equals("바위")) {
            tb_rock.setVisibility(View.VISIBLE);
        } else {
            tb_paper.setVisibility(View.VISIBLE);
        }
    }

    public void lockButton() {
        if(!(chk_paper.isChecked())) {
            chk_paper.setEnabled(false);
        } else if(!(chk_rock.isChecked())) {
            chk_rock.setEnabled(false);
        } else if(!(chk_sci.isChecked())) {
            chk_sci.setEnabled(false);
        }
    }

    public void CheckWin(String com, String usr) {
        if(com.equals("가위")) {
            if(usr.equals("가위")) {
                lb_win.setText("비겼습니다.");
            } else if(usr.equals("바위")) {
                lb_win.setText("이겼습니다.");
            } else {
                lb_win.setText("졌습니다.");
            }
        } else if(com.equals("바위")) {
            if(usr.equals("가위")) {
                lb_win.setText("졌습니다.");
            } else if(usr.equals("바위")) {
                lb_win.setText("비겼습니다.");
            } else {
                lb_win.setText("이겼습니다.");
            }
        } else if(com.equals("보")) {
            if(usr.equals("가위")) {
                lb_win.setText("이겼습니다.");
            } else if(usr.equals("바위")) {
                lb_win.setText("졌습니다.");
            } else {
                lb_win.setText("비겼습니다.");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_rcp = findViewById(R.id.btn_rcp);
        btn_minus = findViewById(R.id.btn_minus);
        btn_init = findViewById(R.id.btn_init);

        lb_user = findViewById(R.id.lb_user);
        lb_computer = findViewById(R.id.lb_computer);
        lb_win = findViewById(R.id.lb_win);


        tb_paper = findViewById(R.id.tb_paper);
        tb_sci = findViewById(R.id.tb_sci);
        tb_rock = findViewById(R.id.tb_rock);

        tbu_paper = findViewById(R.id.tbu_paper);
        tbu_rock = findViewById(R.id.tbu_rock);
        tbu_sci = findViewById(R.id.tbu_sci);

        chk_paper = findViewById(R.id.chk_pap);
        chk_rock = findViewById(R.id.chk_rock);
        chk_sci = findViewById(R.id.chk_sci);

        final boolean[] isOnGame = {false};
        String[] RCP = {"가위", "바위", "보"};
        String[] com = {"", ""};

        // Initialize Screen Button Event
        btn_init.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lb_user.setText("");
                lb_computer.setText("");
                lb_win.setText("");

                chk_paper.setChecked(false);
                chk_rock.setChecked(false);
                chk_sci.setChecked(false);

                tb_paper.setVisibility(View.INVISIBLE);
                tb_sci.setVisibility(View.INVISIBLE);
                tb_rock.setVisibility(View.INVISIBLE);

                tbu_paper.setVisibility(View.INVISIBLE);
                tbu_sci.setVisibility(View.INVISIBLE);
                tbu_rock.setVisibility(View.INVISIBLE);


                isOnGame[0] = false;
                com[0] = "";
                com[1] = "";
                chk_paper.setEnabled(true);
                chk_rock.setEnabled(true);
                chk_sci.setEnabled(true);

                Toast.makeText(getApplicationContext(), "메뉴를 초기화합니다!", Toast.LENGTH_SHORT).show();
            }
        });

        // Check Box Event
        chk_rock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chk_rock.isChecked()) {
                    tbu_rock.setVisibility(View.VISIBLE);
                } else {
                    tbu_rock.setVisibility(View.INVISIBLE);
                }
            }
        });
        chk_paper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chk_paper.isChecked()) {
                    tbu_paper.setVisibility(View.VISIBLE);
                } else {
                    tbu_paper.setVisibility(View.INVISIBLE);
                }
            }
        });
        chk_sci.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chk_sci.isChecked()) {
                    tbu_sci.setVisibility(View.VISIBLE);
                } else {
                    tbu_sci.setVisibility(View.INVISIBLE);
                }
            }
        });

        // Rock Scissor Paper Event
        btn_rcp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOnGame[0]) {
                    if (!(chk_rock.isChecked()) && !(chk_paper.isChecked()) && !(chk_sci.isChecked()) || (!(chk_rock.isChecked()) && !(chk_sci.isChecked()) && chk_rock.isChecked()) || (!(chk_rock.isChecked()) && (chk_sci.isChecked()) && !(chk_paper.isChecked())) || ((chk_rock.isChecked()) && !(chk_sci.isChecked()) && !(chk_paper.isChecked()))) {
                        Toast.makeText(getApplicationContext(), "두개를 골라주세요!", Toast.LENGTH_SHORT).show();
                    } else if ((chk_rock.isChecked()) && (chk_paper.isChecked()) && (chk_sci.isChecked())) {
                        Toast.makeText(getApplicationContext(), "두개만 선택해주세요!", Toast.LENGTH_SHORT).show();
                    } else {
                        int c_index1 = 0;
                        int c_index2 = 0;
                        while (c_index1 == c_index2) {
                            c_index2 = rand.nextInt(3);
                            c_index1 = rand.nextInt(3);
                        }
                        String computer1 = RCP[c_index1];
                        String computer2 = RCP[c_index2];

                        setVisiblePic(computer1);
                        setVisiblePic(computer2);
                        com[0] = computer1;
                        com[1] = computer2;
                        lockButton();

                        isOnGame[0] = true;
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "이미 게임이 진행중입니다!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Minus Event
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!(chk_rock.isChecked()) && !(chk_sci.isChecked()) && !(chk_paper.isChecked())) || ((chk_rock.isChecked()) && (chk_sci.isChecked()) && !(chk_paper.isChecked())) || (!(chk_rock.isChecked()) && (chk_sci.isChecked()) && (chk_paper.isChecked())) || ((chk_rock.isChecked()) && !(chk_sci.isChecked()) && (chk_paper.isChecked()))) {
                    Toast.makeText(getApplicationContext(), "하나만 골라주세요!", Toast.LENGTH_SHORT).show();
                } else {
                    String user;
                    if(chk_rock.isChecked()) {
                        user = "바위";
                    } else if(chk_paper.isChecked()) {
                        user = "보";
                    } else if(chk_sci.isChecked()) {
                        user = "가위";
                    } else {
                        user = "Error";
                    }

                    lb_user.setText(user);

                    int c_temp = rand.nextInt(2);
                    String computer = com[c_temp];
                    lb_computer.setText(computer);

                    CheckWin(computer, user);
                }
            }
        });
    }
}