package employee.view;

import employee.Master;
import javafx.fxml.FXML;

public class mainItemsController {
  
	private Master main;
	@FXML
	private void goElectrical() throws Exception{
		main.showElectricalScene();
	}
	@FXML
	private void goMechnical() throws Exception {
		main.showMechanicalScene();
	}
}
