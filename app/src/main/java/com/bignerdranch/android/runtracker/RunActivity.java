package com.bignerdranch.android.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by treetender on 4/20/15.
 */
public class RunActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new RunFragment();
    }
}
