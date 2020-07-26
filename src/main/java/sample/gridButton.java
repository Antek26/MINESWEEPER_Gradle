package sample;

import javafx.scene.control.Button;

public class gridButton {

    private Button button;
    private boolean isRed;


    public gridButton(Button button)
    {
        this.button = button;
        this.isRed = false;
    }

    public Button getButton() {
        return button;
    }

    public boolean isRed() {
        return isRed;
    }

    public void setRed(boolean red) {
        isRed = red;
    }
}
