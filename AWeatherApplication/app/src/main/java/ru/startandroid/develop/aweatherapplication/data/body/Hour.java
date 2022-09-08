package ru.startandroid.develop.aweatherapplication.data.body;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hour {

    @SerializedName("time_epoch")
    @Expose
    private int timeEpoch;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("temp_c")
    @Expose
    private double tempC;
    @SerializedName("temp_f")
    @Expose
    private double tempF;
    @SerializedName("is_day")
    @Expose
    private int isDay;
    @SerializedName("condition")
    @Expose
    private Condition__2 condition;
    @SerializedName("wind_mph")
    @Expose
    private double windMph;
    @SerializedName("wind_kph")
    @Expose
    private double windKph;
    @SerializedName("wind_degree")
    @Expose
    private int windDegree;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure_mb")
    @Expose
    private double pressureMb;
    @SerializedName("pressure_in")
    @Expose
    private double pressureIn;
    @SerializedName("precip_mm")
    @Expose
    private double precipMm;
    @SerializedName("precip_in")
    @Expose
    private double precipIn;
    @SerializedName("humidity")
    @Expose
    private int humidity;
    @SerializedName("cloud")
    @Expose
    private int cloud;
    @SerializedName("feelslike_c")
    @Expose
    private double feelslikeC;
    @SerializedName("feelslike_f")
    @Expose
    private double feelslikeF;
    @SerializedName("windchill_c")
    @Expose
    private double windchillC;
    @SerializedName("windchill_f")
    @Expose
    private double windchillF;
    @SerializedName("heatindex_c")
    @Expose
    private double heatindexC;
    @SerializedName("heatindex_f")
    @Expose
    private double heatindexF;
    @SerializedName("dewpoint_c")
    @Expose
    private double dewpointC;
    @SerializedName("dewpoint_f")
    @Expose
    private double dewpointF;
    @SerializedName("will_it_rain")
    @Expose
    private int willItRain;
    @SerializedName("chance_of_rain")
    @Expose
    private int chanceOfRain;
    @SerializedName("will_it_snow")
    @Expose
    private int willItSnow;
    @SerializedName("chance_of_snow")
    @Expose
    private int chanceOfSnow;
    @SerializedName("vis_km")
    @Expose
    private double visKm;
    @SerializedName("vis_miles")
    @Expose
    private double visMiles;
    @SerializedName("gust_mph")
    @Expose
    private double gustMph;
    @SerializedName("gust_kph")
    @Expose
    private double gustKph;
    @SerializedName("uv")
    @Expose
    private double uv;

    public int getTimeEpoch() {
        return timeEpoch;
    }

    public void setTimeEpoch(int timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public int getIsDay() {
        return isDay;
    }

    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    public Condition__2 getCondition() {
        return condition;
    }

    public void setCondition(Condition__2 condition) {
        this.condition = condition;
    }

    public double getWindMph() {
        return windMph;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public double getWindKph() {
        return windKph;
    }

    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    public double getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public double getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(double windchillC) {
        this.windchillC = windchillC;
    }

    public double getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(double windchillF) {
        this.windchillF = windchillF;
    }

    public double getHeatindexC() {
        return heatindexC;
    }

    public void setHeatindexC(double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public double getHeatindexF() {
        return heatindexF;
    }

    public void setHeatindexF(double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public int getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(int willItRain) {
        this.willItRain = willItRain;
    }

    public int getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(int chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public int getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(int willItSnow) {
        this.willItSnow = willItSnow;
    }

    public int getChanceOfSnow() {
        return chanceOfSnow;
    }

    public void setChanceOfSnow(int chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
    }

    public double getVisKm() {
        return visKm;
    }

    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    public double getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(double visMiles) {
        this.visMiles = visMiles;
    }

    public double getGustMph() {
        return gustMph;
    }

    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }

    public double getGustKph() {
        return gustKph;
    }

    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }
}
