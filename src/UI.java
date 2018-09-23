import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UI {

    @FXML
    private AnchorPane rootPane;

    @FXML
    void BinaryToDecimal(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("BinaryToDec.fxml"));
        rootPane.setPrefWidth(600) ;
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void DecimalToBinary(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("DecToBinary.fxml"));
        Conversions.changeWindowSize(Conversions.getPrimaryStage(),727,545);
        rootPane.getChildren().setAll(pane);
    }
}
