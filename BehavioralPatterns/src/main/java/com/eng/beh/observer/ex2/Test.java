package com.eng.beh.observer.ex2;

/**
 * Created by servicium on 27.09.2015.
 */
public class Test {

    public static  void Display(Kontrol k){
        System.out.println(k.getM_Name() + ":" + k.getM_Text() );
    }

    public static void main(String[] args) {
        Kontrol k1 = new Label();
        k1.setM_Name("txt1");

        Kontrol k2 = new Label();
        k2.setM_Name("txt2");

        Stok sb = new Stok();
        sb.Register(k1);
        sb.Register(k2);

        sb.Notify();
        Display(k1);
        Display(k2);

        sb.elemanCek();

        sb.Notify();
        Display(k1);
        Display(k2);

        sb.elemanCek();

        sb.Notify();
        Display(k1);
        Display(k2);
    }
}
