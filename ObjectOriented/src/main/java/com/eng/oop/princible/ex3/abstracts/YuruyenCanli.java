package com.eng.oop.princible.ex3.abstracts;

import com.eng.oop.princible.ex3.haraket.Yurumek;


/**
 * Created by servicium on 12.06.2015.
 */
public abstract class YuruyenCanli extends Canli {
    public YuruyenCanli(){
        setHaraketSekli(new Yurumek());
    }
}
