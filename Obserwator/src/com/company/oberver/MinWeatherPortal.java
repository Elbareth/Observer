package com.company.oberver;

public class MinWeatherPortal implements WeatherPortal{

    private Float temperature;
    private Float pressure;
    private Float humidity;
    private static Float minTemperature = Float.MAX_VALUE;
    private static Float minPressure = Float.MAX_VALUE;
    private static Float minHumidity = Float.MAX_VALUE;
    private String message;

    @Override
    public void update(Float temperature, Float pressure,Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        findMinValue();
        System.out.println(updateMessage());
    }
    public void findMinValue(){
        minTemperature = Math.min(temperature, minTemperature);
        minPressure = Math.min(pressure, minPressure);
        minHumidity = Math.min(humidity, minHumidity);
    }

    public String updateMessage(){
        this.message ="MinWeatherPortal reports temperature = "+minTemperature+" pressure =  "+minPressure+" humidity = "+minHumidity;
        return this.message;
    }
}
