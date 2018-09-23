import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class DecToBinary {

    @FXML
    Label Display1;
    @FXML
    Label Display2;
    @FXML
    Label Display3;
    @FXML
    Label Display4;
    String text="";
    ArrayList<String> bin_ans;
    ArrayList<String> oct_ans;
    ArrayList<String> hex_ans;


    @FXML
    void Btn1(ActionEvent event){
        if (text.length() < 9) {
            text = text + "" + 1;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn2(ActionEvent event){
        if (text.length() < 9) {

            text = text + "" + 2;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn3(ActionEvent event){
        if (text.length() < 9) {
            text = text + "" + 3;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn4(ActionEvent event){
        if (text.length() < 9) {
            text = text + "" + 4;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn5(ActionEvent event){
        if (text.length() < 9) {
            text = text + "" + 5;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn6(ActionEvent event){
        if (text.length() < 9) {
            text = text + "" + 6;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn7(ActionEvent event) {
        if (text.length() < 9) {
            text = text + "" + 7;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn8(ActionEvent event){
        if (text.length() < 9) {
            text = text + "" + 8;
            Display1.setText(text);
        }
    }
    @FXML
    void Btn9(ActionEvent event){
        if (text.length() < 9) {
            text = text + "" + 9;
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
        bin_ans = Conversions.DecToOther(text,2);
        oct_ans = Conversions.DecToOther(text,8);
        hex_ans = Conversions.DecToOther(text,16);
        String res_hex = String.join("", hex_ans);
        String res_bin = String.join("", bin_ans);
        String res_oct = String.join("", oct_ans);
        Display2.setText(res_bin);
        Display3.setText(res_oct);
        Display4.setText(res_hex);
    }
}
