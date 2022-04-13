package io.com.main.simplecrud;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

	public static void main(String[] args) {
		System.out.println(
				"[SIMPLECRUD] ............................................................ Application Started.");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/settings/Layout.fxml"));
			Scene scene = new Scene(root, 300, 400);
			scene.getStylesheets().add(getClass().getResource("/settings/Layout.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			System.out.println("[SIMPLECRUD] ............................................................ GUI Started");
		} catch (Exception e) {
			System.err.println(
					"[SIMPLECRUD] ............................................................ You got an exception!");
			System.err.println(e.getMessage());
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("MainApplication - start method");
			alert.setContentText(e.getMessage());
			alert.setResizable(false);
			alert.show();
		}
	}
}
