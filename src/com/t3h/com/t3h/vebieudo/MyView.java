package com.t3h.com.t3h.vebieudo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by TranNgocSon on 21/01/2016.
 */
public class MyView extends View {
    private Paint myPaint;

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        myPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        myPaint.setAntiAlias(true);
        myPaint.setColor(Color.GREEN);
        myPaint.setStrokeWidth(30);
        myPaint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(50, 50, 80, 50, myPaint);
        myPaint.setColor(Color.RED);
        canvas.drawLine(240, 50, 270, 50, myPaint);

        myPaint.setColor(Color.BLACK);
        myPaint.setTextSize(30);
        canvas.drawText("Gross sal", 100, 60, myPaint);
        canvas.drawText("Net sal", 290, 60, myPaint);

        int x = 30;
        for (int i = 0; i < 6; i++) {
            myPaint.setStrokeWidth(50);
            myPaint.setColor(Color.GREEN);
            MyChart myChart = new MyChart(x, 550, 15);
            myChart.draw(myPaint, canvas);
            myPaint.setTextSize(30);
            myPaint.setColor(Color.BLACK);
            canvas.drawText(15 + " k", x - 30, 560 - 15 * 20 - 30, myPaint);
            x = x + 130;
        }

        int x1 = 80;
        int a[] = {12, 13, 14, 10, 10, 9};
        for (int i = 0; i < 6; i++) {
            myPaint.setStrokeWidth(50);
            myPaint.setColor(Color.RED);
            MyChart myChart = new MyChart(x1, 550, a[i]);
            myChart.draw(myPaint, canvas);
            myPaint.setTextSize(30);
            myPaint.setColor(Color.BLACK);
            canvas.drawText(a[i] + " k", x1 - 23, 560 - a[i] * 20 - 30, myPaint);
            x1 = x1 + 130;
        }
        int x2 = 15;
        myPaint.setColor(Color.BLACK);
        myPaint.setTextSize(25);
        myPaint.setStyle(Paint.Style.FILL);
        canvas.drawText("Jan 12", x2, 600, myPaint);
        x2 += 130;
        canvas.drawText("Feb 12", x2, 600, myPaint);
        x2 += 130;
        canvas.drawText("Mar 12", x2, 600, myPaint);
        x2 += 130;
        canvas.drawText("Apr 12", x2, 600, myPaint);
        x2 += 130;
        canvas.drawText("May 12", x2, 600, myPaint);
        x2 += 130;
        canvas.drawText("Jun 12", x2, 600, myPaint);


    }
}
