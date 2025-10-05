package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView view = findViewById(R.id.cakeView);
        CakeController controller = new CakeController(view);
        view.setOnTouchListener(controller);


        Button blowOut = findViewById(R.id.button);
        blowOut.setOnClickListener(controller);

        Switch candlesSwitch = findViewById(R.id.switch2);
        candlesSwitch.setOnCheckedChangeListener(controller);

        SeekBar candles = findViewById(R.id.seekBar);
        candles.setMax(5); // max at 5
        candles.setProgress(2); // starts with 2 candles
        candles.setOnSeekBarChangeListener(controller);

    }


    public void goodbye(View button) {
        //System.out.println("Goodbye");
        Log.i("button", "Goodbye");
    }


}
