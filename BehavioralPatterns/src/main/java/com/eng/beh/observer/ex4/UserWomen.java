package com.eng.beh.observer.ex4;

/**
 * @author engin.oz
 */
public class UserWomen implements Observer {

    private Observable observable;

    public UserWomen() {
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }


    public void notify(String message) {
        System.out.println(message + " UserWoman Mesaj Geldi.");
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }
}
