package it.unibo.api.rooms;

import it.unibo.api.Position;

/**
 * a simple manager for player movement in the rooms
 */
public interface RoomManager {

    /**
     * unloads the current room and loads the next
     * @param nextRoom the room to load
     */
    void enterNextRoom(Room nextRoom);

    /**
     * gets the current room
     * @return the current room
     */
    Room getCurrentRoom();

   
    /**
     * checks if the cell in wich the player wants to move is free or has an {@link RoomCellsValues} parameter
     * @param nextPosition the position the player wants to go to
     * @return {@code true} if the cell is {@link RoomCellsValues}.free
     */
    boolean isPlayerColliding(final Position nextPosition);

    
    /**
     * performs the move
     * @param nexPosition the position the player want to go to
     * @param canMove false if the player is blocked
     * @return the new position
     */
    void computeMove(boolean canMove, final Position nexPosition);

    /**
     * checks if the player is about to enter an event (door, enigm)
     * @return {@code true} if the player is entering an event, {@code false} otherwise
     */
    boolean isEnteringAnEvent(Position nexPosition);

    /**
     * gets the current player position
     * @return the current position
     */
    Position getCurrentPosition();

}
