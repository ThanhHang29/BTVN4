package com.t3h.quanlyngoisao;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by TranNgocSon on 20/01/2016.
 */
public class MyView extends View implements Runnable {
    private Sky sky;
    private Paint myPaint;
    private boolean IS_RUNNING = true;

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
        sky = new Sky(1000, 1000);
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        sky.drawSky(myPaint, canvas);
    }

    @Override
    public void run() {
        int time = 0;
        while (IS_RUNNING) {
            time++;
            sky.move(time);
            sky.changeColor(time);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            postInvalidate();
        }
    }
}
