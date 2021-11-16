package com.example.nov02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;


// Canvas View
class MyView extends View {
    int nPosX, nPosY, nPosX2, nPosY2, nPosX3, nPosY3, nPosX4, nPosY4;
    public MyView(Context cotxtMy) {
        super(cotxtMy);
        // setBackgroundColor(Color.YELLOW);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//
//        int action = event.getActionMasked();
//
//        switch (action) {
//            case MotionEvent.ACTION_DOWN:
//                nPosX = (int) event.getX(0);
//                nPosY = (int) event.getY(0);
//                nPosX2 = (int) event.getX(1);
//                nPosY2 = (int) event.getY(1);
//                break;
//            case MotionEvent.ACTION_MOVE:
//                break;
//            case MotionEvent.ACTION_UP:
//                nPosX3 = (int) event.getX(0);
//                nPosY3 = (int) event.getY(0);
//                nPosX4 = (int) event.getX(1);
//                nPosY4 = (int) event.getY(1);
//                break;
//        }
//
//        invalidate();
//        return super.onTouchEvent(event);
//    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paintmy = new Paint();

        paintmy.setStrokeWidth(0);
        paintmy.setTextSize(50);
        paintmy.setColor(Color.BLACK);
        canvas.drawText("X = " + nPosX + ", Y = " + nPosY, nPosX, nPosY, paintmy);

        paintmy.setAntiAlias(true);
        paintmy.setColor(Color.BLACK);
        paintmy.setStrokeWidth(20);
        canvas.drawLine(100, 100, 800, 800, paintmy);

        paintmy.setColor(Color.RED);
        paintmy.setStrokeWidth(30);
        paintmy.setStyle(Paint.Style.STROKE);
        Rect rect1 = new Rect(300, 300, 300+100, 300+200);

        canvas.drawRect(rect1, paintmy);

        paintmy.setColor(Color.BLUE);
        paintmy.setStrokeWidth(30);
        paintmy.setStyle(Paint.Style.STROKE);
        RectF rect2 = new RectF(250, 50, 250+100, 50+100);

        canvas.drawRoundRect(rect2,20, 20, paintmy);

        paintmy.setColor(Color.CYAN);
        canvas.drawCircle(500, 500, 100, paintmy);

        paintmy.setStrokeWidth(0);
        paintmy.setTextSize(50);
        paintmy.setColor(Color.BLACK);
        canvas.drawText("안드로이드", 100, 700, paintmy);

        paintmy.setStrokeWidth(5);
        Path path1 = new Path();

        paintmy.setColor(Color.MAGENTA);
        path1.moveTo(10, 290);
        path1.lineTo(10+50, 290+50);
        path1.lineTo(10+100, 290);
        path1.lineTo(10+150, 290 + 50);
        path1.lineTo(10+200, 290);
        canvas.drawPath(path1, paintmy);
    }
}

public class DrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_draw);
        setContentView(new MyView(this));
    }
}