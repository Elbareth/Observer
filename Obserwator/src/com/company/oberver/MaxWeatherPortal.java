package com.company.oberver;

public class MaxWeatherPortal implements WeatherPortal{
    private Float temperature;
    private Float pressure;
    private Float humidity;
    private static Float maxTemperature = Float.MIN_VALUE;
    private static Float maxPressure = Float.MIN_VALUE;
    private static Float maxHumidity = Float.MIN_VALUE;
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
        maxTemperature = Math.max(temperature, maxTemperature);
        maxPressure = Math.max(pressure, maxPressure);
        maxHumidity = Math.max(humidity, maxHumidity);
    }

    public String updateMessage(){
        this.message ="MaxWeatherPortal reports temperature = "+maxTemperature+" pressure =  "+maxPressure+" humidity = "+maxHumidity;
        return this.message;
    }
}
