package com.eng.oop.princible.ex3.model;

import com.eng.oop.princible.ex3.abstracts.YuruyenCanli;
import com.eng.oop.princible.ex3.interfaces.Ortam;

/**
 * Created by servicium on 12.06.2015.
 */
public class Kedi extends YuruyenCanli {
    @Override
    public void hareketEt(Ortam ortam) {
        ortam.getHareketSekli().haraket();
    }
}
