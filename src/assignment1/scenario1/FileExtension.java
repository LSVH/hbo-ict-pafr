package assignment1.scenario1;

import java.util.ArrayList;

/**
 * The file extension composite class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 12:13
 */

public class FileExtension implements File {
    private ArrayList<File> files = new ArrayList<File>();

    public void add(File f) {
        this.files.add(f);
    }

    public void remove(File f) {
        this.files.remove(f);
    }

    @Override
    public void save() {
        for (File f : files) {
            f.save();
        }
    }
}