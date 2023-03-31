module hbv202g.zoomanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens hbv202g.zoomanagement to javafx.fxml;
    exports hbv202g.zoomanagement;
}