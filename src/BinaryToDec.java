import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BinaryToDec {
    @FXML
    Label Display1;
    @FXML
    Label Display2;
    @FXML
    private AnchorPane rootPane;
    private String text="";

    @FXML
    void Btn0() {
        if (text.length() < 30) {
            text = text + "" + 0;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn1() {
        if (text.length() < 30) {
            text = text + "" + 1;
            Display1.setText(text);
        }
    }
    @FXML
    void Delete() {
        if (!text.isEmpty()) {
            text = text.substring(0, text.length() - 1);
            Display1.setText(text);
        }
    }
    @FXML
    void Clear() {
        text = "";
        Display1.setText(text);
    }
    @FXML
    void Solve() {
        if (!text.isEmpty()) {
            Display2.setText(Double.toString(Conversions.GetDecimal(text)));
        }
    }
    @FXML
    void Back() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("UI.fxml"));
        rootPane.setPrefWidth(600) ;
        rootPane.getChildren().setAll(pane);
    }
}

