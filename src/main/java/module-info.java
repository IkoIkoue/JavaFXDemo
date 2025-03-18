module project.rpcs.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens project.rpcs.javafxdemo to javafx.fxml;
    exports project.rpcs.javafxdemo;
}