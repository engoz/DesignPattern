package com.eng.oop.princible.ex2.app;


import com.eng.oop.princible.ex2.model.Balik;
import com.eng.oop.princible.ex2.model.Kedi;
import com.eng.oop.princible.ex2.model.Kus;
import com.eng.oop.princible.ex2.simulasyon.Simulator;

/**
 * Created by servicium on 12.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.haraketEttir(new Kedi(),new Kus(), new Balik());
    }
}
