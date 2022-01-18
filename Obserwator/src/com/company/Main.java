package com.company;

import com.company.oberver.*;
import com.company.observable.WeatherStation;
import com.company.observable.WeatherStationImpl;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStationImpl();
        WeatherPortal abcWeatherPortal = new ABCWeatherPortal();
        WeatherPortal avgWeatherPortal = new AvgTemperaturePortal();
        WeatherPortal minWeatherPortal = new MinWeatherPortal();
        WeatherPortal maxWeatherPortal = new MaxWeatherPortal();
        weatherStation.addObserver(abcWeatherPortal);
        weatherStation.addObserver(avgWeatherPortal);
        weatherStation.addObserver(minWeatherPortal);
        weatherStation.addObserver(maxWeatherPortal);
        weatherStation.notifyObserver();

    }
}
