package io.com.connection.simplecrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ConnectionSQL {

	private static Connection connect = null;

	private static String url = "jdbc:mysql://localhost/SIMPLECRUD";
	private static String user = "root";
	private static String pw = "yourpasswd";

	public static Connection connectDB() {
		try {
			System.out.println(
					"[SIMPLECRUD] ............................................................ Connecting to the DataBase.");
			connect = DriverManager.getConnection(url, user, pw);
			System.out.println("[SIMPLECRUD] ............................................................ Connected!");
		} catch (SQLException e) {
			System.err.println(
					"SIMPLECRUD] ............................................................ You got an Exception!");
			System.err.println(e.getMessage());
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("ConnectionSQL - connectDB method");
			alert.setContentText(e.getMessage());
			alert.setResizable(false);
			alert.show();
		}

		return connect;
	}

	public Connection getConnect() {
		return connect;
	}

}
