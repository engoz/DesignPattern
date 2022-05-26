package com.eng.cre.facade.ex1;

/**
 * KomponentFacade olusturmak
 * icin kullanilan singleton
 * factory sinifi.
 */
public class FacadeFactory {

    /*
    * Singleton tasarim sablonunu
    * kullanmak icin bu siniftan bir
    * degisken tanimliyoruz.
    */
    private static FacadeFactory instance = new FacadeFactory();

    /**
     * Singleton olabilmesi icin
     * sinif konstrukt�r�n�n
     * private olmasi gerekiyor. Bu
     * durumda baska bir sinif new FacadeFactory()
     * seklinde nesne olusturamaz. Amacimizda
     * bunu engellemek ve bu siniftan sadece bir
     * nesnenin sistemde bulunmasini saglamak
     * (singleton tasarim sablonuna bakiniz)
     */
    private FacadeFactory(){}

    /**
     * Sistemde bulunan tek FacadeFactory
     * nesnesine ulasmak icin instance()
     * metodu kullanilir.
     *
     * @return FacadeFactory singleton nesne
     */
    public static FacadeFactory instance(){
        return instance;
    }

    /**
     * Kullanici sinif tarafindan kullanilmak
     * �zere olusturulan KomponentFacade
     * implementasyonu.
     *
     * @return FacadeImpl facade implementasyon sinifi
     */
    public Facade getFacade(){
        return new FacadeImpl();
    }

}
