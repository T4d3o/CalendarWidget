package com.tormosoft.calendarwidget;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;

/**
 * Created by armando on 30/08/15.
 */
public class CalendarReceiver  extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intento) {
        if (intento.getAction().equalsIgnoreCase("android.intent.action.PROVIDER_CHANGED")) {
            //Toast.makeText(context, "Calendar Update Received",
            //        Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(context, CalendarWidgetProvider.class);
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context.getApplicationContext());
            ComponentName thisWidget = new ComponentName(context.getApplicationContext(), CalendarWidgetProvider.class);
            intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
            // Use an array and EXTRA_APPWIDGET_IDS instead of AppWidgetManager.EXTRA_APPWIDGET_ID,
            // since it seems the onUpdate() is only fired on that:
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(thisWidget);
            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds);
            context.sendBroadcast(intent);
        }
    }
}
