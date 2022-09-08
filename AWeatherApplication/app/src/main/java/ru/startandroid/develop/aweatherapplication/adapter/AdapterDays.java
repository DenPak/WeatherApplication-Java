package ru.startandroid.develop.aweatherapplication.adapter;

import android.annotation.SuppressLint;
import android.util.Log;
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
import ru.startandroid.develop.aweatherapplication.data.body.Forecastday;

public class AdapterDays extends RecyclerView.Adapter<AdapterDays.MyViewHolder> {
    private List<Example> list = Collections.emptyList();
    private List<Forecastday> forecastdays;

    public void setDays(List<Example> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Example example = list.get(position);
        Log.d("qog","====================Forecast example"+example);
        forecastdays = example.getForecast().getForecastday();
        String url = forecastdays.get(position).getDay().getCondition().getIcon();
        StringBuilder stringBuilder = parser(url);
        for (int i = 0; i < forecastdays.size(); i++) {
            holder.textDate.setText(forecastdays.get(position).getDate());
            holder.textCondition.setText(forecastdays.get(position).getDay().getCondition().getText());
            Picasso.get().load(String.valueOf(stringBuilder)).into(holder.imageView);
            holder.texTemperature.setText(forecastdays.get(position).getDay().getMaxtempC() + "°C" + "/" + forecastdays.get(position).getDay().getMintempC() + "°C");
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
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
    private StringBuilder parser(String url){
        StringBuilder stringBuilder = new StringBuilder(url);
        stringBuilder.insert(0, "https:");
        return stringBuilder;
    }
}

