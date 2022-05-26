package com.eng.oop.princible.ex2.app;


import com.eng.oop.princible.ex2.model.UcanBalik;
import com.eng.oop.princible.ex2.ortam.Deniz;
import com.eng.oop.princible.ex2.ortam.Hava;
import com.eng.oop.princible.ex2.simulasyon.Simulator;

/**
 * Created by servicium on 12.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.setOrtam(new Deniz());
        simulator.haraketEttir(new UcanBalik());

        simulator.setOrtam(new Hava());
        simulator.haraketEttir(new UcanBalik());
    }
}
