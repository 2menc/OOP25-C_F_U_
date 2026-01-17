package it.unibo.impl;

import it.unibo.api.Position;
import it.unibo.api.player.Player;
import it.unibo.api.rooms.Room;
import it.unibo.api.rooms.RoomCellsValues;
import it.unibo.api.rooms.RoomManager;

/**
 * implementation of {@link RoomManager} 
 */
public class RoomManagerImpl implements RoomManager{

    private final Player player;
    private Room currentRoom;

    /**
     * basic constructor
     */
    public RoomManagerImpl(final Player player) {
        this.player=player;
    }

    @Override
    public void enterNextRoom(Room nextRoom) {
        this.currentRoom = nextRoom;
    }

    @Override
    public Room getCurrentRoom() {
        return this.currentRoom;
    }

    @Override
    public boolean isPlayerColliding(final Position nexPosition) {
        if(currentRoom.getCellContent(nexPosition) == RoomCellsValues.FREE){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void computeMove(boolean canMove, final Position nexPosition) {
        if(canMove){
            this.player.move(nexPosition);
        }
    }

    @Override
    public boolean isEnteringAnEvent(final Position nexPosition) {
        if(this.currentRoom.getCellContent(nexPosition) == RoomCellsValues.ENIGMA){
            enterEnigma();
            return true;
        }else if(this.currentRoom.getCellContent(nexPosition) == RoomCellsValues.DOOR){
            enterDoor();
            return true;
        }else{
            return false;
        }
    }

    private void enterDoor(){
        //TODO
    }

    private void enterEnigma(){ 
        //TODO
    }
}

