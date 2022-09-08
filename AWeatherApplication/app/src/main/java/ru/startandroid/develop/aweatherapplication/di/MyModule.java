package ru.startandroid.develop.aweatherapplication.di;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.startandroid.develop.aweatherapplication.repository.WeatherRecycleImpl;
import ru.startandroid.develop.aweatherapplication.repository.WeatherRepositoryImpl;
import ru.startandroid.develop.aweatherapplication.repository.serviceapi.ApiService;


@Module
public class MyModule {
    private static final String BASE_URL = "http://api.weatherapi.com/";

    @Provides
    public WeatherRepositoryImpl getWeatherImpl(ApiService apiService, Retrofit retrofit) {
        return new WeatherRepositoryImpl(apiService, retrofit);
    }

    @Provides
    public Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    public ApiService apiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Provides
    public WeatherRecycleImpl getWeatRecycle(ApiService apiService, Retrofit retrofit) {
        return new WeatherRecycleImpl(apiService, retrofit);
    }


}
