package com.eng.cre.objectpool.pool1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by enginoz on 3/30/16.
 */
public class PoolManager {
    private final int POOL_SIZE = 10;
    protected static PoolManager pm;
    private HashMap<String, ArrayList<ConnectionContext>> pools;

    protected PoolManager(){
        pools = new HashMap<String, ArrayList<ConnectionContext>>(POOL_SIZE);
    }

    public static PoolManager createPool(){

        //PoolManager singleton
        if(pm == null){
            pm = new PoolManager();
        }
        return pm;
    }

    public ConnectionContext takeConnection(String key){
        if (pools.containsKey(key)){
            ArrayList<ConnectionContext> objects = pools.get(key);
            for (ConnectionContext cu : objects){
                if (cu.isActive()){
                    return  cu;
                }
            }
        }else {
            ArrayList<ConnectionContext> newConnectionPools = new ArrayList<ConnectionContext>(POOL_SIZE);
            for (int i= 0; i <=POOL_SIZE -1; i++ ){
             newConnectionPools.add(new ConnectionContext());
            }
            pools.put(key,newConnectionPools);
            ConnectionContext cu = newConnectionPools.get(0);
            cu.setIsActive(true);
            return cu;
        }
        return null;
    }
    public void releaseConnectionContex(ConnectionContext connectionContext){
        connectionContext.setIsActive(false);
    }
}
