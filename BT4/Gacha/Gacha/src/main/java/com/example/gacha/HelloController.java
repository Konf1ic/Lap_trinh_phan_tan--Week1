package com.example.gacha;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {
    @FXML
    private TextField guessField;
    @FXML
    private Label resultLabel;

    private int randomNumber;

    public void initialize() {
        Random random = new Random();
        randomNumber = random.nextInt(101);
    }

    @FXML
    protected void checkGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());

            if (guess == randomNumber) {
                resultLabel.setText("Chính xác! Số là " + randomNumber);
            } else if (guess < randomNumber) {
                resultLabel.setText("Số bạn đoán nhỏ hơn số cần tìm");
            } else {
                resultLabel.setText("Số bạn đoán lớn hơn số cần tìm");
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Lỗi");
            alert.setHeaderText(null);
            alert.setContentText("Vui lòng nhập một số nguyên từ 0 - 100");
            alert.show();
        }
    }
}