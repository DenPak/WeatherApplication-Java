package ru.startandroid.develop.aweatherapplication.model;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ru.startandroid.develop.aweatherapplication.data.body.Example;

import ru.startandroid.develop.aweatherapplication.di.DaggerAppComponent;
import ru.startandroid.develop.aweatherapplication.repository.WeatherRepositoryImpl;

public class ViewModelWeather extends ViewModel {
    private MutableLiveData<Example> mutableLiveData;
    private WeatherRepositoryImpl weatherRepository = DaggerAppComponent.create().getWeatherImplComp();

    private static final String TAG = "log";

    public LiveData<Example> liveData() {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
        }
        return mutableLiveData;
    }

    public void getResultViewModel(String q, int days) {

        Call<Example> call = weatherRepository.getCallExample(q, days);
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful()) {
                    mutableLiveData.postValue(response.body());
                    Log.d(TAG, "Success");
                } else {
                    Log.d(TAG, "Error");
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d(TAG, "response - " + call.request() + ",error  - " + t.getLocalizedMessage());
            }
        });

    }

}
