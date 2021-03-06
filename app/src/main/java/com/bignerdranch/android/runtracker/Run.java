package com.bignerdranch.android.runtracker;

import java.util.Date;

/**
 * Created by treetender on 4/20/15.
 */
public class Run {
    private Date mStartDate;
    private long mId;

    public Run() {
        mStartDate = new Date();
        mId = -1;
    }

    public long getId() { return mId; }
    public Date getStartDate() {
        return mStartDate;
    }

    public void setStartDate(Date startDate) {
        mStartDate = startDate;
    }
    public void setId(long id) { mId = id; }

    public int getDurationSeconds(long endMillis) {
        return (int)((endMillis - mStartDate.getTime()) / 1000);
    }

    public static String formatDuration(int durationSeconds) {
        int seconds = durationSeconds % 60;
        int minutes = ((durationSeconds - seconds) / 60) % 60;
        int hours = (durationSeconds - (minutes * 60) - seconds) / 3600;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
