package com.eng.cre.factory.ex1;


/**
 * Factory tasarim sablonunu test etmek
 * kullandigimiz sinif.
 * 
 * @author Oezcan Acar
 *
 */
public class Test 
{	
	public static void main(String[] args) 
	{
		/*
		 * Bmw marka arabalarin �retildigi bir
		 * fabrika olusturuyoruz.
		 */
		ArabaFabrika bmw = new Bmw();
		
		/*
		 * Audi marka arabalarin �retildigi bir
		 * fabrika olusturuyoruz.
		 */
		ArabaFabrika audi = new Audi();
		
        /*
         * �retilen Bmw marka arabalari ekranda
         * g�r�nt�l�yoruz.
         */
		for (Araba araba : bmw.getArabaListesi()) 
        {
            System.out.println(
                    araba.getMarka() + " " + 
                    araba.getModel() + ", " +
                    araba.getBeygirgucu());
        }
 
        /*
         * �retilen Audi marka arabalari ekranda
         * g�r�nt�l�yoruz.
         */
		for (Araba araba : audi.getArabaListesi()) 
        {
            System.out.println(
                    araba.getMarka() + " " + 
                    araba.getModel() + ", " +
                    araba.getBeygirgucu());
        }
	}
}
