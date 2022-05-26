package com.eng.oop.princible.ex3.app;


import com.eng.oop.princible.ex3.model.UcanBalik;
import com.eng.oop.princible.ex3.ortam.Deniz;
import com.eng.oop.princible.ex3.ortam.Hava;
import com.eng.oop.princible.ex3.simulasyon.Simulator;

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
