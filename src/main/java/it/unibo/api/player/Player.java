package it.unibo.api.player;

import it.unibo.api.Position;

/**
 * player
 */
public interface Player {
    /**
     * gets the current position of the player
     * @return the position
     */
    Position getPosition();

    /**
     * update the current position of the player to the next position
     * @param nextPosition
     */
    void move(Position nextPosition);

    /**
     * update the score that the player holds
     */
    void addPoints();

    /**
     * @return the current points of the player
     */
    int getPoints();
}
