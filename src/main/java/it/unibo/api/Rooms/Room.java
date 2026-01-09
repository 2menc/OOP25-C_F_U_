package it.unibo.api.rooms;

import it.unibo.api.Position;
import it.unibo.api.doors.Door;
import it.unibo.api.enigmas.Enigma;

/**
 * a basic room, divided in cells
 */
public interface Room {

    /**
     * gets the entity in the {@code pos} cell
     * @param pos the position
     * @return the entity in that position of the grid
     */
    RoomCellsValues getCellContent(Position pos);

    /**
     * gets the position of the {@code door} specified
     * @param door the door
     * @return the position of that door
     */
    Position getDoorPosition(Door door);

    /**
     * gets the position of the {@code enigm} specified
     * @param enigm the enigm
     * @return the position of that enigm
     */
    Position getEnigmaPosition(Enigma enigm);
}
