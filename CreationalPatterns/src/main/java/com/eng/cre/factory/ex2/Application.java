package com.eng.cre.factory.ex2;

/**
 * Created by enginoz on 10.05.2018.
 */
public class Application {
    public static void main(String[] args) {
        /**
         * Bir pdf dökümanı oluşturuyoruz
         */
        Document document = DocumentFactory.createDocument("PDF");
        System.out.println(document.getDocumentType());
        /**
         * Bir word dökümanı oluşturuyoruz
         */
        document = DocumentFactory.createDocument("WORD");
        System.out.println(document.getDocumentType());
    }
}
