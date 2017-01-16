package com.t3h.ovuong;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by TranNgocSon on 20/01/2016.
 */
public class MyView extends View {
    private Lines lines;
    private Paint myPaint;

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

//    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//        init();
//    }

    public void init() {
        myPaint = new Paint();
        myPaint.setStrokeWidth(10);
        myPaint.setStyle(Paint.Style.STROKE);
        myPaint.setAntiAlias(true);
        lines = new Lines(1000, 1000);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        lines.draw(myPaint, canvas);
    }
}
