package com.example.drawings;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
        canvas.drawCircle(100, y, (float) 105,  p);
        canvas.drawCircle(400, 200, (float) 105,  new Paint());
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
