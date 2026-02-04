package it.unibo.impl;

import it.unibo.api.doors.Door;
import it.unibo.api.rooms.Room;

/**
 * implementation of {@link Door}
 * implements {@link java.io.Serializable}
 */
public class DoorImpl implements Door, java.io.Serializable {

     /**
     * The id of the door
     */
    private String id;

     /**
     * The destination room
     */
    private Room dstRoom;

     /**
     * indicates if the door is open
     */
    private boolean open;

    /** 0-args constructor */
    public DoorImpl() {}

    /**
     * constructor
     * @param id this door's id
     * @param dstRoom the destination {@link Room}
     */
    public DoorImpl(final String id, final Room dstRoom) {
        this.dstRoom = dstRoom;
        this.open = false;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isOpen() {
        return this.open;
    }

    @Override
    public Room getDstRoom() {
        return this.dstRoom;
    }

    @Override
    public void setOpen(boolean b) {
        this.open = true;
    }    

    /**
     * sets this door's id
     * @param id the id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * sets the destination room
     * @param room the dst room
     */
    public void setDstRoom(final Room room) {
        this.dstRoom = room;
    }

}
