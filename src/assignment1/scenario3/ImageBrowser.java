package assignment1.scenario3;

import javafx.scene.image.Image;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 15:22
 */

public class ImageBrowser {
    private int counter = 1;
    private Image current;
    private String currentPath;
    private String rootPath;
    private List<String> prev = new LinkedList<String>();
    private List<String> next = new LinkedList<String>();

    public ImageBrowser(String rootPath) {
        this.rootPath = rootPath;
        indexImages();
    }

    public Image getCurrent() {
        return current;
    }

    public String getImageCount() {
        return Integer.toString(counter) + " / " + (1 + prev.size() + next.size());
    }

    public Image prev() {
        if (!prev.isEmpty()) {
            counter--;
            next.add(currentPath);
            currentPath = prev.get(prev.size() - 1);
            current = new Image(currentPath);
            prev.remove(prev.size() - 1);
        }
        return current;
    }

    public Image next() {
        if (!next.isEmpty()) {
            counter++;
            prev.add(currentPath);
            currentPath = next.get(next.size() - 1);
            current = new Image(currentPath);
            next.remove(next.size() - 1);
        }
        return current;
    }

    public void indexImages() {
        try {
            File[] files = new File(rootPath).listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    String mime = new MimetypesFileTypeMap().getContentType(file);
                    if ("image".equals(mime.split("/")[0])) {
                        next.add(file.toURI().toURL().toExternalForm());
                    }
                }
            }
            currentPath = next.get(next.size() - 1);
            this.current = new Image(currentPath);
            next.remove(next.size() - 1);
        } catch (NullPointerException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}