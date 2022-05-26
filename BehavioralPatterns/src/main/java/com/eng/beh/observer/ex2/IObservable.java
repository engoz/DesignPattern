package com.eng.beh.observer.ex2;

/**
 * Created by servicium on 27.09.2015.
 */
public interface IObservable {

    void Register(Kontrol k);
    void UnRegister(Kontrol k);
    void Notify();
}
