package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class addButtons {

    public static void addButtonToPane(Button button, StackPane pane, int width, int height, int x, int y)
    {
        button.setMaxWidth(width);
        button.setMaxHeight(height);
        button.setTranslateX(x);
        button.setTranslateY(y);
        pane.getChildren().add(button);
    }

    public static void modifyButtonSize(Button button, int width, int height, int x, int y)
    {
        button.setMaxWidth(width);
        button.setMaxHeight(height);
        button.setTranslateX(x);
        button.setTranslateY(y);
    }
}
