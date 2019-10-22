package app.rxretro.demo.utils;

import android.util.Log;

import app.rxretro.demo.BuildConfig;

public class L {

    private static final String TAG = "NANDITA";

    private L() {
    }

    public static void e(Object object) {
        if (BuildConfig.DEBUG)
            Log.i(TAG, String.valueOf(object));

    }
}
