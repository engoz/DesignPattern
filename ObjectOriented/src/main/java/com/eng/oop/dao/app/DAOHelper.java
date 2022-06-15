package com.eng.oop.dao.app;

import com.eng.util.PropertyHandler;

/**
 * Created by enginoz on 27.03.2018.
 */
public class DAOHelper {


    public static DAO getDAO()
    {
        try
        {
            /**
             * dao.properties icinde yeralan
             * dao.impl anahtarinin degerini
             * okuyarak, DAO interface
             * sinifini implemente etmis bir nesne
             * olusturur.
             */
            return ((DAO)Class.forName(PropertyHandler.
                    getProperty("dao.impl")).newInstance());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
