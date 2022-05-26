package com.eng.oop.princible.ex1.bad;

/**
 * Created by servicium on 26.10.2016.
 */
public  class RemoteControl {
    //bidirectional
    //esnek olmayana bag
    private  TV tv = new TV();


    public void tvOn(){
       tv.on();
    }

    public void tvOff(){
        tv.off();
    }

}
