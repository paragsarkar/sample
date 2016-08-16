package com.example.user.locationwithoutgps;

import android.content.Context;
import android.util.Log;
import android.view.View;

/**
 * Created by USER on 7/25/2016.
 */
public class OnClickListenerButtonStart  implements View.OnClickListener {

    final String TAG = "ButtonStart";

    MainActivity mainActivity;
    Context context;

    @Override
    public void onClick(View view) {

        Log.e(TAG, "location");

        // to get the context and main activity
        this.context = view.getContext();
        this.mainActivity = ((MainActivity) context);

        // disable the START button, enable the STOP button
        mainActivity.buttonStart.setEnabled(false);
        mainActivity.buttonStop.setEnabled(true);

        // start listening to location updates
        mainActivity.locationHelper.getLocation(mainActivity, mainActivity.locationResult);

    }

}