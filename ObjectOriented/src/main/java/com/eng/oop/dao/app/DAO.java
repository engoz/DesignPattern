package com.eng.oop.dao.app;

import com.eng.model.Musteri;

import java.sql.Connection;

/**
 * Created by enginoz on 27.03.2018.
 */
public interface DAO {
    void insert(Musteri musteri);
    void delete(Musteri musteri);
    void update(Musteri musteri);
    Connection getConnection();


}
