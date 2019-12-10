package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class bmiController {
	//norman textField
	@FXML
	private TextField txtfieldH,txtfieldWeight;
	//norman button
	@FXML
	private Button bmiOutp,bmiEff,btnD;
	
	// method buttons
	@FXML
	private Button btnDisplayBmi,btnRset,btnExit;
	
	//exit method
	public void exit() {
		System.exit(0);
	}
	public void hoover() {
		btnD.setText("you are about to calculate your bmi");
	}
	//reset method
	public void reset() {
		txtfieldH.setText(null);
		txtfieldWeight.setText(null);
		bmiEff.setText(null);
		bmiOutp.setText(null);
		btnD.setText(null);
	}
	//calculate method
	public void calculate() {
		double iHeight = Double.parseDouble(txtfieldH.getText());
		double iWeight = Double.parseDouble(txtfieldWeight.getText());
		double iBmi = iWeight / (iHeight *iHeight);
		
		
	String Cal_Bmi = String.format("%.1f" , iBmi); // iBmi to 1 decimal place
	bmiOutp.setText("Your Body Mass is " + Cal_Bmi+ "kg/m2");
	
	if(iBmi<=24.9) {
		bmiEff.setText(" below normal weight");
	}
	else if(iBmi<=29.9) {
		bmiEff.setText("normal weight");
	}
	else if(iBmi<=34.9) {
		bmiEff.setText("obove normal weight\n please visit the doctor");
	}
	else  {
		bmiEff.setText(" obesecity weight");
	}
	}
}
