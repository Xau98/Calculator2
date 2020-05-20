package com.android.calculator2.bkav;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import com.android.calculator2.CalculatorDisplay;

public class BkavCalculatorDisplay extends CalculatorDisplay {

    public BkavCalculatorDisplay(Context context) {
        super(context);
        Log.d("TienNVh", "BkavCalculatorDisplay: " );
    }

    public BkavCalculatorDisplay(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BkavCalculatorDisplay(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
