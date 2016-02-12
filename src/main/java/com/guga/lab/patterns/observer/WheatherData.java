package com.guga.lab.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guga
 */
public class WheatherData implements Subject {

    List<Observer> observers;

    private double temperature;
    private double humidity;
    private double pressure;

    private boolean  changed = false;

    public WheatherData(){
        observers = new ArrayList<>();
    }

    private void measuresChanged(){
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        changed= true;
        measuresChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if(changed)
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
        changed = false;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
