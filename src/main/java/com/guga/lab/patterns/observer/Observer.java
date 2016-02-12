package com.guga.lab.patterns.observer;

/**
 * Created by guga
 *
 * JDK provide a version @link java.util.Observer
 */
public interface Observer {

    void update(double temperature, double humidity, double pressure);

}
