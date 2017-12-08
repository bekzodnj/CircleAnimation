/*
* Program shows JavaFX Animation Sample
*
* Author @BekzodjonN 
 */
package hello;


import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import javafx.stage.Stage;
import javafx.util.Duration;


public class Hello extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
       
     Pane pane = new Pane();
     
     Rectangle rectangle = new Rectangle (0, 0, 25, 25);
     rectangle.setFill(Color.ORANGE);
     
     
     Circle circle = new Circle(125, 100, 60);
     
     circle.setFill(Color.WHITE);
     circle.setStroke(Color.BLACK);
     
     pane.getChildren().add(circle);
     pane.getChildren().add(rectangle);
     
     PathTransition pt = new PathTransition();
     pt.setDuration(Duration.millis(4000));
     pt.setPath(circle);
     pt.setNode(rectangle);
     
     pt.setOrientation(
     PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
     pt.setCycleCount(Timeline.INDEFINITE);
     pt.setAutoReverse(true);
     pt.play(); 
     
     
     circle.setOnMousePressed(e -> pt.pause());
     
     circle.setOnMouseReleased(e -> pt.play());
     
     Scene scene = new Scene(pane, 250, 200);
     primaryStage.setTitle("PathTransitionDemo");
     
     primaryStage.setScene(scene);
     primaryStage.show();
    
    }

    
    
}
