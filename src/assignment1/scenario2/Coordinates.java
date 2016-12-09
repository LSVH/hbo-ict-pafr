package assignment1.scenario2;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 16:34
 */

public class Coordinates {
    private double canvas;
    private double horizontal;
    private double vertical;
    private double width;
    private double height;

    public Coordinates(double canvas, double horizontal, double vertical, double width, double height) {
        this.canvas = canvas;
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.width = width;
        this.height = height;
    }

    public double getCanvas() {
        return canvas;
    }

    public double getHorizontal() {
        return horizontal;
    }

    public double getVertical() {
        return vertical;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}