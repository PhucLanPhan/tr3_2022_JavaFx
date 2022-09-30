module com.example.tr3_2022_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tr3_2022_javafx to javafx.fxml;
    exports com.example.tr3_2022_javafx;
    exports com.example.tr3_2022_javafx.week03;
    opens com.example.tr3_2022_javafx.week03 to javafx.fxml;
}