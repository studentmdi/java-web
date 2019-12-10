package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class mainController implements Initializable{

	@FXML
	TreeView <String>treeview;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/java.png")); //path to the image
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		TreeItem<String> Manu = new TreeItem<>("Menu", new ImageView(icon));
		Manu.setExpanded(true); //this wil expand the nod in the root otomaticmally
		//creating notes
		TreeItem<String> nodA = new TreeItem<>("nod A" ,new ImageView(icon));
		TreeItem<String> nodB = new TreeItem<>("nod B" ,new ImageView(icon));
		TreeItem<String> nodC = new TreeItem<>("nod C", new ImageView(icon));
		//creating sub notes
		TreeItem<String> nodA1 = new TreeItem<>("nod A1");
		TreeItem<String> nodB1 = new TreeItem<>("nod B1");
		TreeItem<String> nodC1 = new TreeItem<>("nod C1");
		
		//getting multiple nod
		Manu.getChildren().addAll(nodA,nodB,nodC);
		//getting sub nod nod
		nodA.getChildren().addAll(nodA1,nodB1,nodC1);
		treeview.setRoot(Manu);
		
	
	}
		
	
	// add mouse event to the treeview
	public void mouseClick(MouseEvent mouse) {
	
		if(mouse.getClickCount()==2) { // if a nod is click 2 times
		TreeItem<String> item = treeview.getSelectionModel().getSelectedItem();
		System.out.println(item.getValue());
		}
	}

}
