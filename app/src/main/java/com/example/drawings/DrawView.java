package com.example.drawings;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View { //10:19
    private Paint p = new Paint();
    private int y=0, dY=5;
    public DrawView (Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.MAGENTA);
        int random = (int) Math.random() * 3;
        if (random == 0) {
            canvas.drawLine(0, 0, 10, 5, p);
        } else if (random == 1) {
            canvas.drawRect(new Rect(0, 0, 10, 10), p);
        } else {
            canvas.drawCircle(0, 0, 10f, p);
        }
        //canvas.drawLine(0f, (float) y, 10f, (float) (y + 10));
        y+=dY;
        if (y <= 0) {
            y = getHeight() - 1;
        }
        y%=getHeight();
        invalidate();
    }

    public int getdY() {
        return dY;
    }

    public void setdY(int dY) {
        this.dY = dY;
    }
}
