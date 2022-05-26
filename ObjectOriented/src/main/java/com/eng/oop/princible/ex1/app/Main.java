package com.eng.oop.princible.ex1.app;


import com.eng.oop.princible.ex1.model.Balik;
import com.eng.oop.princible.ex1.model.Kedi;
import com.eng.oop.princible.ex1.model.Kus;
import com.eng.oop.princible.ex1.simulasyon.Simulator;

/**
 * Created by servicium on 12.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.haraketEttir(new Kedi(),new Kus(), new Balik());
    }
}
