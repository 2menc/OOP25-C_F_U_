package it.unibo.input;

import java.util.Optional;

import it.unibo.api.enigmas.Enigma;
import it.unibo.api.rooms.RoomManager;

/**
 * a basic command
 */
public interface Command {
    
    /**
     * executes the command using the given model
     * @param model the {@link RoomManager} responsible for managing
     *              the room state and the player's position
     * @return an Optional containing an Enigma
     */
    Optional<Enigma> execute(RoomManager model);

}
