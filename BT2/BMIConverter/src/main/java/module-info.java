module com.example.bmiconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bmiconverter to javafx.fxml;
    exports com.example.bmiconverter;
}