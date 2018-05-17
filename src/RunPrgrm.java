import javafx.application.Application;
import javafx.stage.Stage;

public class RunPrgrm extends Application {

    private static Database database;
    private static Controller controller;

    public static void main(String[] args) {
        database = new Database();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MainWindowLayout windowLayout = new MainWindowLayout();
        AdditionWindowLayout additionWindowLayout = new AdditionWindowLayout();

        controller = new Controller(database, windowLayout, additionWindowLayout);

    }
}
