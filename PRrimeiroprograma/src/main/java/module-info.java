module com.example.prrimeiroprograma {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prrimeiroprograma to javafx.fxml;
    exports com.example.prrimeiroprograma;
}