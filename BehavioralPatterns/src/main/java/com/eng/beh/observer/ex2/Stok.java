package com.eng.beh.observer.ex2;

import java.util.ArrayList;

/**
 * Created by servicium on 27.09.2015.
 */
public class Stok implements IObservable {

    private int m_Adet;
    private ArrayList<Kontrol> kontrols;

    public Stok(){
        kontrols = new ArrayList<Kontrol>();
        m_Adet = 10;
    }

    public  void elemanCek(){
        --m_Adet;
    }

    public void Register(Kontrol k) {
        kontrols.add(k);
    }

    public void UnRegister(Kontrol k) {
        kontrols.remove(k);
    }

    public void Notify() {
        for (Kontrol kontrol:kontrols){
            kontrol.onAction(String.valueOf(m_Adet));
        }
    }
}
