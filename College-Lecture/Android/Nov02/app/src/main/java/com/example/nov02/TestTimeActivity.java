package com.example.nov02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class TestTimeActivity extends AppCompatActivity {

    Button btn_timeSubmit;
    EditText edt_time;
    TimePicker timeP;

    int hour, minute;

    private void FindViewID() {
        btn_timeSubmit = findViewById(R.id.btn_TimeSubmit);
        edt_time = findViewById(R.id.edt_time);
        timeP = findViewById(R.id.timeP);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_time);

        FindViewID();

        timeP.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hour = timeP.getCurrentHour();
                minute = timeP.getCurrentMinute();

                edt_time.setText(hour + " : " + minute);
            }
        });

    }

    public void onDateClick(View view) {
        hour = timeP.getCurrentHour();
        minute = timeP.getCurrentMinute();

        edt_time.setText(hour + " : " + minute);

    }
}