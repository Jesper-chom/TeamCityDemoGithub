module com.example.teamcitydemogithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.teamcitydemogithub to javafx.fxml;
    exports com.example.teamcitydemogithub;
}