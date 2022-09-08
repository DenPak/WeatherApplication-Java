package ru.startandroid.develop.aweatherapplication.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;


import ru.startandroid.develop.aweatherapplication.R;

import ru.startandroid.develop.aweatherapplication.data.body.Example;
import ru.startandroid.develop.aweatherapplication.data.body.Forecast;
import ru.startandroid.develop.aweatherapplication.data.body.Forecastday;
import ru.startandroid.develop.aweatherapplication.data.body.Hour;


public class AdapterHours extends RecyclerView.Adapter<AdapterHours.MyViewHolder> {
    public List<Example> list = Collections.emptyList();
    private List<Forecastday> forecastdays;
    private List<Hour> hours = Collections.emptyList();

    public void setData(List<Example> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Example example = list.get(position);
        Forecast forecast = example.getForecast();
        forecastdays = forecast.getForecastday();

        for (int i = 0; i < forecastdays.size(); i++) {
            hours = forecastdays.get(i).getHour();
            System.out.println("forecast " + forecastdays.get(i));
        }

        String url = hours.get(position).getCondition().getIcon();
        StringBuilder stringBuilder = new StringBuilder(url);
        stringBuilder.insert(0, "https:");

        for (int i = 0; i < hours.size(); i++) {
            holder.textDate.setText(hours.get(position).getTime());
            holder.texTemperature.setText(hours.get(position).getTempC() + "°C");
            holder.textCondition.setText(hours.get(position).getCondition().getText());
            Picasso.get().load(String.valueOf(stringBuilder)).into(holder.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textDate, textCondition, texTemperature;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textDate = itemView.findViewById(R.id.textDateList);
            textCondition = itemView.findViewById(R.id.textConditionList);
            texTemperature = itemView.findViewById(R.id.textTempListItem);
            imageView = itemView.findViewById(R.id.imageListItem);

        }
    }
}
