package com.eng.beh.observer.ex4;

/**
 * @author engin.oz
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
