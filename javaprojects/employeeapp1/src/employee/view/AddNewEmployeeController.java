package employee.view;

import java.util.ArrayList;
import java.util.Calendar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class AddNewEmployeeController {
//	arraylist for marital status
	
	ObservableList<String> maritalStatusList = FXCollections.observableArrayList(
			"single", "married","divoiced");
//	arraylist for maindepartments
	ObservableList<String> maindepartmentList = FXCollections.observableArrayList(
			"Electrical", "Mechanical");
//	arraylist for electricaldepartment
	ObservableList<String> electricalList = FXCollections.observableArrayList(
			"Design", "R & D");	
//	arraylist for mechanicaldepartment
	ObservableList<String> mechanicalList = FXCollections.observableArrayList(
			"Sales", "Management");	
	//contact informations
	@FXML
	private TextField nameField;
	@FXML
	private TextField addressField;
	@FXML
	private TextField cityField;
	@FXML
	private TextField phoneField;
	@FXML
	private TextField emailField;
	
	//Employee information
	@FXML
	private TextField idTextField;
	@FXML
	private ComboBox mainDepartmentBox;
	@FXML
	private ComboBox DepartmentBox;
	
	//radio button variables
		@FXML
		private RadioButton maleBtn;
		@FXML
		private RadioButton femaleBtn;
		
	//personal informations
	@FXML
	private DatePicker dateofBirth;
	@FXML
	private TextField ageField;
	
	@FXML
	private ChoiceBox maritalStatusBox;
//	 method for arrayList of ChoiceBox
	@FXML
	public void Initialize() {
		maritalStatusBox.setItems(maritalStatusList);
		mainDepartmentBox.setItems(maindepartmentList);
		DepartmentBox.setItems(electricalList);
		
		
	}
//	 method for arrayList maindepartmentList
	@FXML
	private void mainDepartChoice() {
		if(mainDepartmentBox.getValue().equals("Electrical")) {
			DepartmentBox.setValue("Design");
			DepartmentBox.setItems(electricalList);
		
		}
		else {
			DepartmentBox.setValue("Sales");
			DepartmentBox.setItems(mechanicalList);
			
		}
	}
	@FXML
	private void showAge() {
		// calculating the age 
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int birthYear = (dateofBirth.getValue().getYear());
		int age = year - birthYear;
		ageField.setText(Integer.toString(age) + " years");	
		
	}
}
