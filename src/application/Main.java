
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
 
public class Main extends Application {

   
	 @Override
      public void start(Stage Stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Tudien.fxml"));
        
        Stage.setTitle("Hello World");
        Stage.setScene(new Scene(root,1200, 840));
        Stage.show();
    }
	 
	public static void main(String[] args) {
        launch(args);
    }
}
