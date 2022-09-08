package ru.startandroid.develop.aweatherapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.develop.aweatherapplication.activities.SearchCities;
import ru.startandroid.develop.aweatherapplication.adapter.AdapterViewPager;
import ru.startandroid.develop.aweatherapplication.data.body.Condition__1;
import ru.startandroid.develop.aweatherapplication.data.body.Current;
import ru.startandroid.develop.aweatherapplication.data.body.Example;
import ru.startandroid.develop.aweatherapplication.data.body.Forecast;
import ru.startandroid.develop.aweatherapplication.data.body.Forecastday;
import ru.startandroid.develop.aweatherapplication.data.body.Location;
import ru.startandroid.develop.aweatherapplication.fragments.FragmentDays;
import ru.startandroid.develop.aweatherapplication.fragments.FragmentHours;
import ru.startandroid.develop.aweatherapplication.model.ViewModelWeather;

public class MainActivity extends AppCompatActivity {
  private TabLayout tabLayout;
  private ViewPager2 viewPager2;
  private TabLayoutMediator tabLayoutMediator;
  private List<Fragment>list;
  private List<String>tabNames;
  private AdapterViewPager adapterViewPager;


  private TextView textTimeAndDay,textCity,textTemperature,textType,textMaxMin;
  private ImageView imageViewIcon,imageSearch;
  private ViewModelWeather viewModelWeather;
  private Current current;
  private Location location;
  private List<Forecastday> forecastday;
  private Forecast forecast;
  private String nameCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        initializeCardView();

    }

    public void initializeCardView(){
        textTimeAndDay = findViewById(R.id.textDateAndTime);
        textCity = findViewById(R.id.textCity);
        textTemperature = findViewById(R.id.textTemperature);
        textType = findViewById(R.id.textType);
        textMaxMin = findViewById(R.id.textMaxMin);

        imageViewIcon = findViewById(R.id.imageIcon);
        imageSearch = findViewById(R.id.imageView3);
        realizationCardView();
    }
    private void initialize(){
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.pager2);
        realizationViewPager();
    }

    private StringBuilder getParser(String url){
        StringBuilder stringBuilder = new StringBuilder(url);
        stringBuilder.insert(0,"https:");
        return stringBuilder;
    }

    private void realizationViewPager(){
        list = new ArrayList<>();
        list.add(new FragmentHours());
        list.add(new FragmentDays());

       tabNames = new ArrayList<>();
       tabNames.add("Hours");
       tabNames.add("Days");

        adapterViewPager = new AdapterViewPager(this,list);

        tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(tabNames.get(position));
            }
        });

        viewPager2.setAdapter(adapterViewPager);
        tabLayoutMediator.attach();
    }
    private void realizationCardView(){
        imageSearch.setOnClickListener(view -> {
            Intent intent = new Intent(this,SearchCities.class);
            startActivity(intent);
        });
        Intent intent = getIntent();
        nameCity = intent.getStringExtra("city");
        viewModelWeather = new ViewModelProvider(MainActivity.this).get(ViewModelWeather.class);
        viewModelWeather.getResultViewModel(nameCity,1);


        viewModelWeather.liveData().observe(MainActivity.this, new Observer<Example>() {
            @Override
            public void onChanged(Example example) {
                location = example.getLocation();
                current = example.getCurrent();
                forecast = example.getForecast();
                forecastday =forecast.getForecastday();

                for (int i = 0; i <forecastday.size() ; i++) {
                    Condition__1 condition__1 = forecastday.get(i).getDay().getCondition();
                    textTimeAndDay.setText(forecastday.get(i).getDate());
                    textCity.setText(location.getName());
                    textTemperature.setText(current.getTempC()+"");
                    textType.setText(condition__1.getText());
                    textMaxMin.setText(forecastday.get(i).getDay().getMaxtempC()+" / "+forecastday.get(i).getDay().getMintempC());
                    String url = condition__1.getIcon();
                    StringBuilder stringBuilder = getParser(url);
                    Picasso.get().load(String.valueOf(stringBuilder)).into(imageViewIcon);
                }
            }
        });
    }
}