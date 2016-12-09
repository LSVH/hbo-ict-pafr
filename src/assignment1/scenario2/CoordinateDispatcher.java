package assignment1.scenario2;

import javafx.scene.shape.Shape;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 13:28
 */

public class CoordinateDispatcher {
    private Coordinates coordinates;
    private boolean style = true;
    private TopLeftDispatcher topLeft;
    private BottomRightDispatcher bottomRight;

    public CoordinateDispatcher(Coordinates coordinates) {
        this.coordinates = coordinates;
        topLeft = new TopLeftDispatcher(coordinates);
        bottomRight = new BottomRightDispatcher(coordinates);
    }

    public Coordinates dispatch() {
        Coordinates out;
        if (style) {
            style = false;
            out = bottomRight.display();
        } else {
            style = true;
            out = topLeft.display();
        }
        return out;
    }
}