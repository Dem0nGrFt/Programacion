module com.mycompany.pruebajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.pruebajavafx to javafx.fxml;
    exports com.mycompany.pruebajavafx;
}
