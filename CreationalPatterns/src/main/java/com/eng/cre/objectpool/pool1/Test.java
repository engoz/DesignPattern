package com.eng.cre.objectpool.pool1;

/**
 * Created by enginoz on 4/3/16.
 */
public class Test {
    public static void main(String[] args) {
        Connection con = new Connection("k1");
        con.open();
        con.execute("selecet1");
        con.close();
        System.out.println("-------------------------");
        Connection con2 = new Connection("k2");
        con2.open();
        con2.execute("selecet1");
        con2.close();
        System.out.println("-------------------------");
        Connection con3 = new Connection("k3");
        con3.open();
        con3.execute("selecet1");
        con3.close();
        System.out.println("-------------------------");
    }
}
