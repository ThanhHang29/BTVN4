package com.t3h.ovuong;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by TranNgocSon on 20/01/2016.
 */
public class Line {
    private float xDau, yDau, xCuoi, yCuoi;
    private float khoangCach;
    private int w, h;

    public Line(float xDau, float yDau, float xCuoi, float yCuoi, float khoangCach, int w, int h) {
        this.xDau = xDau;
        this.yDau = yDau;
        this.xCuoi = xCuoi;
        this.yCuoi = yCuoi;
        this.khoangCach = khoangCach;
        this.w = w;
        this.h = h;
        xDau = 0;
        xCuoi = w;
        yDau = xDau + 48;
        yCuoi = yDau;
        khoangCach = yDau - xDau;
    }

    public void drawLine(Paint paint, Canvas canvas) {
        paint.setColor(Color.RED);
        canvas.drawLine(0, yDau, w, yCuoi, paint);
        canvas.drawLine(xDau, 0, xDau, h, paint);
    }
}
