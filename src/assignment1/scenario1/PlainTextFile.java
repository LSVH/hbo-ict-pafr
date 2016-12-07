package assignment1.scenario1;

/**
 * The plain text file extension
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 12:11
 */

public class PlainTextFile implements File {
    @Override
    public void save() {
        System.out.println("Saving file as Plain Text File.");
    }
}