package com.t3h.com.t3h.vebieudo;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by TranNgocSon on 21/01/2016.
 */
public class MyChart {
    private int x, y;
    private int dimen;

    public MyChart(int x, int y, int dimen) {
        this.x = x;
        this.y = y;
        this.dimen = dimen;
    }

    public void draw(Paint paint, Canvas canvas) {
        canvas.drawLine(x, y - dimen * 20, x, y, paint);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
