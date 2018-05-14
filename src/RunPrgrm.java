import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunPrgrm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MainWindowLayout windowLayout = new MainWindowLayout();

        primaryStage.setTitle("Nombres Fibonacci");
        primaryStage.setScene(new Scene(windowLayout));
        primaryStage.show();
    }
}
