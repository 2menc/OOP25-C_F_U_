package it.unibo.input;

import it.unibo.api.rooms.RoomManager;

/**
 * a basic command
 */
public interface Command {
    
    /**
     * executes the command using the given model
     * @param model the {@link RoomManager} responsible for managing
     *              the room state and the player's position
     */
    void execute(RoomManager model);

}
