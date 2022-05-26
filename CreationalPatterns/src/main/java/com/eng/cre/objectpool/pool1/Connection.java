package com.eng.cre.objectpool.pool1;

/**
 * Created by enginoz on 3/30/16.
 */
public class Connection {

    private String connectionString;
    private PoolManager poolManager;
    private ConnectionContext context;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public Connection(String connectionString) {
        this.connectionString = connectionString;
    }

    public void open(){
        poolManager = PoolManager.createPool();
        context = poolManager.takeConnection(this.connectionString);
        if (context != null){
            context.open();
        }else {
            System.out.println("Havuzda hiç nesne yok");
        }
    }

    public void close(){
        poolManager.releaseConnectionContex(context);
        context.close();
    }

    public void  execute(String query){
        context.execute(query);
    }
}
