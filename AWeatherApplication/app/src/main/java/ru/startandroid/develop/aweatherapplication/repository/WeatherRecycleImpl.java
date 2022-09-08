package ru.startandroid.develop.aweatherapplication.repository;

import retrofit2.Call;
import retrofit2.Retrofit;
import ru.startandroid.develop.aweatherapplication.data.body.Example;
import ru.startandroid.develop.aweatherapplication.repository.serviceapi.ApiService;

public class WeatherRecycleImpl implements WeatherRecycle{
    private final ApiService apiService;
    private Retrofit retrofit;
    private static final String KEY = "972d2f3885764b6e8e1115820223105";

    public WeatherRecycleImpl(ApiService apiService, Retrofit retrofit) {
        this.apiService = apiService;
        this.retrofit = retrofit;
    }

    @Override
    public Call<Example> getCallForecast(String q, int days) {
        return apiService.getJsonForecast(KEY,q,days,"no","no");
    }
}
