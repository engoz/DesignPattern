package com.eng.cre.facade.ex2;

/**
 * Created by enginoz on 10/14/15.
 * KomponentFacade oluşturmak için
 * kullanılan singleton
 * Factory sınıfı
 */
public class FacadeFactory {

    private static FacadeFactory instance = new FacadeFactory();

    private FacadeFactory(){}

    public static  FacadeFactory instance(){
        return instance;
    }

    public ComponentFacade getFacade(){
        return new FacadeImpl();
    }

}
