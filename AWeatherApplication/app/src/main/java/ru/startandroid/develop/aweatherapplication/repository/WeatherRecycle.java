package ru.startandroid.develop.aweatherapplication.repository;

import retrofit2.Call;
import ru.startandroid.develop.aweatherapplication.data.body.Example;

public interface WeatherRecycle {
    Call<Example> getCallForecast(String q, int days);
}
