package assignment1.scenario1;

/**
 * The XML file extension
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 12:11
 */

public class XmlFile implements File {
    @Override
    public void save() {
        System.out.println("Saving file as XML File.");
    }
}