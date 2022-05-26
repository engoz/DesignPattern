package com.eng.beh.observer.ex4;

/**
 * @author engin.oz
 */
public class Main {

    public static void main(String[] args) {

        UserMan userMan = new UserMan();
        UserWomen userWoman = new UserWomen();

        NoticeObservable noticeObservable = new NoticeObservable();

        userWoman.setObservable(noticeObservable);

        noticeObservable.addObserver(userMan);
        noticeObservable.addObserver(userWoman);
        noticeObservable.notifyObserver();

        userWoman.removeObserver();
        noticeObservable.notifyObserver();

    }
}
