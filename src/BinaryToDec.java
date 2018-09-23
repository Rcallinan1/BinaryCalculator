import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class BinaryToDec {
    @FXML
    Label Display1;
    @FXML
    Label Display2;
    String text="";
    ArrayList<Integer> ans;

    @FXML
    void Btn0(ActionEvent event){
        if (text.length() < 30) {
            text = text + "" + 0;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn1(ActionEvent event){
        if (text.length() < 30) {
            text = text + "" + 1;
            Display1.setText(text);
        }
    }
    @FXML
    void Delete(ActionEvent event){
        text = text.substring(0, text.length() - 1);
        Display1.setText(text);
    }
    @FXML
    void Clear(ActionEvent event){
        text = "";
        Display1.setText(text);
    }
    @FXML
    void Solve(ActionEvent event){
        Display2.setText(Double.toString(Conversions.BinaryToDecimal(text)));
    }
}

