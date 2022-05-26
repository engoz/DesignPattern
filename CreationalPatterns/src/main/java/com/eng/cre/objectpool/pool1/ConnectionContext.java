package com.eng.cre.objectpool.pool1;

/**
 * Created by enginoz on 3/30/16.
 */
public class ConnectionContext {

    private boolean isActive;

    public ConnectionContext() {
        this(false);
    }

    public ConnectionContext(boolean isActive) {
        this.isActive = isActive;
        System.out.println("Connection yaratildi.");
    }


    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void open(){
        System.out.println("Connection Acildi");
    }

    public void close(){
        System.out.println("Connection kapandı");
    }

    public void execute(String query){
        System.out.println(query + " Query Calisti ");
    }
}
