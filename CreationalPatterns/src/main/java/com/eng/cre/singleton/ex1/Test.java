package com.eng.cre.singleton.ex1;

/**
 * Created by enginoz on 28.12.2017.
 */
public class Test {
    public static void main(final String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton.instance().printThis();
        }
    }
}
