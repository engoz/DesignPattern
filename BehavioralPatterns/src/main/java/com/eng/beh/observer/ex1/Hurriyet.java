package com.eng.beh.observer.ex1;


import java.util.ArrayList;

/**
 * ObserveredIMPL
 */
public class Hurriyet implements Gazete {

    private ArrayList<Abone> aboneler =  new ArrayList<Abone>();


    public void aboneEkle(Abone abone) {
        getAboneler().add(abone);
    }

    public void aboneSil(Abone abone) {
        getAboneler().remove(abone);
    }

    public void gazeteGonder() {
        for (int i=0; i<getAboneler().size(); i++){
            getAboneler().get(i).update();
        }
    }

    public ArrayList<Abone> getAboneler() {
        return aboneler;
    }

    public void setAboneler(ArrayList<Abone> aboneler) {
        this.aboneler = aboneler;
    }
}
