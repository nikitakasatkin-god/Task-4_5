module com.example.task4_5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task4_5 to javafx.fxml;
    exports com.example.task4_5;
}