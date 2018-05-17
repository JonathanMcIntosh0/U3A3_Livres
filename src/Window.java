import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class Window extends Stage {

    Window(String title, Parent layout) {
        this.setTitle(title);
        this.setScene(new Scene(layout));
        this.show();
    }
}
