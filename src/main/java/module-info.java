module com.mycompany.aula8 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.aula8 to javafx.fxml;
    exports com.mycompany.aula8;
}
