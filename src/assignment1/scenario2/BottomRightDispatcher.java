package assignment1.scenario2;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 13:28
 */

public class BottomRightDispatcher implements Dispatcher {
    private Coordinates coordinates;

    public BottomRightDispatcher(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public Coordinates display() {
        System.out.println("# Displaying coordinatess based on bottom right coordinates.");
        System.out.println("\t Top: "+calculateTop());
        System.out.println("\t Left: "+calculateLeft());
        System.out.println("\t Bottom: "+calculateBottom());
        System.out.println("\t Right: "+calculateRight());
        return new Coordinates(coordinates.getCanvas(), calculateLeft(), calculateTop(), coordinates.getWidth(), coordinates.getHeight());
    }

    @Override
    public double calculateTop() {
        return calculateBottom()-coordinates.getHeight();
    }

    @Override
    public double calculateLeft() {
        return calculateRight()-coordinates.getWidth();
    }

    @Override
    public double calculateBottom() {
        return coordinates.getCanvas()-coordinates.getVertical();
    }

    @Override
    public double calculateRight() {
        return coordinates.getCanvas()-coordinates.getHorizontal();
    }
}