package com.eng.oop.princible.ex1.model;

import com.eng.oop.princible.ex2.haraket.Ucmak;

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

    //OCP ve DIP problemleri Devam ediyor!
    @Override
    public void hareketEt() {
        if (uc){
            new Ucmak().haraketEt();
        }else {
            super.hareketEt();
        }

    }
}
