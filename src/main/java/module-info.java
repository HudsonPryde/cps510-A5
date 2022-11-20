module assignment9 {
    requires javafx.controls;
    requires javafx.fxml;

    opens assignment9 to javafx.fxml;
    exports assignment9;
}
