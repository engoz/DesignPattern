package com.eng.oop.princible.ex1.model;

import com.eng.oop.princible.ex2.interfaces.HaraketSekli;

/**
 * Created by servicium on 12.06.2015.
 */
public abstract class Canli {
    private int bacakSayisi;
    //Davranis Encapsule Edildi
    private HaraketSekli haraketSekli;


    public  void hareketEt(){
        haraketSekli.haraketEt();
    }

    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
    }

    public void setHaraketSekli(HaraketSekli haraketSekli) {
        this.haraketSekli = haraketSekli;
    }
}
