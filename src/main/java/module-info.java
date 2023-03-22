module gestion_qccm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens gestion_qccm to javafx.fxml;
    exports gestion_qccm;
}
