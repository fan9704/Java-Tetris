module demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens tetris to javafx.fxml;
    exports tetris;
}