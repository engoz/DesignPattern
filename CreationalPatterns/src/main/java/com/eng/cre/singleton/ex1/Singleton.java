package com.eng.cre.singleton.ex1;

/**
 * Created by enginoz on 28.12.2017.
 */
public class Singleton {

    /*
    * Singleton sınıfından olusturulabilecek tek nesne static sınıf değişkeni
    * olarak tanımlanıyor.
    */
    private static volatile Singleton instance = null;

    /*
    * Double check locking yapabilmek için kullanılan nesne.
    */
    private static Object lock = new Object();

    /**
     * Başka sınıfların new Singleton() şeklinde nesne oluşturmaları private
     * ile engellenmiş olmakta.
     */
    private Singleton() {
        System.out.println("Singleton init");
    }

    /**
     * Singleton sınıfından oluşturulabilen tek nesneye ulaşmak için instance()
     * metodu kullanilmaktadir..
     */
    public static Singleton instance(){
        if (instance == null){
            // Double checked locking
            synchronized (lock){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * One checked method
     */
    private static Singleton otherInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    /**
     * Singleton sınıfında bulunan bir metot.
     */
    public void printThis() {
        System.out.println(this);
    }

}
