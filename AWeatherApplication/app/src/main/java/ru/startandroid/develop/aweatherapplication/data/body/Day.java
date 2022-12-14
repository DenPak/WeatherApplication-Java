package ru.startandroid.develop.aweatherapplication.data.body;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Day {
    @SerializedName("maxtemp_c")
    @Expose
    private double maxtempC;
    @SerializedName("maxtemp_f")
    @Expose
    private double maxtempF;
    @SerializedName("mintemp_c")
    @Expose
    private double mintempC;
    @SerializedName("mintemp_f")
    @Expose
    private double mintempF;
    @SerializedName("avgtemp_c")
    @Expose
    private double avgtempC;
    @SerializedName("avgtemp_f")
    @Expose
    private double avgtempF;
    @SerializedName("maxwind_mph")
    @Expose
    private double maxwindMph;
    @SerializedName("maxwind_kph")
    @Expose
    private double maxwindKph;
    @SerializedName("totalprecip_mm")
    @Expose
    private double totalprecipMm;
    @SerializedName("totalprecip_in")
    @Expose
    private double totalprecipIn;
    @SerializedName("avgvis_km")
    @Expose
    private double avgvisKm;
    @SerializedName("avgvis_miles")
    @Expose
    private double avgvisMiles;
    @SerializedName("avghumidity")
    @Expose
    private double avghumidity;
    @SerializedName("daily_will_it_rain")
    @Expose
    private int dailyWillItRain;
    @SerializedName("daily_chance_of_rain")
    @Expose
    private int dailyChanceOfRain;
    @SerializedName("daily_will_it_snow")
    @Expose
    private int dailyWillItSnow;
    @SerializedName("daily_chance_of_snow")
    @Expose
    private int dailyChanceOfSnow;
    @SerializedName("condition")
    @Expose
    private Condition__1 condition;
    @SerializedName("uv")
    @Expose
    private double uv;

    public double getMaxtempC() {
        return maxtempC;
    }

    public void setMaxtempC(double maxtempC) {
        this.maxtempC = maxtempC;
    }

    public double getMaxtempF() {
        return maxtempF;
    }

    public void setMaxtempF(double maxtempF) {
        this.maxtempF = maxtempF;
    }

    public double getMintempC() {
        return mintempC;
    }

    public void setMintempC(double mintempC) {
        this.mintempC = mintempC;
    }

    public double getMintempF() {
        return mintempF;
    }

    public void setMintempF(double mintempF) {
        this.mintempF = mintempF;
    }

    public double getAvgtempC() {
        return avgtempC;
    }

    public void setAvgtempC(double avgtempC) {
        this.avgtempC = avgtempC;
    }

    public double getAvgtempF() {
        return avgtempF;
    }

    public void setAvgtempF(double avgtempF) {
        this.avgtempF = avgtempF;
    }

    public double getMaxwindMph() {
        return maxwindMph;
    }

    public void setMaxwindMph(double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }

    public double getMaxwindKph() {
        return maxwindKph;
    }

    public void setMaxwindKph(double maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    public double getTotalprecipMm() {
        return totalprecipMm;
    }

    public void setTotalprecipMm(double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

    public double getTotalprecipIn() {
        return totalprecipIn;
    }

    public void setTotalprecipIn(double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
    }

    public double getAvgvisKm() {
        return avgvisKm;
    }

    public void setAvgvisKm(double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    public double getAvgvisMiles() {
        return avgvisMiles;
    }

    public void setAvgvisMiles(double avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
    }

    public double getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(double avghumidity) {
        this.avghumidity = avghumidity;
    }

    public int getDailyWillItRain() {
        return dailyWillItRain;
    }

    public void setDailyWillItRain(int dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    public int getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    public void setDailyChanceOfRain(int dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    public int getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    public void setDailyWillItSnow(int dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }

    public int getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    public void setDailyChanceOfSnow(int dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    public Condition__1 getCondition() {
        return condition;
    }

    public void setCondition(Condition__1 condition) {
        this.condition = condition;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }
}
