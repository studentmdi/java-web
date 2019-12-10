package employee;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class main extends Application {
      private Stage primaryStage;
	  private BorderPane mainLayout, mainItems;
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Employee App");
	    showMainView();
	    showMainItems();

	}
   
	private void showMainView() throws IOException{
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(main.class.getResource("view/mainView.fxml"));
    	mainLayout = loader.load(); // is BorderPane its width and height is set in scene builder.
    	// mainLayouut stores the loader and the loader stores FXML of mainView.fxml.
    	Scene scene = new Scene(mainLayout);
    	primaryStage.setScene(scene);
    	primaryStage.show();
    }
	 private void showMainItems() throws IOException{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(main.class.getResource("view/mainItems.fxml"));
			 mainItems = loader.load();
			mainLayout.setCenter(mainItems);
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}
