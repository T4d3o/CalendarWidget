package com.tormosoft.calendarwidget;

import android.text.format.DateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class DayOfWeekHelper {

	public static List<String> getDayOfWeek(int weekStartDay) {
		Calendar cal = Calendar.getInstance();
		// September 7th, 2013 is a Saturday.
		// Calendar.SUNDAY = 1, MONDAY = 2, and so forth.
		cal.set(2013, Calendar.SEPTEMBER, 7 + weekStartDay, 0, 0, 0);

		ArrayList<String> list = new ArrayList<String>(7);
		for (int i = 0; i < 7; i++) {
			list.add(DateFormat.format("E", cal).toString());
			cal.add(Calendar.DATE, 1);
		}
		return list;
	}

}
