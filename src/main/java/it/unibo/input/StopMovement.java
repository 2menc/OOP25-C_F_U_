package it.unibo.input;

import java.util.Optional;

import it.unibo.api.enigmas.Enigma;
import it.unibo.api.rooms.RoomManager;

/**
 * Command that intentionally does nothing and stops the player
 */
public class StopMovement implements Command {

    /**
     * Creates a StopMovement command.
     */
    public StopMovement() {
        // default constructor
    }

    @Override
    public Optional<Enigma> execute(RoomManager model) {
        // Intentionally does nothing: player is stopped
        return Optional.empty();
    }

}
