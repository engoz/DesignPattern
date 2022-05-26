package com.eng.cre.factory.ex2;

/**
 * Created by enginoz on 10.05.2018.
 */
public class DocumentFactory {

    public static Document createDocument(String type){
        if (type.equalsIgnoreCase("Pdf")){
            return new Pdf();
        }else if (type.equalsIgnoreCase("Word")){
            return new Word();
        }else {
            throw new RuntimeException("Doküman tipi belli değil");
        }
    }
}
