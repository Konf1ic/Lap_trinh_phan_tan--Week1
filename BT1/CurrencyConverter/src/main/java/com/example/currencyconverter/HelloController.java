package com.example.currencyconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField tien;

    @FXML
    protected void onHelloButtonClick() {
        double rate = 23000.0;
        double usd = rate * Double.parseDouble(tien.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Số tiền là: " + usd);
        alert.show();

    }
}