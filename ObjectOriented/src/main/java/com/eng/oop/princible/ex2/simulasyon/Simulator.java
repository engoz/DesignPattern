package com.eng.oop.princible.ex2.simulasyon;

import com.eng.oop.princible.ex2.interfaces.Ortam;
import com.eng.oop.princible.ex2.abstracts.Canli;

/**
 * Created by servicium on 12.06.2015.
 */
public class Simulator {

    private Ortam ortam;

    public Ortam getOrtam() {
        return ortam;
    }

    public void setOrtam(Ortam ortam) {
        this.ortam = ortam;
    }

    public void haraketEttir(Canli... canlilar){
        for (Canli c:canlilar){
            c.hareketEt(getOrtam());
        }
    }

}
