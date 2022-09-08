package ru.startandroid.develop.aweatherapplication.di;

import dagger.Component;
import ru.startandroid.develop.aweatherapplication.repository.WeatherRecycleImpl;
import ru.startandroid.develop.aweatherapplication.repository.WeatherRepositoryImpl;


@Component (modules = MyModule.class)
public interface AppComponent {

    WeatherRepositoryImpl getWeatherImplComp();
    WeatherRecycleImpl getWeatherRecycle();

}
