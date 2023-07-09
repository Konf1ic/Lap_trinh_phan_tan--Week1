package com.example.bmiconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField heightField;
    @FXML
    public TextField weightField;

    @FXML
    public void calculateBMI() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Chỉ số BMI");
        if (heightField.getText().equals("") || weightField.getText().equals("")){
            alert.setContentText("khong biet nhap so a thg ngu");
            alert.show();
        }else {
            double height = Double.parseDouble(heightField.getText());
            double weight = Double.parseDouble(weightField.getText());

            double bmi = weight / (Math.pow(height,2));

            alert.setContentText("Chỉ số BMI của bạn là: " + bmi);
            alert.show();
        }
    }
}