package com.android.calculator2.bkav;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.android.calculator2.Calculator;
import com.android.calculator2.R;


public class BkavCalculator extends Calculator {

    private CheckPermission mCheckPermission;
    private WallpaperBlurCompat mWallpaperBlurCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCheckPermission = new CheckPermission(this);
        //Bkav TienNVh :Setbackground
      //  setBlurBackground();
      //  mMainCalculator.setVisibility(View.GONE);








    }

    @Override
    public int getMainResId() {
        return R.layout.bkav_activity_calculator_main;
    }

    private void setBlurBackground() {
        Bitmap backgroundBitmapFromRom = getBluredBackgroundFromRom();
        mDragLayout.setBackground(new BitmapDrawable(backgroundBitmapFromRom));
        if (mPadViewPager != null)
            mPadViewPager.setBackgroundColor(Color.TRANSPARENT);
    }

    // Bkav TienNVh : lay hinh nen
    private Bitmap getBluredBackgroundFromRom() {
        if (mWallpaperBlurCompat == null) {
            mWallpaperBlurCompat = new WallpaperBlurCompat(this, mCheckPermission);
        }
        return mWallpaperBlurCompat.getWallpaperBlur();
    }

}
