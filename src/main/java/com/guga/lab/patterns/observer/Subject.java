package com.guga.lab.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guga
 *
 * JDK provide a complete implementation @link java.util.Observable
 */
public interface Subject {

    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}
