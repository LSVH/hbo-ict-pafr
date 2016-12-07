package assignment1.scenario2;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 13:28
 */

public class CoordinateDispatcher {
    private TopLeftCoordinates topLeft;
    private BottomRightCoordinates bottomRight;
    private Shape shape;

    public CoordinateDispatcher(Shape shape) {
        this.shape = shape;
        topLeft = new TopLeftCoordinates(shape);
        bottomRight = new BottomRightCoordinates(shape);
    }

    public void dispatch(String style) {
        if (style.equalsIgnoreCase("BR") || style.equalsIgnoreCase("bottomRight")) {
            topLeft.display();
        } else {
            bottomRight.display();
        }
    }
}