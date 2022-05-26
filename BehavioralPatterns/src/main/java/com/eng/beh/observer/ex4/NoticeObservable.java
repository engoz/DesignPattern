package com.eng.beh.observer.ex4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author engin.oz
 */
public class NoticeObservable implements Observable {

    private List<Observer> observerList = new ArrayList<Observer>();
    private String message = "Notice... !";


    public void addObserver(Observer observer) {
        observerList.add(observer); // Kullanıcıları duyuruya eklemek için.
    }


    public void removeObserver(Observer observer) {
        observerList.remove(observer); // Kullanıcıları duyurudan silmek için.
    }


    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.notify(message); // Duyuru ya kayıtlı kullanıcılara mesaj göndermek için.
        }
    }
}
