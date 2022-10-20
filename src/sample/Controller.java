package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.event.EventHandler;

public class Controller {
    @FXML
    private Button Send;

    @FXML
    private TextField Message;

    @FXML
    private TextArea Chat;

    @FXML
    private void SendButton(ActionEvent event){
        String message = Message.getText();
        Chat.appendText("Your message>> " + message + "\n");
        Message.setText("");
        Message.requestFocus();

    }

    @FXML
    public void onEnter(ActionEvent ae){
        String message = Message.getText();
        Chat.appendText("Your message>> " + message + "\n");
        Message.setText("");
        Message.requestFocus();
    }
}