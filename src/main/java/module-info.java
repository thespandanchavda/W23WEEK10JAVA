module com.example.week10part2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week10part2 to javafx.fxml;
    exports com.example.week10part2;
}