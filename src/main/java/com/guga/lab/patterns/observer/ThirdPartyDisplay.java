package com.guga.lab.patterns.observer;

/**
 * Created by guga
 */
public abstract class ThirdPartyDisplay implements Observer, DisplayElement {

    double pressure;
    @Override
    public void display() {
        System.out.println(" Powered by Acme "+ pressure/1.04d);
    }
}
