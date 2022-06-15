package com.eng.oop.dao.app;

import com.eng.model.Musteri;

import java.sql.Connection;

/**
 * Created by enginoz on 27.03.2018.
 */
public class JdbcDAO implements DAO {
    public void insert(Musteri musteri) {
        System.out.println("Musteri = " + musteri.getName() + " "  + musteri.getSurname());
        /*
        Connection con = null;
        PreparedStatement pstmt = null;
        try
        {
            con = getConnection();
            pstmt = con.prepareStatement("insert into muesteri " +
                    "(isim,soyad, adres) values(?,?,?)");
            pstmt.setString(1, musteri.getName());
            pstmt.setString(2, musteri.getSurname());
            pstmt.setString(3, musteri.getAddres());
            pstmt.executeUpdate();
        }
        catch (Exception e)
        {
        }
        */
    }

    public void delete(Musteri musteri) {

    }

    public void update(Musteri musteri) {

    }

    public Connection getConnection() {
        return null;
    }
}
