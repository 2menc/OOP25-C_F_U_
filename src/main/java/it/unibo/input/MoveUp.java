package it.unibo.input;

import it.unibo.api.Position;
import it.unibo.api.rooms.RoomManager;

/**
 * Command that handles the player's upward movement.
 */ 
public class MoveUp implements Command {

    /**
     * Creates a MoveUp command.
     */
    public MoveUp() {
        // default constructor
    }

    @Override
    public void execute(RoomManager model) {
        
        Position currentPosition = model.getCurrentPosition();
        Position nextPosition = new Position(currentPosition.x(), currentPosition.y()-1);
        Boolean colliding = model.isPlayerColliding(nextPosition);
        if(colliding == true) {
            model.isEnteringAnEvent(nextPosition);
        } else {
            model.computeMove(!colliding, nextPosition);
        }
    }

}
