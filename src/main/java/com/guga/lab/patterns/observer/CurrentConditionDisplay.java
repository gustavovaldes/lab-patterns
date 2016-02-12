package com.guga.lab.patterns.observer;

/**
 * Created by guga
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {


    private double temperature;
    private double humidity;
    private Subject wheatherData;


    public CurrentConditionDisplay(Subject wheatherData){
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();//todo remove with mvc
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature +" ºC , " +humidity +"% humidity" );
    }
}
