package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class text {
    enum typeText{
    printText;
    }
    private typeText object;
    private Paint textPaint;

    private float x1,y1;

    public text(float x, float y, typeText t){

        x1 = x;
        y1 = y;

        textPaint = new Paint();
        textPaint.setColor(Color.RED);
        textPaint.setTextSize(80);

        object = t;
    }

    public void draw(Canvas canvas){
        switch(object){
            case printText:

                canvas.drawText( ("("+ x1 +", " + y1 +")"), 1600, 1000, textPaint);
        }

    }

}
