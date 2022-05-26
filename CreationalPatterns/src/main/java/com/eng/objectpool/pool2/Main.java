package com.eng.objectpool.pool2;

import java.sql.Connection;

/**
 * Created by servicium on 30.03.2016.
 */
public class Main {
    public static void main(String args[]) {
        // Do something...

        // Create the ConnectionPool:
        JDBCConnectionPools pool = new JDBCConnectionPools(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // Get a connection:
        Connection con = pool.checkOut();

        // Use the connection

        // Return the connection:
        pool.checkIn(con);

    }
}
