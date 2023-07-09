package com.example.simplecalculater;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField operand1Field;
    @FXML
    private TextField operand2Field;
    @FXML
    private Label resultLabel;

    @FXML
    protected void add() {
        double operand1 = Double.parseDouble(operand1Field.getText());
        double operand2 = Double.parseDouble(operand2Field.getText());
        double result = operand1 + operand2;
        resultLabel.setText("Kết quả: " + result);
    }

    @FXML
    protected void subtract() {
        double operand1 = Double.parseDouble(operand1Field.getText());
        double operand2 = Double.parseDouble(operand2Field.getText());
        double result = operand1 - operand2;
        resultLabel.setText("Kết quả: " + result);
    }

    @FXML
    protected void multiply() {
        double operand1 = Double.parseDouble(operand1Field.getText());
        double operand2 = Double.parseDouble(operand2Field.getText());
        double result = operand1 * operand2;
        resultLabel.setText("Kết quả: " + result);
    }

    @FXML
    protected void divide() {
        double operand1 = Double.parseDouble(operand1Field.getText());
        double operand2 = Double.parseDouble(operand2Field.getText());

        if (operand2 != 0) {
            double result = operand1 / operand2;
            resultLabel.setText("Kết quả: " + result);
        } else {
            resultLabel.setText("Không thể chia cho 0");
        }
    }
}