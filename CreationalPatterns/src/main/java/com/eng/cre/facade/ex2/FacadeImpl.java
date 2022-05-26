package com.eng.cre.facade.ex2;

/**
 * Created by enginoz on 10/14/15.
 */
public class FacadeImpl implements ComponentFacade {
    public void doingSomething() {
        new BirSinif().doingSomething();
    }
}
