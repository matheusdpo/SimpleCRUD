package io.com.crud.simplecrud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import io.com.connection.simplecrud.ConnectionSQL;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CRUD {

	public void create(String first_name, String surname, String username, String user_password, String martial_status,
			String rg, String cpf, String date_of_birthh, String age, String state, String zipcode, String address,
			String district, String house_number, String city, String email, String ddd, String phone_number) {

		Connection connection = new ConnectionSQL().getConnect();

		try {

			Statement createQuery = connection.createStatement();

			createQuery.executeUpdate("INSERT INTO users (first_name, surname, username, user_password, martial_status,"
					+ "rg, cpf, date_of_birth_, age, state, zipcode, address, district, house_number,"
					+ "city, email, ddd, phone_number) VALUES (" + first_name + "," + surname + "," + username + ","
					+ user_password + "," + martial_status + "," + rg + "," + cpf + "," + date_of_birthh + "," + age
					+ "," + state + "," + zipcode + "," + address + "," + district + "," + house_number + "," + city
					+ "," + email + "," + ddd + "," + phone_number + ")");
			System.out.println(
					"[SIMPLECRUD] ............................................................ Inserting data in to the DataBase.");
			connection.close();
			System.out.println("[SIMPLECRUD] ............................................................ Done!");

		} catch (SQLException e) {
			System.err.println(
					"SIMPLECRUD] ............................................................ You got an Exception!");
			System.err.println(e.getMessage());
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("CRUD - create method");
			alert.setContentText(e.getMessage());
			alert.setResizable(false);
			alert.show();
		}
	}

	/*
	 * public void rename(String first_name, String surname, String username, String
	 * user_password, String martial_status, String rg, String cpf, String
	 * date_of_birthh, String age, String state, String zipcode, String address,
	 * String district, String house_number, String city, String email, String ddd,
	 * String phone_number) { }
	 * 
	 * public void update(String first_name, String surname, String username, String
	 * user_password, String martial_status, String rg, String cpf, String
	 * date_of_birthh, String age, String state, String zipcode, String address,
	 * String district, String house_number, String city, String email, String ddd,
	 * String phone_number) { }
	 * 
	 * public void delete(String first_name, String surname, String username, String
	 * user_password, String martial_status, String rg, String cpf, String
	 * date_of_birthh, String age, String state, String zipcode, String address,
	 * String district, String house_number, String city, String email, String ddd,
	 * String phone_number) { }
	 */

}