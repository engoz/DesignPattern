package com.eng.oop.dao;


import com.eng.oop.dao.app.DAOHelper;
import com.eng.oop.dao.model.Musteri;

/**
 * Created by enginoz on 27.03.2018.
 */
public class Test {

    public static void main(String[] args) {
        Musteri musteri = new Musteri();
        musteri.setName("Engin");
        musteri.setSurname("Oz");
        musteri.setAddres("Beykoz");
        DAOHelper.getDAO().insert(musteri);
    }
}
