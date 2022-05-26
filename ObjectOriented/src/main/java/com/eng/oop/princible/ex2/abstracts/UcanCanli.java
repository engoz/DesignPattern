package com.eng.oop.princible.ex2.abstracts;


import com.eng.oop.princible.ex2.haraket.Ucmak;

/**
 * Created by servicium on 12.06.2015.
 */
public abstract class UcanCanli extends Canli {
   public UcanCanli(){
       setHaraketSekli(new Ucmak());
   }
}
