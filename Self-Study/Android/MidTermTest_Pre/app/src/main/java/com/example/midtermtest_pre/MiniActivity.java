package com.example.midtermtest_pre;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MiniActivity extends AppCompatActivity {

    private ImageView img_iu, img_kain, img_mte;
    private RadioGroup rg_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini);

        rg_img = findViewById(R.id.rg_img);

        img_iu = findViewById(R.id.img_iu);
        img_kain = findViewById(R.id.img_kain);
        img_mte = findViewById(R.id.img_mte);

        rg_img.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selected = findViewById(checkedId);

                switch ((String)selected.getText()) {
                    case "맛있는 겨울배":
                        img_iu.setVisibility(View.INVISIBLE);
                        img_kain.setVisibility(View.VISIBLE);
                        img_mte.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(),"얘 겨울배가 맛있단다!", Toast.LENGTH_SHORT).show();
                        break;
                    case "국힙원탑":
                        img_iu.setVisibility(View.VISIBLE);
                        img_kain.setVisibility(View.INVISIBLE);
                        img_mte.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(),"국힙 원탑 아이유", Toast.LENGTH_SHORT).show();
                        break;
                    case "유링게슝":
                        img_iu.setVisibility(View.INVISIBLE);
                        img_kain.setVisibility(View.INVISIBLE);
                        img_mte.setVisibility(View.VISIBLE);

                        Toast.makeText(getApplicationContext(),"뭉탱이로 있다가 유링게슝", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


    }
}