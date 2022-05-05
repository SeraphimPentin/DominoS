module example.dominos {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.desktop;


    opens example.dominos to javafx.fxml;
    exports example.dominos;
}