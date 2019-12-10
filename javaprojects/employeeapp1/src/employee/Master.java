package employee;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Master extends Application {
	  private static Stage primaryStage;
	  private static BorderPane mainItems;
	  private static BorderPane mainLayout;
	

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
	 public static void showMainItems() throws IOException{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(main.class.getResource("view/mainItems.fxml"));
		    mainItems = loader.load(); // ==  BorderPane  mainItems = loader.load();
			mainLayout.setCenter(mainItems);
		}
	 public static void  showElectricalScene()throws IOException{
		 FXMLLoader loader = new FXMLLoader();
		 loader.setLocation(main.class.getResource("electrical/electricalDep.fxml"));
		 BorderPane electricalDep = loader.load();
		 mainLayout.setCenter(electricalDep);
	 }

	 public static void showMechanicalScene() throws IOException {
		 FXMLLoader loader = new FXMLLoader();
		 loader.setLocation(main.class.getResource("mechanical/machanicalDep.fxml"));
		 BorderPane mechanicalDep = loader.load();
		 mainLayout.setCenter(mechanicalDep);
	 }
	 
	 public static void showAddStage() throws IOException{
		 FXMLLoader loader = new FXMLLoader();
		 loader.setLocation(main.class.getResource("view/addNewEmployee.fxml"));
		 BorderPane addEmployee =  loader.load();
		 // creating new stage 
		 Stage addDialogStage = new Stage();
		 addDialogStage.setTitle("Add New Employee");
		 addDialogStage.initModality(Modality.WINDOW_MODAL);
		 addDialogStage.initOwner(primaryStage);
		 // creating scene
		 Scene scene = new Scene(addEmployee);
		 addDialogStage.setTitle("Add New Employee");
		 addDialogStage.setScene(scene);
		 addDialogStage.showAndWait();
		 
		 
		 
		 
	 }
	 
	public static void main(String[] args) {
		launch(args);
	}
	
}
