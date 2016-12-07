package assignment1.scenario2;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 13:15
 */

public class Triangle implements Shape {
    private int horizontal;
    private int vertical;
    private int width;
    private int height;

    public Triangle(int horizontal, int vertical, int width, int height) {
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.width = width;
        this.height = height;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}