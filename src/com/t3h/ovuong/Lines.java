package com.t3h.ovuong;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.ArrayList;

/**
 * Created by TranNgocSon on 20/01/2016.
 */
public class Lines {
    private ArrayList<Line> arrLine;

    public Lines(int w, int h) {
        init(w, h);
    }

    public void init(int w, int h) {
        arrLine = new ArrayList<Line>();
        for (float i = 0; i < w; i = i + 48) {
            Line line = new Line(i, i + 48, w, i + 48, 48, w, h);
            arrLine.add(line);
        }
    }

    public void draw(Paint paint, Canvas canvas) {
        for (Line line : arrLine) {
            line.drawLine(paint, canvas);
        }
    }
}
