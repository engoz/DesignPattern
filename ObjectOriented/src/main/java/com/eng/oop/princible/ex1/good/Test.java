package com.eng.oop.princible.ex1.good;

/**
 * Created by servicium on 26.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        RemoteControlInterface rmi = new Tv();
        RemoteControl remoteControl = new RemoteControl(rmi);
        remoteControl.on();
        remoteControl.off();

    }
}
