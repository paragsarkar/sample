package com.example.user.locationwithoutgps;

import android.content.Context;
import android.util.Log;
import android.view.View;

/**
 * Created by USER on 7/25/2016.
 */
public class OnClickListenerButtonEnd implements View.OnClickListener {

    final String TAG = "ButtonEnd.java";

    MainActivity mainActivity;
    Context context;

    @Override
    public void onClick(View view) {

        Log.e(TAG, "Ended getting user location.");

        // to get the context and main activity
        this.context = view.getContext();
        this.mainActivity = ((MainActivity) context);

        // enable the START button, disable the STOP button
        mainActivity.buttonStart.setEnabled(true);
        mainActivity.buttonStop.setEnabled(false);

        // stop the listener
        mainActivity.locationHelper.stopGettingLocationUpdates();

    }
}
