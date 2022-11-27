package application;

import java.io.IOException;

import gui.util.Alerts;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	private static Scene mainScene;

	private static Stage secondaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollPane = loader.load();

			secondaryStage = new Stage();
			loadSecondaryStage();

			mainScene = new Scene(scrollPane);

			primaryStage.setTitle("Sample JavaFX application");
			mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(mainScene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void loadSecondaryStage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/About.fxml"));
			BorderPane border;
			border = loader.load();
			Scene scene = new Scene(border);
			secondaryStage.initStyle(StageStyle.UTILITY);
			secondaryStage.setTitle("About this project");
			secondaryStage.setScene(scene);
			secondaryStage.setResizable(false);
			secondaryStage.setAlwaysOnTop(true);
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}

	public static Scene getMainScene() {
		return mainScene;
	}

	public static Stage getSecondaryStage() {
		return secondaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
