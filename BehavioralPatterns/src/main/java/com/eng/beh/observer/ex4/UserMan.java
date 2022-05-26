package com.eng.beh.observer.ex4;

/**
 * @author engin.oz
 */
public class UserMan implements Observer {

    private Observable observable;

    public void notify(String message) {
        System.out.println(message + " UserMan Mesaj Geldi.");
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }
}
