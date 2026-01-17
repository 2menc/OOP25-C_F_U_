package it.unibo.impl;

import java.util.Optional;

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
    public boolean isPlayerColliding(Position nexPosition) {
        if(!Optional.ofNullable(player).isEmpty() || !Optional.ofNullable(currentRoom).isEmpty()){
           if(currentRoom.getCellContent(nexPosition) == RoomCellsValues.FREE){
                return true;
           }else{
                return false;
           }
        }
        throw new IllegalStateException("no player/room");
    }

    @Override
    public void computeMove(boolean canMove, Position nexPosition) {
        if(canMove){
            this.player.move(nexPosition);
        }else{
            this.player.move(this.player.getPosition());
        }
    }

    @Override
    public boolean isEnteringAnEvent(Position nexPosition) {
        if(!Optional.ofNullable(player).isEmpty() || !Optional.ofNullable(currentRoom).isEmpty()){
            if(this.currentRoom.getCellContent(nexPosition) == RoomCellsValues.ENIGMA || this.currentRoom.getCellContent(nexPosition) == RoomCellsValues.DOOR){
                 return true;
            }else{
                 return false;
            }
         }
         throw new IllegalStateException("no player/room");
    }
}

