package com.eng.oop.princible.ex2.model;

import com.eng.oop.princible.ex2.interfaces.Ortam;

/**
 * Created by servicium on 12.06.2015.
 */
public class UcanBalik extends Balik {
    private boolean uc = false;
    public boolean isUc(){
        return uc;
    }

    public void setUc(boolean uc){
        this.uc = uc;
    }

    @Override
    public void hareketEt(Ortam ortam) {
        ortam.getHareketSekli().haraket();
    }
}
