package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemSeller;

	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onActionMenuItemSeller() {
		System.out.println("seller");
	}
	
	@FXML
	public void onActionMenuItemDepartment() {
		System.out.println("department");
	}
	
	@FXML
	public void onActionMenuItemAbout() {			
			Main.getSecondaryStage().show();
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}
	
}
