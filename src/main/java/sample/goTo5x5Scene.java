package sample;

import static sample.main2.imageView;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class goTo5x5Scene implements goToScene {

    private Button button = new Button();
    private ImageView logoImage;
    private Scene mainScene;

    private ArrayList<Button> buttons = new ArrayList<>();


    @Override
    public void goToScene(Scene selectScene, Stage stage)  {

        StackPane pane = new StackPane();
        pane.getChildren().add(logoImage);
        for (int heightPos = -100; heightPos < 100; heightPos += 40)
        {
            for (int widthPos = -100; widthPos < 100; widthPos += 40)
            {
                this.button = new Button();
                addButtons.addButtonToPane(this.button,pane,40,40,widthPos,heightPos);

                buttons.add(this.button);
            }
        }

        Button quitButton = new Button();
        quitButton.setText("Stop the game");
        addButtons.addButtonToPane(quitButton,pane,100,15,170,220);


        for (Button button : this.buttons)
        {
            button.setOnAction(e ->
            {
                button.setStyle("-fx-background-color: #ff0000; ");
            });
        }

        quitButton.setOnAction(e ->
        {
            main2.mainClassPane.getChildren().add(imageView);
            stage.setScene(mainScene);
            stage.show();
        });


        selectScene = new Scene(pane,600,500);
        stage.setScene(selectScene);
    }



    public void setLogoImage(ImageView logoImage) {
        this.logoImage = logoImage;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }
}
