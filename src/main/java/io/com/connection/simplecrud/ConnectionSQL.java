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
			connect = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			Alert a = new Alert(AlertType.WARNING);
			a.setTitle("Warning ConnectionSQL");
			a.setContentText(e.getMessage());
			a.show();
		}

		return connect;
	}

	public Connection getConnect() {
		return connect;
	}

}
