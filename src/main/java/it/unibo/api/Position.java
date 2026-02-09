package it.unibo.api;

/**
 * simple class that models a 2-dimensional point
 * @param x x
 * @param y y
 */
public class Position  implements java.io.Serializable {

    private double x;
    private double y;

    
    /**
     * constructor
     * @param x the x
     * @param y the y
     */
    public Position(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * sums this position with the {@link Vector2d} specified
     * @param v the vector to sum with
     * @return the new Position2d
     */
    public Position sum(final Vector2D v) {
        return new Position(x + v.getX(), y + v.getY());
    }

    /**
     * subtracts this position with the {@link Vector2d} specified
     * @param v the vector to subtract
     * @return the new Position2d
     */
    public Position sub(final Vector2D v) {
        return new Position(x - v.getX(), y - v.getY());
    }

    /**
     * gets the x param
     * @return {@code x}
     */
    public double getX() {
        return this.x;
    }

     /**
     * gets the y param
     * @return {@code y}
     */
    public double getY() {
        return this.y;
    }

    @Override 
    public String toString() {
        return ("[" + x + ", " + y + "]");
    }

}
