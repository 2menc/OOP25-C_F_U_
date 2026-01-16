package it.unibo.impl;


import java.util.HashMap;
import java.util.Map;

import it.unibo.api.key.Key;

public class Inventory {
    private final Map<Integer, Key> keys;

    public Inventory(){
        this.keys=new HashMap<>();
    }

    /**
     * @return the map of the keys
     * unmodifiableMap!!!!!!!!!!!!!!!!!!
     */
    public Map<Integer, Key> getKeys(){
        return this.keys;
    }

    /**
     * @param k the key taht the player found
     */
    public void addKey(Key k){
        if(k!=null){
            this.keys.put(k.getId(), k);
            System.out.println("You collected: "+k.getName());
        }
    }

    /**
     * @param keyId
     * @return true if the key is in the inventory false if it is not
     */
    public boolean hasTheKey(Integer keyId){
        return this.keys.containsKey(keyId);
    }
}
