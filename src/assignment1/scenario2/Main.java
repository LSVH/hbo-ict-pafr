package assignment1.scenario2;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 13:13
 */

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(10, 20, 5, 15);
        CoordinateDispatcher cd = new CoordinateDispatcher(c);
        cd.dispatch("topLeft");
        cd.dispatch("bottomRight");
    }
}