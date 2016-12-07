package assignment1.scenario2;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 13:28
 */

public class BottomRightCoordinates implements Coordinates {
    private Shape shape;

    public BottomRightCoordinates(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void display() {
        System.out.println("# Displaying shapes based on bottom right coordinates.");
        System.out.println("\t Top: "+calculateTop());
        System.out.println("\t Left: "+calculateLeft());
        System.out.println("\t Bottom: "+calculateBottom());
        System.out.println("\t Right: "+calculateRight());
    }

    @Override
    public int calculateTop() {
        return calculateBottom()-shape.getHeight();
    }

    @Override
    public int calculateLeft() {
        return calculateRight()-shape.getWidth();
    }

    @Override
    public int calculateBottom() {
        return shape.getVertical();
    }

    @Override
    public int calculateRight() {
        return shape.getHorizontal();
    }
}