package ru.startandroid.develop.aweatherapplication.repository;

import retrofit2.Call;
import ru.startandroid.develop.aweatherapplication.data.body.Example;


public interface WeatherRepository {

    Call<Example>getCallExample(String q,int days);

}
