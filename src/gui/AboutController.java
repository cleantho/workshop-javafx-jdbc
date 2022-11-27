package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AboutController {

	@FXML
	private Button buttonClose;

	@FXML
	private void onActionButtonClose() {
		Main.getSecondaryStage().hide();
	}
}
