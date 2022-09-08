package ru.startandroid.develop.aweatherapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
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
import ru.startandroid.develop.aweatherapplication.adapter.AdapterDays;
import ru.startandroid.develop.aweatherapplication.data.body.Example;
import ru.startandroid.develop.aweatherapplication.data.body.Forecast;
import ru.startandroid.develop.aweatherapplication.data.body.Forecastday;
import ru.startandroid.develop.aweatherapplication.model.ViewModelDays;


public class FragmentDays extends Fragment {
    private List<Example> list = new ArrayList<>();
    private Forecast forecast;
    private List<Forecastday> forecastdays;
    private AdapterDays adapterDays;
    private ViewModelDays viewModelDays;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_days, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.reycleDays);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Intent intent = getActivity().getIntent();
        String nameCity = intent.getStringExtra("city");
        adapterDays = new AdapterDays();
        viewModelDays = new ViewModelProvider(getActivity()).get(ViewModelDays.class);
        viewModelDays.getDaysRecycle(nameCity, 3);
        viewModelDays.getDaysLiveData().observe(getActivity(), new Observer<Example>() {
            @Override
            public void onChanged(Example example) {
                forecast = example.getForecast();
                forecastdays = forecast.getForecastday();
                for (int i = 0; i < forecastdays.size(); i++) {
                    list.add(example);
                    System.out.println("====================Forecast " + forecastdays.get(i));
                }
                adapterDays.setDays(list);

            }

        });
        recyclerView.setAdapter(adapterDays);
    }
}