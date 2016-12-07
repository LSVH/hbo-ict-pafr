package assignment1.scenario2;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 13:14
 */

public class Rectangle implements Shape {
    private int horizontal;
    private int vertical;
    private int width;
    private int height;

    public Rectangle(int horizontal, int vertical, int width, int height) {
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getHorizontal() {
        return horizontal;
    }

    @Override
    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    @Override
    public int getVertical() {
        return vertical;
    }

    @Override
    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }
}