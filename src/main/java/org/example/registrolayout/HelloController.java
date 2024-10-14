package org.example.registrolayout;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
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