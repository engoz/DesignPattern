package com.eng.cre.factory.ex1;

/**
 * Created by enginoz on 4/2/16.
 */
public abstract class Araba {

    private String marka;
    private String model;
    private int beygirgucu;

    public Araba(String marka, String model, int beygirgucu) {
        this.marka = marka;
        this.model = model;
        this.beygirgucu = beygirgucu;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBeygirgucu() {
        return beygirgucu;
    }

    public void setBeygirgucu(int beygirgucu) {
        this.beygirgucu = beygirgucu;
    }
}
