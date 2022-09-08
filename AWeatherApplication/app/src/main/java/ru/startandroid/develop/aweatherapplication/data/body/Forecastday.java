package ru.startandroid.develop.aweatherapplication.data.body;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Forecastday {
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_epoch")
    @Expose
    private int dateEpoch;
    @SerializedName("day")
    @Expose
    private Day day;

    @SerializedName("hour")
    @Expose
    private List<Hour> hour = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDateEpoch() {
        return dateEpoch;
    }

    public void setDateEpoch(int dateEpoch) {
        this.dateEpoch = dateEpoch;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }



    public List<Hour> getHour() {
        return hour;
    }

    public void setHour(List<Hour> hour) {
        this.hour = hour;
    }
}
