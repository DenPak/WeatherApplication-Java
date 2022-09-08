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
import ru.startandroid.develop.aweatherapplication.repository.WeatherRecycleImpl;

public class ViewModelHours extends ViewModel {
    private MutableLiveData<Example> mutableLiveData;
    private WeatherRecycleImpl weatherRecycle = DaggerAppComponent.create().getWeatherRecycle();
    private static final String TAG = "Log";

    public LiveData<Example> getRecycleLiveData() {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
        }
        return mutableLiveData;
    }

    public void getHoursData(String q, int days) {
        Call<Example> call = weatherRecycle.getCallForecast(q, days);
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful()) {
                    mutableLiveData.postValue(response.body());
                    Log.d(TAG, "responseHours success");
                } else {
                    Log.d(TAG, "responseHours error");
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d(TAG, "responseHours -  " + call.request() + ", responseHours error " + t.getLocalizedMessage());
            }
        });


    }
}
