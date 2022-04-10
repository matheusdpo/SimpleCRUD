package io.com.controller.simplecrud;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXController implements Initializable {

	/*
	 * * * * * * * * * *\ FXML Variables \* * * * * * * * * *
	 */

	// Example of variables names:
	// -> btnCheckCreateAccount
	// -> btn = Type of the Variable (Button)
	// -> Check = Reference of the image (Check/Confirm Icon)
	// -> CreateAccount = Which tab it is (Tab Create Account)

	@FXML
	private Button btnCheckCreateAccount;

	@FXML
	private Button btnCancelCreateAccount;

	@FXML
	private Button btnCheckSearchAccount;

	@FXML
	private Button btnCancelSearchAccount;

	@FXML
	private Button btnConvert2XLSearchAccount;

	@FXML
	private Button btnConvert2PDFSearchAccount;

	@FXML
	private Button btnUpdateUpdateAccount;

	@FXML
	private Button btnCancelUpdateAccount;

	@FXML
	private Button btnDeleteDeleteAccount;

	@FXML
	private Button btnCancelDeleteAccount;

	@FXML
	private TextField txtFieldCreateID;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

}
