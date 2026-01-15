package it.unibo.impl;

import it.unibo.api.Position;
import it.unibo.api.rooms.Room;
import it.unibo.api.rooms.RoomManager;

/**
 * implementation of {@link RoomManager} 
 */
public class RoomManagerImpl implements RoomManager{

    //private final Player player;
    private Room currentRoom;

    /**
     * basic constructor
     */
    public RoomManagerImpl() {}

    @Override
    public void enterNextRoom(Room nextRoom) {
        this.currentRoom = nextRoom;
    }

    @Override
    public Room getCurrentRoom() {
        return this.currentRoom;
    }

    @Override
    public boolean isPlayerColliding() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPlayerColliding'");
    }

    @Override
    public Position computeMove(boolean canMove) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeMove'");
    }

    @Override
    public boolean isEnteringAnEvent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEnteringAnEvent'");
    }

}
