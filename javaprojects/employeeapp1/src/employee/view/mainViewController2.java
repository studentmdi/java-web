package employee.view;

import java.io.IOException;

import employee.Master;
import javafx.fxml.FXML;

public class mainViewController2 {

	private Master main;
	@FXML 
	private void goHome() throws IOException {
		main.showMainItems();
	}
	@FXML 
	private void addBtn()throws IOException {
		main.showAddStage();
	}
}
