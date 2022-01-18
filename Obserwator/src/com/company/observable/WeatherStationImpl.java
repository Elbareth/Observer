package com.company.observable;

import com.company.oberver.WeatherPortal;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationImpl implements WeatherStation{

    private List<WeatherPortal> portalList;

    public WeatherStationImpl() {
        this.portalList = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherPortal weatherPortal) {
        portalList.add(weatherPortal);
    }

    @Override
    public void removeObserver(WeatherPortal weatherPortal) {
        portalList.remove(weatherPortal);
    }

    @Override
    public void notifyObserver() {
        portalList.forEach(it->{
            it.update(26.6f,1000.5f,30.5f);
            it.update(30.5f,1010.1f,66.6f);
            it.update(40.05f,999.6f,90.9f);
        });
    }
}
