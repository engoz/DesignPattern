package com.eng.oop.princible.ex1.good;

/**
 * Created by servicium on 26.10.2016.
 */
public class Tv implements RemoteControlInterface {

    public void on() {
        System.out.println("TV Ac�ldi");
    }

    public void off() {
        System.out.println("Tv Kapandi");
    }
}
