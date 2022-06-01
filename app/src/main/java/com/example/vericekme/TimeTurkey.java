package com.example.vericekme;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeTurkey {
    @SerializedName("utc_datetime")
    @Expose
    private String dateTime;

    @SerializedName("day_of_week")
    @Expose
    private int dayIfWeek;

    @SerializedName("week_number")
    @Expose
    private int weekNumber;

    @SerializedName("datetime")
    @Expose
    private String dateTime1;

    public TimeTurkey(String dateTime1) {
        this.dateTime1 = dateTime1;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getDayIfWeek() {
        return dayIfWeek;
    }

    public void setDayIfWeek(int dayIfWeek) {
        this.dayIfWeek = dayIfWeek;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }
}
