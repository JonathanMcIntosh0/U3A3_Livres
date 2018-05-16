import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

class MainWindowLayout extends VBox {

    private static ChoiceBox<Algorithm> cbAlg = new ChoiceBox<>();
    private static TextField tfKey = new TextField();
    private static Text txtMessage = new Text("SVP choisir un algorithme puis inscrire un numéro de référence!");

    MainWindowLayout() {
        super(10);
        this.getChildren().addAll(
                createMainTitle(),
                createSubText(),
                createAlgLayout(),
                createKeyLayout(),
                createMsgLayout()
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

    private static Node createAlgLayout() {
        HBox algLayout = new HBox(10);

        Text txtAlg = new Text("Choisir l'algorithme que vous voulez utiliser : ");
        txtAlg.setFont(Font.font(null,FontWeight.BOLD, 12));

        algLayout.getChildren().addAll(
                txtAlg,
                cbAlg
        );
        algLayout.setAlignment(Pos.CENTER);

        return algLayout;
    }

    private static Node createKeyLayout() {
        HBox keyLayout = new HBox(10);

        Text txtKey = new Text("Inscrire le numéro de référence : ");
        txtKey.setFont(Font.font(null,FontWeight.BOLD, 12));

        keyLayout.getChildren().addAll(
                txtKey,
                tfKey
        );
        keyLayout.setAlignment(Pos.CENTER);

        return keyLayout;
    }

    private static Node createMsgLayout() {
        txtMessage.setTextAlignment(TextAlignment.CENTER);
        txtMessage.setFont(Font.font(null, FontWeight.BOLD, FontPosture.ITALIC, 15));

        StackPane msgLayout = new StackPane(txtMessage);
        msgLayout.setAlignment(Pos.CENTER);

        return msgLayout;
    }

    //Setters and getters

    void setAlgList(Algorithm[] list) {
        cbAlg.setItems(FXCollections.observableArrayList(list));
    }

    Algorithm getSelectedAlg() {
        return cbAlg.getValue();
    }
}
