package ru.startandroid.develop.aweatherapplication.repository;

import retrofit2.Call;
import retrofit2.Retrofit;
import ru.startandroid.develop.aweatherapplication.data.body.Example;
import ru.startandroid.develop.aweatherapplication.repository.serviceapi.ApiService;

public class WeatherRepositoryImpl implements WeatherRepository{
    private ApiService apiService;
    private Retrofit retrofit;
    private static final String KEY = "972d2f3885764b6e8e1115820223105";

    public WeatherRepositoryImpl(ApiService apiService, Retrofit retrofit) {
        this.apiService = apiService;
        this.retrofit = retrofit;
    }

    @Override
    public Call<Example> getCallExample(String q, int days) {
        return apiService.getJsonExample(KEY,q,days,"no","no");
    }
}
