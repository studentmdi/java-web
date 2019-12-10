package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class mainController implements Initializable {
	
@FXML 
public Label myLabel;
	

@FXML
public ComboBox<String> combo;

@FXML
public ListView<String> view;// creating listView.


ObservableList <String> list = FXCollections.observableArrayList("lamin","Tijan", "Sainey");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		combo.setItems(list);
		view.setItems(list);// fetching items from comboBox to ListView
		// to select many items in listView:
		view.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); 
		
		
	}

	public void comboAction() {
		
		//this will add the items to the combobox once it item is selected in the list.
//       combo.getItems().addAll("Ebrima", "Binta","Fatou","Sanna","Modou");
       // this will set the item selected from the comboBox list.
//       myLabel.setText(combo.getValue());
		
	}
	public void buttonAction() {
		//this will add the items to the comBobox using its object "combo" once a button  is clicked.
//       combo.getItems().addAll("Ebrima", "Binta","Fatou","Sanna","Modou");
		
		//this will add the items to the listView using its object "view" once a button  is clicked.
//       view.getItems().addAll("Ebrima", "Binta","Fatou","Sanna","Modou");
       
       ObservableList <String> names;
       names =view.getSelectionModel().getSelectedItems();
       for(String name:names) {
    	   System.out.println(name);
       }
       
       
       
		
	}

}
