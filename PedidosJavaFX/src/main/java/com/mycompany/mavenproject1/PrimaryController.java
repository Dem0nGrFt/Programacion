package com.mycompany.mavenproject1;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author aitor.martinezparente
 */
public class PrimaryController implements Initializable {

    public static final int IVA = 21;

    @FXML
    private TextField units;
    @FXML
    private TextField price;
    @FXML
    private TextField total;

    @FXML
    private void calculate() {
        int unidades = Integer.parseInt(units.getText());
        double precio = Double.parseDouble(price.getText());

        double totalPrice = unidades * precio * (1 + IVA / 100.0);
        total.setText(Double.toString(totalPrice));

        Alert alert = new Alert(AlertType.INFORMATION, "Operación realizada con éxito!");
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.showAndWait();

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Nome de usuario");
        dialog.setHeaderText(null);
        dialog.setContentText("Introduza o seu nome de usuario:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            System.out.println("Nome: " + result.get());

            ArrayList<String> choices = new ArrayList<>();
            choices.add("1º DAW");
            choices.add("2º DAW");

            ChoiceDialog<String> dialogo = new ChoiceDialog<>(choices.get(0), choices);
            dialogo.setTitle("Grupo");
            dialogo.setHeaderText("Selección de grupo");
            dialogo.setContentText("Seleccione o grupo ao que pertence:");
            Optional<String> resultado = dialogo.showAndWait();
            if (result.isPresent()) {
                System.out.println("O seu grupo: " + resultado.get());
            }
        }
    }

    @FXML
    private void configure() throws IOException {
        Stage venta = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(PrimaryController.class.getResource("ConfWindow.fxml"));
        Parent p = fxmlLoader.load();

        Scene scene = new Scene(p, 640, 480);
        venta.setScene(scene);
        venta.setTitle("Configuracion");
        venta.initModality(Modality.APPLICATION_MODAL);
        venta.show();

        Alert alert = new Alert(AlertType.CONFIRMATION, "Está seguro?");
        alert.setTitle("Saír");
        alert.setHeaderText("Saír da aplicación");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            Platform.exit();

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
