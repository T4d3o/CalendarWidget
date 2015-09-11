package com.tormosoft.calendarwidget;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.format.DateUtils;

import java.util.Calendar;
import java.util.Date;


/**
 * Created by armando.ortega@gmail.com on 27/08/15.
 */
public class CalendarHelper {


    public static boolean getEventsT( Context context, long date ){

        long dtstart = date;
        long dtend = date + DateUtils.DAY_IN_MILLIS;

        String selectionClause = "(dtstart >= ? AND dtend <= ?)";
        String[] selectionsArgs = new String[]{"" + dtstart, "" + dtend};

        Cursor cursor = context.getContentResolver()
                .query(
                        Uri.parse("content://com.android.calendar/events"),
                        new String[]{"calendar_id", "title", "description",
                                "dtstart", "dtend", "eventLocation"},
                        selectionClause, selectionsArgs, null);

        if ( cursor.getCount() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static long cleanEpoch(long time){

        long temp = time;

        long years = temp % DateUtils.YEAR_IN_MILLIS;

        long months = years % DateUtils.WEEK_IN_MILLIS;

        long days = months % DateUtils.DAY_IN_MILLIS;

        long clean = temp - days;

        return clean;
    }

}
