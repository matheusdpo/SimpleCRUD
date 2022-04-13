package io.com.controller.simplecrud;

import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;

import io.com.crud.simplecrud.CRUD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class FXController implements Initializable {

	/*
	 * * * * * * * * * *\ FXML Variables \* * * * * * * * * *
	 */

	// Example of variables names:
	// -> btnCheckUpdateAccount
	// -> btn = Type of the Variable (Button)
	// -> Check = Reference of the image (Check/Confirm Icon)
	// -> UpdateAccount = Which tab it is (Tab Update Account)
	// Create fxml variables

	// footer fxml year variable
	@FXML
	private Labeled lblYear;

	// create fxml variables

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
	private TextField txtFieldCreateAddress;

	@FXML
	private TextField txtFieldCreateDistrict;

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

	// read fxml variables

	@FXML
	private ChoiceBox<String> chcReadInfo;

	@FXML
	private TextField txtFieldReadInfo;

	@FXML
	private TextField txtFieldReadID;

	@FXML
	private TextField txtFieldReadName;

	@FXML
	private TextField txtFieldReadSurname;

	@FXML
	private TextField txtFieldReadUsername;

	@FXML
	private TextField txtFieldReadPassword;

	@FXML
	private TextField txtFieldReadMaritalStatus;

	@FXML
	private TextField txtFieldReadRG;

	@FXML
	private TextField txtFieldReadCPF;

	@FXML
	private TextField txtFieldReadDateofBirth;

	@FXML
	private TextField txtFieldReadAge;

	@FXML
	private TextField txtFieldReadUF;

	@FXML
	private TextField txtFieldReadZIPCode;

	@FXML
	private TextField txtFieldReadAddress;

	@FXML
	private TextField txtFieldReadDistrict;

	@FXML
	private TextField txtFieldReadHouseNumber;

	@FXML
	private TextField txtFieldReadCity;

	@FXML
	private TextField txtFieldReadEMail;

	@FXML
	private TextField txtFieldReadDDD;

	@FXML
	private TextField txtFieldReadPhone;

	// update fxml variables
	@FXML
	private ChoiceBox<String> chcUpdateInfo;

	@FXML
	private TextField txtFieldUpdateInfo;

	@FXML
	private TextField txtFieldUpdateID;

	@FXML
	private TextField txtFieldUpdateName;

	@FXML
	private TextField txtFieldUpdateSurname;

	@FXML
	private TextField txtFieldUpdateUsername;

	@FXML
	private PasswordField pwFieldUpdatePassword;

	@FXML
	private ChoiceBox<String> chcUpdateMartialStatus;

	@FXML
	private TextField txtFieldUpdateRG;

	@FXML
	private TextField txtFieldUpdateCPF;

	@FXML
	private DatePicker datePickerUpdateDateofBirth;

	@FXML
	private TextField txtFieldUpdateAge;

	@FXML
	private ChoiceBox<String> chcUpdateUF;

	@FXML
	private TextField txtFieldUpdateZIPCode;

	@FXML
	private TextField txtFieldUpdateAddress;

	@FXML
	private TextField txtFieldUpdateDistrict;

	@FXML
	private TextField txtFieldUpdateHouseNumber;

	@FXML
	private TextField txtFieldUpdateCity;

	@FXML
	private TextField txtFieldUpdateEMail;

	@FXML
	private TextField txtFieldUpdateDDD;

	@FXML
	private TextField txtFieldUpdatePhone;

	// delete fxml variables

	@FXML
	private ChoiceBox<String> chcDeleteInfo;

	@FXML
	private TextField txtFieldDeleteInfo;

	@FXML
	private TextField txtFieldDeleteID;

	@FXML
	private TextField txtFieldDeleteName;

	@FXML
	private TextField txtFieldDeleteSurname;

	@FXML
	private TextField txtFieldDeleteUsername;

	@FXML
	private TextField txtFieldDeletePassword;

	@FXML
	private TextField txtFieldDeleteMaritalStatus;

	@FXML
	private TextField txtFieldDeleteRG;

	@FXML
	private TextField txtFieldDeleteCPF;

	@FXML
	private TextField txtFieldDeleteDateofBirth;

	@FXML
	private TextField txtFieldDeleteAge;

	@FXML
	private TextField txtFieldDeleteUF;

	@FXML
	private TextField txtFieldDeleteZIPCode;

	@FXML
	private TextField txtFieldDeleteAddress;

	@FXML
	private TextField txtFieldDeleteDistrict;

	@FXML
	private TextField txtFieldDeleteHouseNumber;

	@FXML
	private TextField txtFieldDeleteCity;

	@FXML
	private TextField txtFieldDeleteEMail;

	@FXML
	private TextField txtFieldDeleteDDD;

	@FXML
	private TextField txtFieldDeletePhone;

	// buttons fxml variables

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

	// commons variables

	private ObservableList<String> MaritalStatusList = FXCollections.observableArrayList("Single", "Married", "Widowed",
			"Separated", "Divorced");

	private ObservableList<String> UFList = FXCollections.observableArrayList("AC", "AL", "AM", "AP", "BA", "CE", "DF",
			"ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE",
			"SP", "TO");

	private ObservableList<String> InfoList = FXCollections.observableArrayList("ID", "Username", "RG", "CPF",
			"E-Mail");

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// add automatically the current year in the footer
		Integer autoYear = Calendar.getInstance().get(Calendar.YEAR);
		lblYear.setText(autoYear.toString());

		// add values in the choice boxes
		chcCreateMartialStatus.getItems().addAll(MaritalStatusList);
		chcCreateUF.getItems().addAll(UFList);

		chcReadInfo.getItems().addAll(InfoList);

		chcUpdateMartialStatus.getItems().addAll(MaritalStatusList);
		chcUpdateUF.getItems().addAll(UFList);
		chcUpdateInfo.getItems().addAll(InfoList);

		chcDeleteInfo.getItems().addAll(InfoList);
	}

	public void clear() {
		/* Clear Create */
		txtFieldCreateID.setText(null);
		txtFieldCreateName.setText(null);
		txtFieldCreateSurname.setText(null);
		txtFieldCreateUsername.setText(null);
		pwFieldCreatePassword.setText(null);
		chcCreateMartialStatus.setValue(null);
		txtFieldCreateRG.setText(null);
		txtFieldCreateCPF.setText(null);
		datePickerCreateDateofBirth.setValue(null);
		txtFieldCreateAge.setText(null);
		chcCreateUF.setValue(null);
		txtFieldCreateZIPCode.setText(null);
		txtFieldCreateAddress.setText(null);
		txtFieldCreateDistrict.setText(null);
		txtFieldCreateHouseNumber.setText(null);
		txtFieldCreateCity.setText(null);
		txtFieldCreateEMail.setText(null);
		txtFieldCreateDDD.setText(null);
		txtFieldCreatePhone.setText(null);

		/* Clear Read */
		chcReadInfo.setValue(null);
		txtFieldReadInfo.setText(null);
		txtFieldReadID.setText(null);
		txtFieldReadName.setText(null);
		txtFieldReadSurname.setText(null);
		txtFieldReadUsername.setText(null);
		txtFieldReadPassword.setText(null);
		txtFieldReadMaritalStatus.setText(null);
		txtFieldReadRG.setText(null);
		txtFieldReadCPF.setText(null);
		txtFieldReadDateofBirth.setText(null);
		txtFieldReadAge.setText(null);
		txtFieldReadUF.setText(null);
		txtFieldReadZIPCode.setText(null);
		txtFieldReadAddress.setText(null);
		txtFieldReadDistrict.setText(null);
		txtFieldReadHouseNumber.setText(null);
		txtFieldReadCity.setText(null);
		txtFieldReadEMail.setText(null);
		txtFieldReadDDD.setText(null);
		txtFieldReadPhone.setText(null);

		/* Clear Update */
		chcUpdateInfo.setId(null);
		txtFieldUpdateInfo.setText(null);
		txtFieldUpdateID.setText(null);
		txtFieldUpdateName.setText(null);
		txtFieldUpdateSurname.setText(null);
		txtFieldUpdateUsername.setText(null);
		pwFieldUpdatePassword.setText(null);
		chcUpdateMartialStatus.setValue(null);
		txtFieldUpdateRG.setText(null);
		txtFieldUpdateCPF.setText(null);
		datePickerUpdateDateofBirth.setValue(null);
		txtFieldUpdateAge.setText(null);
		chcUpdateUF.setValue(null);
		txtFieldUpdateZIPCode.setText(null);
		txtFieldUpdateAddress.setText(null);
		txtFieldUpdateDistrict.setText(null);
		txtFieldUpdateHouseNumber.setText(null);
		txtFieldUpdateCity.setText(null);
		txtFieldUpdateEMail.setText(null);
		txtFieldUpdateDDD.setText(null);
		txtFieldUpdatePhone.setText(null);

		/* Clear Delete */
		chcDeleteInfo.setValue(null);
		txtFieldDeleteInfo.setText(null);
		txtFieldDeleteID.setText(null);
		txtFieldDeleteName.setText(null);
		txtFieldDeleteSurname.setText(null);
		txtFieldDeleteUsername.setText(null);
		txtFieldDeletePassword.setText(null);
		txtFieldDeleteMaritalStatus.setText(null);
		txtFieldDeleteRG.setText(null);
		txtFieldDeleteCPF.setText(null);
		txtFieldDeleteDateofBirth.setText(null);
		txtFieldDeleteAge.setText(null);
		txtFieldDeleteUF.setText(null);
		txtFieldDeleteZIPCode.setText(null);
		txtFieldDeleteAddress.setText(null);
		txtFieldDeleteDistrict.setText(null);
		txtFieldDeleteHouseNumber.setText(null);
		txtFieldDeleteCity.setText(null);
		txtFieldDeleteEMail.setText(null);
		txtFieldDeleteDDD.setText(null);
		txtFieldDeletePhone.setText(null);

	}

	public void createAccount() {
		String first_name = txtFieldCreateName.getText();
		String surname = txtFieldCreateSurname.getText();
		String username = txtFieldCreateUsername.getText();
		String user_password = pwFieldCreatePassword.getText();
		String martial_status = chcCreateMartialStatus.getValue();
		String rg = txtFieldCreateRG.getText();
		String cpf = txtFieldCreateCPF.getText();
		String date_of_birthh = datePickerCreateDateofBirth.getValue().toString();
		String age = txtFieldCreateAge.getText();
		String state = chcCreateUF.getValue();
		String zipcode = txtFieldCreateZIPCode.getText();
		String address = txtFieldCreateAddress.getText();
		String district = txtFieldCreateDistrict.getText();
		String house_number = txtFieldCreateHouseNumber.getText();
		String city = txtFieldCreateCity.getText();
		String email = txtFieldCreateEMail.getText();
		String ddd = txtFieldCreateDDD.getText();
		String phone_number = txtFieldCreatePhone.getText();
		CRUD create = new CRUD();
		create.create(first_name, surname, username, user_password, martial_status, rg, cpf, date_of_birthh, age, state,
				zipcode, address, district, house_number, city, email, ddd, phone_number);
	}

	public void readAccount() {

	}

	public void updateAccount() {

	}

	public void deleteAccount() {

	}

	public void convert2PDF() {

	}

	public void convert2Excel() {

	}
}
