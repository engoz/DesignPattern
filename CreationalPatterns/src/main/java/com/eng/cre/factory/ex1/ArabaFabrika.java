package com.eng.cre.factory.ex1;

import java.util.ArrayList;

/**
 * Genel bir araba fabrikasini tanimlar. Abstract
 * oldugu icin bu siniftan nesneler üretilemez.
 * Belirli bir araba marka ve modelini üretebilmek
 * icin bu sinifin altsinifi olusturulmasi
 * gerekmektedir
 *
 * @see Bmw
 * @see Audi
 *
 * @author enginoz
 *
 */
public abstract class ArabaFabrika {

    /*
	 * Bir araba fabrikasinin ürettigi
	 * degisik modeldeki arabalarin icinde
	 * yeraldigi liste.
	 */
    private ArrayList<Araba> arabaListesi = new ArrayList<Araba>();

    /**
     * Altsiniflarda bir fabrikanin (nesnenin) olusturulmasi
     * ile beraber, createAuto() metodu isleme girer, yani
     * fabrika araba üretimine baslamis olur.
     */
    public ArabaFabrika()
    {
        this.createAuto();
    }

    /**
     * Alt siniflar tarafindan implemente edilir.
     * Belirli bir marka ve modelin olusturulmasinda
     * kullanilir.
     */
    public abstract void createAuto();

    public ArrayList<Araba> getArabaListesi()
    {
        return arabaListesi;
    }

    public void setArabaListesi(ArrayList<Araba> arabaListesi)
    {
        this.arabaListesi = arabaListesi;
    }

}
