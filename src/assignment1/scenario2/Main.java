package assignment1.scenario2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 7-12-16 @ 13:13
 */

public class Main extends Application {
    private Coordinates coordinates = new Coordinates(200, 100, 50, 50, 50);
    private CoordinateDispatcher cd = new CoordinateDispatcher(coordinates);
    private Rectangle rectangle = new Rectangle(coordinates.getHorizontal(), coordinates.getVertical(), coordinates.getWidth(), coordinates.getHeight());

    public static void main(String[] args) {
        launch(args);
    }

    private void CoordinateSwitcher(ActionEvent event) {
        Coordinates update = cd.dispatch();
        rectangle.setY(update.getVertical());
        rectangle.setX(update.getHorizontal());
        rectangle.setWidth(update.getWidth());
        rectangle.setHeight(update.getHeight());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Panes
        VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);

        AnchorPane canvas = new AnchorPane();
        canvas.setMaxSize(coordinates.getCanvas(), coordinates.getCanvas());
        canvas.setMinSize(coordinates.getCanvas(), coordinates.getCanvas());
        canvas.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        root.getChildren().add(canvas);

        // Elements
        Button switchCoordinates = new Button("Switch coordinates");
        switchCoordinates.setOnAction(this::CoordinateSwitcher);
        root.setMargin(switchCoordinates, new Insets(15));
        root.getChildren().add(switchCoordinates);

        rectangle.setFill(Color.BLUE);
        canvas.getChildren().add(rectangle);

        // Stage
        primaryStage.setTitle("Assignment 1: Scenario 2");
        primaryStage.setScene(new Scene(root, 480, 260));
        primaryStage.show();
    }
}