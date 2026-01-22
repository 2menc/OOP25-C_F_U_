package it.unibo.input;

import it.unibo.api.Position;
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
    public void execute(RoomManager model) {
        
        Position currentPosition = model.getCurrentPosition();
        Position nextPosition = new Position(currentPosition.x()-1, currentPosition.y());
        Boolean colliding = model.isPlayerColliding(nextPosition);
        if(colliding == true) {
            model.isEnteringAnEvent(nextPosition);
        } else {
            model.computeMove(!colliding, nextPosition);
        }
    }

}
