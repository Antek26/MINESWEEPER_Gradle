package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class goTo10x10Scene implements goToScene {

    private Button button = new Button();
    private ImageView logoImage;
    private Scene mainScene;

    private ArrayList<Button> buttons = new ArrayList<>();



    @Override
    public void goToScene(Scene selectScene, Stage stage) throws Exception {

        StackPane pane = new StackPane();
        pane.getChildren().add(logoImage);
        for (int heightPos = -100; heightPos < 200; heightPos += 30)
        {
            for (int widthPos = -150; widthPos < 150; widthPos += 30)
            {
                this.button = new Button();
                addButtons.addButtonToPane(this.button,pane,30,30,widthPos,heightPos);
                buttons.add(this.button);
            }
        }
        Button quitButton = new Button();
        quitButton.setText("Stop the game");
        addButtons.addButtonToPane(quitButton,pane,100,15,190,220);

        for (Button button : this.buttons)
        {
            button.setOnAction(e ->
            {
                button.setStyle("-fx-background-color: #ff0000; ");
            });
        }



        quitButton.setOnAction(e ->
        {
            Pane subPane1 = new Pane();
            subPane1.getChildren().add(logoImage);

            addButtons.modifyButtonSize(main2.getButton5x5(),150,40,0,0);
            subPane1.getChildren().add(main2.getButton5x5());

            addButtons.modifyButtonSize(main2.getButton10x10(),150,40,0,70);
            subPane1.getChildren().add(main2.getButton10x10());

            addButtons.modifyButtonSize(main2.getButton20x20(), 150,40,0,140);
            subPane1.getChildren().add(main2.getButton20x20());

            main2.getMainClassPane().getChildren().addAll(subPane1);
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
