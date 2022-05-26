package com.eng.cre.facade.ex2;

/**
 * Created by enginoz on 10/14/15.
 */
public class Client {
    public static void main(String[] args) {
        FacadeFactory.instance().getFacade().doingSomething();
    }
}
