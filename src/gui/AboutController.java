package gui;

import gui.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AboutController {

	@FXML
	private Button buttonClose;

	@FXML
	private void onActionButtonClose(ActionEvent event) {
		Utils.currentStage(event).close();
	}
}
