import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

class MainWindowLayout extends VBox {

    MainWindowLayout() {
        super(10);
        this.getChildren().addAll(
                createMainTitle(),
                createSubText()
        );
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(15));
        this.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
    }

    private static Node createMainTitle() {
        Text mainTitle = new Text("Les livres classiques pour enfants");
        mainTitle.setFont(Font.font(null, FontWeight.BOLD, 20));
        mainTitle.setFill(Color.BLUE);

        StackPane mainTitleLayout = new StackPane(mainTitle);
        mainTitleLayout.setAlignment(Pos.CENTER);

        return mainTitleLayout;
    }

    private static Node createSubText() {
        Text subText = new Text(
                "Ce programme recherche le titre du livre\n" +
                "correspondant au numéro de référence."
        );
        subText.setTextAlignment(TextAlignment.CENTER);

        StackPane subTextLayour = new StackPane(subText);
        subTextLayour.setAlignment(Pos.CENTER);

        return subTextLayour;
    }


}
