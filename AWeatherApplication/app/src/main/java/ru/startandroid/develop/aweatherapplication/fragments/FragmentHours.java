package ru.startandroid.develop.aweatherapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.develop.aweatherapplication.R;
import ru.startandroid.develop.aweatherapplication.adapter.AdapterHours;

import ru.startandroid.develop.aweatherapplication.data.body.Example;
import ru.startandroid.develop.aweatherapplication.data.body.Forecast;
import ru.startandroid.develop.aweatherapplication.data.body.Forecastday;
import ru.startandroid.develop.aweatherapplication.data.body.Hour;

import ru.startandroid.develop.aweatherapplication.model.ViewModelHours;


public class FragmentHours extends Fragment {
    private AdapterHours myAdapterRecycle;
    private List<Example> list = new ArrayList<>();
    private List<Hour> hours = new ArrayList<>();
    private Forecastday forecastday;
    private RecyclerView recyclerView;
    private ViewModelHours viewModelRecycle;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmen_hours, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycleHours);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myAdapterRecycle = new AdapterHours();
        viewModelRecycle = new ViewModelProvider(getActivity()).get(ViewModelHours.class);
        Intent intent = getActivity().getIntent();
        String nameCity = intent.getStringExtra("city");
        Log.d("log", "sss " + nameCity);
        viewModelRecycle.getHoursData(nameCity, 2);
        viewModelRecycle.getRecycleLiveData().observe(getActivity(), new Observer<Example>() {
            @Override
            public void onChanged(Example example) {
                Forecast forecast = example.getForecast();
                List<Forecastday> forecastdays = forecast.getForecastday();
                for (int i = 0; i < forecastdays.size(); i++) {
                    forecastday = forecastdays.get(i);
                }
                hours = forecastday.getHour();
                for (int i = 0; i < hours.size(); i++) {
                    list.add(example);
                }
                myAdapterRecycle.setData(list);
            }
        });
        recyclerView.setAdapter(myAdapterRecycle);
    }
}
