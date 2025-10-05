package cs301.birthdaycake;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnTouchListener, View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

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

    @Override
    public void onClick(View view){
        modelOfCake.candleLit = false;
        cakeView.invalidate();
    }



    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isOn ){
        modelOfCake.yayOrNayCandles = isOn;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean amount){
        modelOfCake.howManyCandles = progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar){

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar){

    }


}
