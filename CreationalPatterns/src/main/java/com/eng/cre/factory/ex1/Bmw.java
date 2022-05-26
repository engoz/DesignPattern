package com.eng.cre.factory.ex1;

/**
 * Bmw marka arabalari �retir.
 * ArabaFabrika sinifinin altsinifi
 * oldugu icin createAuto
 * metodunu implemente eder.
 * 
 * @author Oezcan Acar
 *
 */
public class Bmw extends ArabaFabrika
{
	/**
	 * ArabaFabrika sinifinda yeralan
	 * createAuto() motodu Bmw altsinifinda
	 * implemente edilir. Bmw markasina ait
	 * Z4 model arabanin �retiminde kullanilir.
	 */
	public void createAuto() 
	{
		getArabaListesi().add(new Z4(170));
	}
}
