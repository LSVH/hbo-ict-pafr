package assignment1.scenario1;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 12:16
 */

public class Main {
    public static void main(String[] args) {
        HtmlFile htmlFile = new HtmlFile();
        PlainTextFile plainTextFile = new PlainTextFile();
        RtfFile rtfFile = new RtfFile();
        WordFile wordFile = new WordFile();
        XmlFile xmlFile = new XmlFile();

        FileExtension fileExtension = new FileExtension();
        fileExtension.add(htmlFile);
        fileExtension.add(plainTextFile);
        fileExtension.add(rtfFile);
        fileExtension.add(wordFile);
        fileExtension.add(xmlFile);

        fileExtension.save();
    }
}