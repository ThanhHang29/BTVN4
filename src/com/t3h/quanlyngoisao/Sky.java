package com.t3h.quanlyngoisao;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.ArrayList;

/**
 * Created by TranNgocSon on 20/01/2016.
 */
public class Sky {
    ArrayList<Star> arrStar;

    public Sky(int w, int h) {
        initSky(w, h);
    }

    public void initSky(int w, int h) {
        arrStar = new ArrayList<Star>();
        for (int i = 0; i < 10; i++) {
            Star star = new Star(w, h);
            arrStar.add(star);
        }
    }

    public void drawSky(Paint paint, Canvas canvas) {
        for (Star star : arrStar) {
            star.drawStar(paint, canvas);
        }
    }

    public void move(int time) {
        for (Star star : arrStar) {
            star.move(time);
        }
    }

    public void changeColor(int time){
        for (Star star : arrStar) {
            star.changeColor(time);
        }
    }
}
