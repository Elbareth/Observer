package com.company.observable;

import com.company.oberver.WeatherPortal;

public interface WeatherStation {
    void addObserver(WeatherPortal weatherPortal);
    void removeObserver(WeatherPortal weatherPortal);
    void notifyObserver();
}
