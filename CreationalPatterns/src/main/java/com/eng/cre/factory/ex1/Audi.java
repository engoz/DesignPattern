package com.eng.cre.factory.ex1;

/**
 * Audi marka arabalari �retir.
 * ArabaFabrika sinifinin altsinifi
 * oldugu icin createAuto
 * metodunu implemente eder.
 * 
 * @author Oezcan Acar
 *
 */
public class Audi extends ArabaFabrika 
{
	/**
	 * ArabaFabrika sinifinda yeralan
	 * createAuto() motodu Audi altsinifinda
	 * implemente edilir. Audi markasina ait
	 * A4 ve R8 modellerinin �retiminde kullanilir.
	 */
	public void createAuto() 
	{
		getArabaListesi().add(new A4(120));
		getArabaListesi().add(new R8(350));
	}
}





























