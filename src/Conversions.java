import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Conversions extends Application{
    private static Stage primaryStage;


    /**
     * Converts a decimal input to the desired conversion type
     * @param number Input to be converted
     * @param type Conversion method desired
     * @return The converted number
     */
    private static ArrayList<String> DecToOther(String number, int type){
        int decimal = Integer.valueOf(number);
        ArrayList<String> binary_arr = new ArrayList<>();
        while(decimal != 0){
            int mod = decimal % type;
            switch(mod){
                default: binary_arr.add(Integer.toString(mod)); break;
                case 10: binary_arr.add("A"); break;
                case 11: binary_arr.add("B"); break;
                case 12: binary_arr.add("C"); break;
                case 13: binary_arr.add("D"); break;
                case 14: binary_arr.add("E"); break;
                case 15: binary_arr.add("F"); break;
            }
            decimal = decimal / type;
        }
        Collections.reverse(binary_arr);
        System.out.println(binary_arr);
        return binary_arr;
    }

    /**
     * Converts a binary number to decimal format
     * @param number The binary input
     * @return The decimal number
     */
    private static double BinaryToDecimal(String number){
        String[] digits = number.split("");
        List<String> digitsList = Arrays.asList(digits);
        int count = digitsList.size()-1;
        double result = 0;
        for(String i:digitsList){
            if(Integer.parseInt(i) == 1) {
                result = result + Math.pow(2, count);
            }
            count--;
        }
        System.out.println(result);
        return result;
    }

    static ArrayList<String> GetOther(String number, int type) {
        return DecToOther(number, type);
    }

    static double GetDecimal(String number) {
        return BinaryToDecimal(number);
    }

    public static void main(String args[]){
        launch(args);
        }

    private void setPrimaryStage(Stage stage) {
        Conversions.primaryStage = stage;
    }

    static Stage getPrimaryStage() {
        return Conversions.primaryStage;
    }

    static void changeWindowSize(Stage primaryStage, int width, int height) {
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Conversion Calculator");
        setPrimaryStage(primaryStage);
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        Scene mainScene = new Scene(root, 600, 400);
        primaryStage.setScene(mainScene);
        mainScene.getStylesheets().add("main.css");
        primaryStage.show();
    }
}

