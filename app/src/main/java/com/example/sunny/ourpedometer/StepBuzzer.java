package com.example.sunny.ourpedometer;

import android.content.Context;
import android.os.Vibrator;

/**
 * Created by sunny on 12/8/15.
 */
public class StepBuzzer implements StepListener {

    private Context mContext;
    private Vibrator mVibrator;

    public StepBuzzer(Context context) {
        mContext = context;
        mVibrator = (Vibrator)mContext.getSystemService(Context.VIBRATOR_SERVICE);
    }

    public void onStep() {
        buzz();
    }

    public void passValue() {

    }

    private void buzz() {
        mVibrator.vibrate(50);
    }
}

