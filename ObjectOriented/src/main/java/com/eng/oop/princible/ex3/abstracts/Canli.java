package com.eng.oop.princible.ex3.abstracts;

import com.eng.oop.princible.ex3.interfaces.HaraketSekli;
import com.eng.oop.princible.ex3.interfaces.Ortam;

/**
 * Created by servicium on 12.06.2015.
 */
public abstract class Canli {
    private int bacakSayisi;
    //Davranis Encapsule Edildi
    private HaraketSekli haraketSekli;


    public abstract void hareketEt(Ortam ortam);

    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
    }

    public void setHaraketSekli(HaraketSekli haraketSekli) {
        this.haraketSekli = haraketSekli;
    }

    public HaraketSekli getHaraketSekli() {
        return haraketSekli;
    }
}
