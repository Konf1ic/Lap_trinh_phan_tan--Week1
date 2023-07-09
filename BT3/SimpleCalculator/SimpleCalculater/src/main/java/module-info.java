module com.example.simplecalculater {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.simplecalculater to javafx.fxml;
    exports com.example.simplecalculater;
}