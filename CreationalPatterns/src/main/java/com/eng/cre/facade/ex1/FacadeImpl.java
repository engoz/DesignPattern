package com.eng.cre.facade.ex1;

/**
 * Created by servicium on 25.01.2016.
 */
public class FacadeImpl implements Facade {
    public void doSomething() {
        new BirSinif().doit();
    }
}
