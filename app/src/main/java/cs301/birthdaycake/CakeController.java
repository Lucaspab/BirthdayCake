package cs301.birthdaycake;

import android.view.MotionEvent;
import android.view.View;

public class CakeController implements View.OnTouchListener {

    private CakeView cakeView;

    private CakeModel modelOfCake;


    public CakeController (CakeView viewOfCake){

        this.cakeView = viewOfCake;
        this.modelOfCake = viewOfCake.getCakeModel();

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            modelOfCake.x = motionEvent.getX();
            modelOfCake.y = motionEvent.getY();
            cakeView.invalidate();

            return true;
        }
        return false;
    }


}
