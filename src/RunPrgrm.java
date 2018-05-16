import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunPrgrm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MainWindowLayout windowLayout = new MainWindowLayout();

        /*
        Livre[] listLivres = {
                new Livre("A", 1),
                new Livre("B", 2),
                new Livre("C", 3),
                new Livre("D", 4),
                new Livre("E", 6),
                new Livre("F", 8),
        };

        Livre ans;
        ans = new AlgorithmBinaire().iterate(listLivres, 1);
        System.out.println(ans);
        */

        Algorithm[] listAlg = {
                new AlgorithmLineaire(),
                new AlgorithmBinaire()
        };
        windowLayout.setAlgList(listAlg);

        primaryStage.setTitle("Nombres Fibonacci");
        primaryStage.setScene(new Scene(windowLayout));
        primaryStage.show();
    }
}
