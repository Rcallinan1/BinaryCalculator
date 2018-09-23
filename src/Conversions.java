import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.*;


public class Conversions extends Application{
    private static Stage primaryStage; // **Declare static Stage**



    public static ArrayList<String> DecToOther(String number, int type){
        int decimal = Integer.valueOf(number);
        ArrayList<String> binary_arr = new ArrayList<String>();
        while(decimal != 0){
            int mod = decimal % type;
            if(mod == 10){
                binary_arr.add("A");
            }
            else if(mod == 11){
                binary_arr.add("B");
            }
            else if(mod == 12){
                binary_arr.add("C");
            }
            else if(mod == 13){
                binary_arr.add("D");
            }
            else if(mod == 14){
                binary_arr.add("E");
            }
            else if(mod == 15){
                binary_arr.add("F");
            }
            else {
                binary_arr.add(Integer.toString(mod));
            }
            decimal = decimal / type;
        }
        Collections.reverse(binary_arr);
        System.out.println(binary_arr);
        return  binary_arr;
    }

    public static double BinaryToDecimal(String number){
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

    public static void main(String args[]){
        launch(args);
        }

    private void setPrimaryStage(Stage stage) {
        Conversions.primaryStage = stage;
    }

    static public Stage getPrimaryStage() {
        return Conversions.primaryStage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Conversion Calculator");
        setPrimaryStage(primaryStage); // **Set the Stage**
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        Scene mainScene = new Scene(root, 600, 400);
        primaryStage.setScene(mainScene);
        mainScene.getStylesheets().add("DecToBin.css");
        primaryStage.show();
    }

    public static void changeWindowSize(Stage primaryStage, int width, int height){
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);
    }
}

