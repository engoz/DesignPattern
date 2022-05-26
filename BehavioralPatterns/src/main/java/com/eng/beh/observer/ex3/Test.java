package com.eng.beh.observer.ex3;

import java.util.LinkedList;

/**
 * Created by servicium on 07.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        NotifyingCollection c = new NotifyingCollection(new LinkedList());
        c.addSubscriber(new SubscriberAdapter(){
            public void added(Object item){
                System.out.println("Adeed Item "+ item);
            }
        });

    }
}
