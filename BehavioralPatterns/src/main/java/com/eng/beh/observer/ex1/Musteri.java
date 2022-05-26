package com.eng.beh.observer.ex1;

/**
 * OvserverImpl
 */

public class Musteri implements Abone {

    private Gazete gazete;
    private String ad;
    private String soyad;

    public Musteri(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public void update() {
        System.out.println(getAd() + "" +getSoyad() +" " +gazete.getClass().getName()+ " gazete aldi" );
    }

    public void aboneligiIptalEt() {
        getGazete().aboneSil(this);
        System.out.println(getAd() + "" +getSoyad() + " aboneligi iptal etti" );
    }

    public void aboneOl(Gazete gazete) {
        setGazete(gazete);
        gazete.aboneEkle(this);
        System.out.println(getAd() + "" + getSoyad() +" " +gazete.getClass().getName()+" abone oldu");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Gazete getGazete() {
        return gazete;
    }

    public void setGazete(Gazete gazete) {
        this.gazete = gazete;
    }
}
