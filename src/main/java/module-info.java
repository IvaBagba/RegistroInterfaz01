module org.example.registrolayout {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.registrolayout to javafx.fxml;
    exports org.example.registrolayout;
}