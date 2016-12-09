package assignment1.scenario3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 14:50
 */

public class Main extends Application {
    private Text counter;
    private ImageView image;
    private ImageBrowser browser;

    public static void main(String[] args) {
        launch(args);
    }

    private void prevImage(ActionEvent event) {
        image.setImage(browser.prev());
        counter.setText(browser.getImageCount());
    }

    private void nextImage(ActionEvent event) {
        image.setImage(browser.next());
        counter.setText(browser.getImageCount());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Panes
        VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);

        HBox actions = new HBox();
        actions.setAlignment(Pos.TOP_CENTER);
        root.getChildren().add(actions);


        // Elements
        browser = new ImageBrowser(getClass().getResource("assets").getPath());
        image = new ImageView(browser.getCurrent());

        Button prev = new Button("Previous");
        prev.setOnAction(this::prevImage);
        HBox.setMargin(prev, new Insets(10));
        actions.getChildren().add(prev);
        root.getChildren().add(image);

        counter = new Text(browser.getImageCount());
        HBox.setMargin(counter, new Insets(15));
        actions.getChildren().add(counter);

        Button next = new Button("Next");
        next.setOnAction(this::nextImage);
        HBox.setMargin(next, new Insets(10));
        actions.getChildren().add(next);


        // Stage
        primaryStage.setTitle("Assignment 1: Scenario 3");
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();
    }
}