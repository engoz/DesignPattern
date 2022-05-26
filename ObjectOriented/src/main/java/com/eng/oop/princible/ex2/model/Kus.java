package com.eng.oop.princible.ex2.model;

import com.eng.oop.princible.ex2.abstracts.UcanCanli;
import com.eng.oop.princible.ex2.interfaces.Ortam;

/**
 * Created by servicium on 12.06.2015.
 */
public class Kus extends UcanCanli {
    @Override
    public void hareketEt(Ortam ortam) {
        ortam.getHareketSekli().haraket();
    }
}
