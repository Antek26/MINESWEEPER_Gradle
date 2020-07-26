package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;


public class goTo20x20Scene implements goToScene {

    private Button button = new Button();
    private ImageView logoImage;
    private Scene mainScene;


    private ArrayList<gridButton> buttons = new ArrayList<>();
    private boolean justSetRed = false;

    @Override
    public void goToScene(Scene selectScene, Stage stage) throws Exception {

        StackPane pane = new StackPane();
        pane.getChildren().add(logoImage);
        for (int heightPos = -130; heightPos < 270; heightPos += 20)
        {
            for (int widthPos = -200; widthPos < 200; widthPos += 20)
            {
                this.button = new Button();
                addButtons.addButtonToPane(this.button,pane,20,20,widthPos,heightPos);
                gridButton GridButton = new gridButton(button);
                buttons.add(GridButton);
            }
        }

        Button quitButton = new Button();
        quitButton.setText("Stop the game");
        addButtons.addButtonToPane(quitButton,pane,100,15,240,220);


        for (gridButton button : buttons)
        {

            button.getButton().setOnAction(e ->
            {
                if ((button.isRed() == false))
                {
                    button.setRed(true);
                    button.getButton().setStyle("-fx-background-color: #dcdcdc; ");
                }
                else
                {
                    button.setRed(false);
                    button.getButton().setStyle("-fx-background-color: #ffffdc; ");
                }
            });
        }


        quitButton.setOnAction(e ->
        {
            Pane subPane1 = new Pane();
            subPane1.getChildren().add(logoImage);

            addButtons.modifyButtonSize(main2.getButton5x5(),300,40,0,0);
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
