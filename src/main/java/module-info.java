module com.example.clase4p3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.clase4p3 to javafx.fxml;
    exports com.example.clase4p3;
}