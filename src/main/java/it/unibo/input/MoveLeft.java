package it.unibo.input;

import java.util.Optional;

import it.unibo.api.Position;
import it.unibo.api.enigmas.Enigma;
import it.unibo.api.rooms.RoomManager;

/**
 * Command that handles the player's leftward movement.
 */
public class MoveLeft implements Command {

    /**
     * Creates a MoveLeft command.
     */
    public MoveLeft() {
        // default constructor
    }

    @Override
    public Optional<Enigma> execute(RoomManager model) {
        
        Position currentPosition = model.getCurrentPosition();
        Position nextPosition = new Position(currentPosition.x()-1, currentPosition.y());
        Boolean colliding = model.isPlayerColliding(nextPosition);
        if(colliding == true) {
            boolean event = model.isEnteringAnEvent(nextPosition);
            if(event == true) {
                model.enterDoor(nextPosition);
                return model.enterEnigma(nextPosition);
            }
        } else {
            model.computeMove(!colliding, nextPosition);
        }
        return Optional.empty();
    }

}
