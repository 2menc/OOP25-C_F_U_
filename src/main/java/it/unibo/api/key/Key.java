package it.unibo.api.key;

import it.unibo.api.doors.Door;

/**
 * a basic key
 */
public interface Key {

    /**
     * @return the id of the key
     */
    public Integer getId();

    /**
     * @return the name of the key
    */
    public String getName();

    /**
    * @return the door that the key unlock
    */
    public Door getDst();
    
} 