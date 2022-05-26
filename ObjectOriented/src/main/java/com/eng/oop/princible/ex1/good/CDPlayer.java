package com.eng.oop.princible.ex1.good;

/**
 * Created by servicium on 26.10.2016.
 */
public class CDPlayer implements RemoteControlInterface {

    public void on() {
        System.out.println("CD player A��ld�");
    }

    public void off() {
        System.out.println("CD Player Kapand�");
    }
}
