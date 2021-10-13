package com.example.mystudy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class WTest3Activity extends AppCompatActivity {

    private ImageView img_scissor, img_rock, img_paper;
    private CheckBox chk_scissor, chk_rock, chk_paper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wtest3);

        // Link GUI by ID
        img_scissor = findViewById(R.id.img_scissor);
        img_rock = findViewById(R.id.img_rock);
        img_paper = findViewById(R.id.img_paper);

        chk_paper = findViewById(R.id.chk_paper);
        chk_scissor = findViewById(R.id.chk_scissor);
        chk_rock = findViewById(R.id.chk_rock);

        // Init Setting
        img_scissor.setVisibility(View.INVISIBLE);
        img_rock.setVisibility(View.INVISIBLE);
        img_paper.setVisibility(View.INVISIBLE);

        // CheckBox Event
        chk_scissor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk_scissor.isChecked()) {
                    img_scissor.setVisibility(View.VISIBLE);
                } else {
                    img_scissor.setVisibility(View.INVISIBLE);
                }
            }
        });

        chk_paper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk_paper.isChecked()) {
                    img_paper.setVisibility(View.VISIBLE);
                } else {
                    img_paper.setVisibility(View.INVISIBLE);
                }
            }
        });

        chk_rock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk_rock.isChecked()) {
                    img_rock.setVisibility(View.VISIBLE);
                } else {
                    img_rock.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}