package com.eng.beh.observer.ex1;

/**
 * This is observed.
 */
public interface Gazete {

    void aboneEkle(Abone abone);
    void aboneSil(Abone abone);
    //notify
    void gazeteGonder();

}
