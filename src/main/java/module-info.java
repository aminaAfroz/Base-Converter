module com.example.baseconverter {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.baseconverter to javafx.fxml;
    exports com.example.baseconverter;
}