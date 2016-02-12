package com.guga.lab.patterns.observer;

import java.util.Calendar;

/**
 * Created by guga
 */
public class ForecastDisplay  extends   ThirdPartyDisplay implements Observer{

    Subject wheatherData;
    double[] temperatures = new double[2];

    public ForecastDisplay(Subject wheatherData){
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        temperatures[0] = temperatures[1];
        temperatures[1] = temperature;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Forecast :" +forecast()+ " ºC for next hour.");
    }


    private double forecast(){
        int hour = Calendar.getInstance().get(Calendar.HOUR);
        if(hour>17 || hour<7 ){
            return (temperatures[1]+ (temperatures[1]-temperatures[0])/24 );
        }else{
            return (temperatures[1]+ (temperatures[1]+temperatures[0])/24 );
        }
    }
}
