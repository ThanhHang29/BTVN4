package com.t3h.quanlyngoisao;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/**
 * Created by TranNgocSon on 20/01/2016.
 */
public class Star {
    private int x, y;
    private int size;
    private Random random;
    private int color;
    private int timeColor, timeMove;
    private int w, h;

    public Star(int w, int h) {
        init(w, h);
    }

    public void init(int w, int h) {
        this.w = w;
        this.h = h;
        random = new Random();
        size = random.nextInt(100) + 40;
        x = random.nextInt(w - size);
        y = random.nextInt(h - size);
        timeColor = random.nextInt(81) + 20;
        timeMove = random.nextInt(81) + 20;
        changeColor(0);
    }

    public void drawStar(Paint paint, Canvas canvas) {
        paint.setColor(color);
        paint.setTextSize(size+10);
        paint.setAntiAlias(true);
        canvas.drawText("SH", x, y, paint);
    }

    public void move(int time) {
        if (time % timeMove != 0) {
            return;
        }
        x += 30;
        if (x > w) {
            x = 0;
        }
    }

    public void changeColor(int time) {
        if (time % timeColor != 0) {
            return;
        }
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        color = Color.rgb(r, g, b);
    }
}
