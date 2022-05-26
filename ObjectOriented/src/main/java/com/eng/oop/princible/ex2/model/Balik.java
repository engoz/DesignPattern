package com.eng.oop.princible.ex2.model;

import com.eng.oop.princible.ex2.abstracts.YuzenCanli;
import com.eng.oop.princible.ex2.interfaces.Ortam;

/**
 * Created by servicium on 12.06.2015.
 */
public class Balik extends YuzenCanli {
    public Balik(){
        setBacakSayisi(0);
    }

    @Override
    public void hareketEt(Ortam ortam) {
        ortam.getHareketSekli().haraket();
    }
}
