package ru.startandroid.develop.aweatherapplication.repository.serviceapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.startandroid.develop.aweatherapplication.data.body.Example;
import ru.startandroid.develop.aweatherapplication.data.body.Forecast;
import ru.startandroid.develop.aweatherapplication.data.body.Forecastday;

public interface ApiService {
    @GET("v1/forecast.json?")
    Call<Example> getJsonExample(@Query("key")String key,@Query("q")String q,@Query("days") int days,@Query("aqi")String aqi,@Query("alerts")String alerts);

    @GET("v1/forecast.json?")
    Call<Example> getJsonForecast(@Query("key")String key, @Query("q")String q, @Query("days") int days, @Query("aqi")String aqi, @Query("alerts")String alerts);


}
