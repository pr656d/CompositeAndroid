package com.pascalwelsch.compositeandroid;

import com.pascalwelsch.compositeandroid.activity.ActivityPlugin;

import android.util.Log;

public class Tracking2 extends ActivityPlugin {

    private static final String TAG = Tracking2.class.getSimpleName();

    @Override
    public void onResume() {
        super.onResume();
        Log.v(TAG, "#2 onResume()");
    }
}
