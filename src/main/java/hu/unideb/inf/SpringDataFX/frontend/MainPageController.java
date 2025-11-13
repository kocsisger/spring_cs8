package hu.unideb.inf.SpringDataFX.frontend;

import hu.unideb.inf.SpringDataFX.SpringDataFxApplication;
import javafx.event.ActionEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainPageController {

    private BackendManager backendManager;

    public BackendManager getBackendManager() {
        return backendManager;
    }

    public void setBackendManager(BackendManager backendManager) {
        this.backendManager = backendManager;
    }

    public void handleStartButton(ActionEvent actionEvent) {
        backendManager.start();
    }

    public void handleStopButton(ActionEvent actionEvent) {
        closeBackend();
    }

    void closeBackend(){
        backendManager.stop();
    }

    public void handlePrintButton(ActionEvent actionEvent) {
        backendManager.print();
    }
}
