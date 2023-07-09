module com.example.gacha {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.gacha to javafx.fxml;
    exports com.example.gacha;
}