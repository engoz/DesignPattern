package com.eng.oop.princible.ex2.abstracts;

import com.eng.oop.princible.ex2.haraket.Yuzmek;

/**
 * Created by servicium on 12.06.2015.
 */
public abstract class YuzenCanli extends Canli {
    public YuzenCanli(){
        setHaraketSekli(new Yuzmek());
    }

}
