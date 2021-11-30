package com.example.nov02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HiWidgetActivity extends AppCompatActivity {

    private Button btn_timeTest, btn_ScrollView, btn_slide, btn_flip;

    private void FindViewId() {
        btn_timeTest = findViewById(R.id.btn_testTime);
        btn_ScrollView = findViewById(R.id.btn_ScrollView);
        btn_slide = findViewById(R.id.btn_slide);
        btn_flip = findViewById(R.id.btn_flip);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi_widget);
    }


    public void onTimeClick(View view) {
        Intent intent = new Intent(getApplicationContext(), TestTimeActivity.class);
        startActivity(intent);
    }

    public void onScrollClick(View view) {
        Intent intent = new Intent(getApplicationContext(), ScrollViewActivity.class);
        startActivity(intent);
    }

    public void onSlideClick(View view) {
        Intent intent = new Intent(getApplicationContext(), SlideActivity.class);
        startActivity(intent);
    }

    public void onFlipClick(View view) {
        Intent intent = new Intent(getApplicationContext(), FlipActivity.class);
        startActivity(intent);
    }
}