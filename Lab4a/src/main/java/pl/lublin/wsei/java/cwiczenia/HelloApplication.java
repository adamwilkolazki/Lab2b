package pl.lublin.wsei.java.cwiczenia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("gusInfoGraphic.fxml"));
       Parent root = fxmlLoader.load();
        HelloController controller = fxmlLoader.getController();
      controller.setHostServices(this.getHostServices());
        controller.setStage(stage);

      Scene scene = new Scene(fxmlLoader.load(), 800, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    }
