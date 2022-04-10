package io.com.main.simplecrud;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

	public static void main(String[] args) {
		System.out.println("Loading");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Layout.fxml"));
			Scene scene = new Scene(root, 300, 400);
			scene.getStylesheets().add(getClass().getResource("Layout.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
