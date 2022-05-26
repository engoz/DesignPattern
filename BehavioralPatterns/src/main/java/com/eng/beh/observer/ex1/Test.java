package com.eng.beh.observer.ex1;

/**
 * Created by servicium on 17.09.2015.
 */
public class Test {

    public static void main(String[] args)
    {
        Gazete hurriyet = new Hurriyet();
        Gazete milliyet = new Milliyet();

        Abone musteri1 = new Musteri("Tarik", "Akan");
        musteri1.aboneOl(hurriyet);
        musteri1.aboneOl(milliyet);

        Abone musteri2 = new Musteri("Filiz", "Akin");
        musteri2.aboneOl(hurriyet);

        hurriyet.gazeteGonder();
        milliyet.gazeteGonder();

        musteri2.aboneligiIptalEt();

        hurriyet.gazeteGonder();
    }
}
