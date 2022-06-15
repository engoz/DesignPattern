package com.eng.oop.dao.app;

/**
 * Created by enginoz on 27.03.2018.
 */
public class DAOHelper2 {
    public static DAO getDAO()
    {
        try
        {
            return new JdbcDAO();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
