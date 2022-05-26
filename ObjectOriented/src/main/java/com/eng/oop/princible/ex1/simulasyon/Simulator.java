package com.eng.oop.princible.ex1.simulasyon;


import com.eng.oop.princible.ex1.ortam.Hava;
import com.eng.oop.princible.ex1.interfaces.Ortam;
import com.eng.oop.princible.ex1.model.Canli;
import com.eng.oop.princible.ex1.model.UcanBalik;

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

            //OCP, DIP prensiblerini ihlal ediyor
           if (ortam instanceof Hava && c instanceof UcanBalik){
               ((UcanBalik)c).setUc(true);
           }
            c.hareketEt();
        }
    }

}
