package io.com.controller.simplecrud;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
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

	@FXML
	private TextField txtFieldCreateName;
	
	@FXML
	private TextField txtFieldCreateSurname;
	
	@FXML
	private TextField txtFieldCreateUsername;
	
	@FXML
	private PasswordField pwFieldCreatePassword;
	
	@FXML
	private ChoiceBox<String> chcCreateMartialStatus;
	
	@FXML
	private TextField txtFieldCreateRG;
	
	@FXML
	private TextField txtFieldCreateCPF;
	
	@FXML
	private DatePicker datePickerCreateDateofBirth;
	
	@FXML
	private TextField txtFieldCreateAge;
	
	@FXML
	private ChoiceBox<String> chcCreateUF;
	
	@FXML
	private TextField txtFieldCreateZIPCode;
	
	@FXML
	private TextField txtFieldCreateAdress;
	
	@FXML
	private TextField txtFieldCreateDisrtict;
	
	@FXML
	private TextField txtFieldCreateHouseNumber;
	
	@FXML
	private TextField txtFieldCreateCity;
	
	@FXML
	private TextField txtFieldCreateEMail;

	@FXML
	private TextField txtFieldCreateDDD;
	
	@FXML
	private TextField txtFieldCreatePhone;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

}
