package com.tormosoft.calendarwidget;

public class ResourceHelper {

    @SuppressWarnings("unused")
    private static final int DARK_THEME = 0;
    private static final int LIGHT_THEME = 1;

    public static int layoutCellDay(int theme) {
        return theme == LIGHT_THEME ? R.layout.cell_day_light : R.layout.cell_day_dark;
    }

    public static int layoutCellToday(int theme) {
        return theme == LIGHT_THEME ? R.layout.cell_today_light : R.layout.cell_today_dark;
    }

    public static int layoutCellTodayEv(int theme) {
        return theme == LIGHT_THEME ? R.layout.cell_today_event_light : R.layout.cell_today_event_dark;
    }

    public static int layoutCellTodayWeekEnd(int theme) {
        return theme == LIGHT_THEME ? R.layout.cell_today_weekend_light : R.layout.cell_today_weekend_dark;
    }

    public static int layoutCellTodayWeekEndEv(int theme) {
        return theme == LIGHT_THEME ? R.layout.cell_today_weekend_event_light : R.layout.cell_today_weekend_event_dark;
    }

    public static int layoutCellInMonth(int theme) {
        return theme == LIGHT_THEME ? R.layout.cell_in_month_light : R.layout.cell_in_month_dark;
    }

    public static int layoutCellInMonthEv(int theme) {
        return theme == LIGHT_THEME ? R.layout.cell_in_month_event_light : R.layout.cell_in_month_event_dark;
    }

    public static int layoutCellInMonthWeekEnd(int theme) {
        return theme == LIGHT_THEME ? R.layout.cell_in_month_weekend_light : R.layout.cell_in_month_weekend_dark;
    }

    public static int layoutCellInMonthWeekEndEv(int theme) {
        return theme == LIGHT_THEME ? R.layout.cell_in_month_weekend_event_light : R.layout.cell_in_month_weekend_event_dark;
    }

    public static int layoutWidget(int theme) {
        return theme == LIGHT_THEME ? R.layout.widget_light : R.layout.widget_dark;
    }

}
