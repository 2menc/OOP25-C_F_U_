package it.unibo.api.inventory;

import java.util.List;
import java.util.Optional;

import it.unibo.api.key.Key;

/**
* Inventory system
*/
public interface Inventory {
    
    /**
     * gets the list of the keys
     * @return the keys
     */
    List<Key> getKeys();

    /**
     * add an obj Key to the list
     * @param opt optional param key
     */
    void addKey(Optional<Key> opt);

    /**
     * search in the list of the keys if there is a specific key
     * @param keyId the id of the key you are looking for
     * @return true if the key is in the inventory false if it is not
     */
    public boolean hasTheKey(String keyId);
} 
