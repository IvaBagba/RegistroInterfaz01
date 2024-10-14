package org.example.registrolayout;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button sigInicio;
    @FXML
    private Button sigRegistro;
    @FXML
    private Button sigValidar;
    @FXML
    private Button sigGuardar;
    @FXML
    private Button btnSalir;

    @FXML
    private TabPane tabPane;

    @FXML
    private TextField txtNombreCompleto;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtCorreo;
    @FXML
    private CheckBox paisES;
    @FXML
    private CheckBox paisIT;

    @FXML
    private Label txtNombreCompletoValid;
    @FXML
    private Label txtTelefonoValid;
    @FXML
    private Label txtCorreoValid;
    @FXML
    private Label paisCheck;

    @FXML
    protected void onBtnSalirButtonClick() {
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onSigInicioButtonClick() {
        tabPane.getSelectionModel().select(1);
    }

    @FXML
    protected void onSigRegistroButtonClick() {
        String paisSeleccionado;

        if (paisES.isSelected() && paisIT.isSelected()) {
            paisSeleccionado = "ESPAÑA-ITALIA";
        } else if (paisIT.isSelected()) {
            paisSeleccionado = "ITALIA";
        } else if (paisES.isSelected()) {
            paisSeleccionado = "ESPAÑA";
        } else {
            paisSeleccionado = "NULL";
        }

        txtNombreCompletoValid.setText("Nombre Completo: " + txtNombreCompleto.getText());
        txtTelefonoValid.setText("Telefono: " + txtTelefono.getText());
        txtCorreoValid.setText("Correo: " + txtCorreo.getText());
        paisCheck.setText(paisSeleccionado);

        tabPane.getSelectionModel().select(2);
    }

    @FXML
    protected void onSigValidarButtonClick() {
        tabPane.getSelectionModel().select(3);
    }

    @FXML
    protected void onSigGuardarButtonClick() {
        tabPane.getSelectionModel().select(0);
    }
}