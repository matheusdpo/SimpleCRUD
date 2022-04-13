package io.com.crud.simplecrud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import io.com.connection.simplecrud.ConnectionSQL;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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

			connection.close();

		} catch (SQLException error) {
			System.err.println(error.getMessage());
		}
	}

	/*public void rename(String first_name, String surname, String username, String user_password, String martial_status,
			String rg, String cpf, String date_of_birthh, String age, String state, String zipcode, String address,
			String district, String house_number, String city, String email, String ddd, String phone_number) {
	}

	public void update(String first_name, String surname, String username, String user_password, String martial_status,
			String rg, String cpf, String date_of_birthh, String age, String state, String zipcode, String address,
			String district, String house_number, String city, String email, String ddd, String phone_number) {
	}

	public void delete(String first_name, String surname, String username, String user_password, String martial_status,
			String rg, String cpf, String date_of_birthh, String age, String state, String zipcode, String address,
			String district, String house_number, String city, String email, String ddd, String phone_number) {
	}*/

}