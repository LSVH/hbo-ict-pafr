package assignment1.scenario2;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 13:28
 */

public class TopLeftDispatcher implements Dispatcher {
    private Coordinates coordinates;

    public TopLeftDispatcher(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public Coordinates display() {
        System.out.println("# Displaying coordinatess based on top left coordinates.");
        System.out.println("\t Top: "+calculateTop());
        System.out.println("\t Left: "+calculateLeft());
        System.out.println("\t Bottom: "+calculateBottom());
        System.out.println("\t Right: "+calculateRight());
        return new Coordinates(coordinates.getCanvas(), calculateLeft(), calculateTop(), coordinates.getWidth(), coordinates.getHeight());
    }

    @Override
    public double calculateTop() {
        return coordinates.getVertical();
    }

    @Override
    public double calculateLeft() {
        return coordinates.getHorizontal();
    }

    @Override
    public double calculateBottom() {
        return calculateTop() + coordinates.getHeight();
    }

    @Override
    public double calculateRight() {
        return calculateLeft() + coordinates.getWidth();
    }
}