package com.company.oberver;

public class ABCWeatherPortal implements WeatherPortal{

    private Float temperature;
    private Float pressure;
    private Float humidity;
    private String message;

    @Override
    public void update(Float temperature, Float pressure,Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        System.out.println(updateMessage());
    }
    public String updateMessage(){
        this.message ="ABCWeatherPortal reports temperature = "+temperature+" pressure =  "+pressure+" humidity = "+humidity;
        return this.message;
    }
}
