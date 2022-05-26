package com.eng.oop.princible.ex1.good;

/**
 * Created by servicium on 26.10.2016.
 */
public class RemoteControl {
    private RemoteControlInterface remoteControl;

    public RemoteControl(RemoteControlInterface _remoteControl){
        this.remoteControl = _remoteControl;
    }

    public void on(){
        remoteControl.on();
    }

    public void off(){
        remoteControl.off();
    }
}
