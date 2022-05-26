package com.eng.oop.princible.ex3.ortam;


import com.eng.oop.princible.ex3.haraket.Yuzmek;
import com.eng.oop.princible.ex3.interfaces.HaraketSekli;
import com.eng.oop.princible.ex3.interfaces.Ortam;

/**
 * Created by servicium on 12.06.2015.
 */
public class Deniz implements Ortam {
    public HaraketSekli getHareketSekli() {
        return new Yuzmek();
    }
}
