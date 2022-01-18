package com.company.oberver;

public class AvgTemperaturePortal implements WeatherPortal{

    private Float temperature;
    private Float pressure;
    private Float humidity;
    private static Float avgTemperature = 0.0f;
    private static Float avgPressure = 0.0f;
    private static Float avgHumidity = 0.0f;
    private static Integer count = 1;
    private String message;

    @Override
    public void update(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        calculateAvg();
        System.out.println(updateMessage());
    }
    public void calculateAvg(){
        if(count == 1){
            avgTemperature = this.temperature;
            avgPressure = this.pressure;
            avgHumidity = this.humidity;
            count++;

        }
        else{
            avgTemperature = (avgTemperature + this.temperature) / 2;
            avgPressure = (avgPressure + this.pressure) / 2;
            avgHumidity = (avgHumidity + this.humidity) / 2;
        }
    }
    public String updateMessage(){
        this.message ="AVGWeatherPortal reports temperature = "+avgTemperature+" pressure =  "+avgPressure+" humidity = "+avgHumidity;
        return this.message;
    }
}
