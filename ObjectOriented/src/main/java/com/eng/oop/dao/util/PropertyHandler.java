package com.eng.oop.dao.util;

import java.util.ResourceBundle;

/**
 * Created by enginoz on 27.03.2018.
 */
public class PropertyHandler {
    public static String getProperty(String key){
        return ResourceBundle.getBundle("dao").getString(key);
    }
}
