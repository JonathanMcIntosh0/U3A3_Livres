class Controller {

    //Les formats de message

    private static final String NULL_ALGORITHM_MSG = "SVP choisir un algorithme!";
    private static final String NULL_KEY_MSG = "SVP entrer un numéro de référence";
    private static final String INVALID_KEY_MSG =
            "%s n'est pas un numéro de référence valide,%n" +
            "SVP entrer un entier positive!";
    private static final String LIVRE_FOUND_MSG = "Le livre avec le numéro de référence %d%n s'appelle %s";
    private static final String LIVRE_NOT_FOUND_MSG = "Le livre avec le numéro de référence %d n'éxiste pas";

    private static final String MAIN_WINDOW_TITLE = "Application Livres";
    private static final String ADDITION_WINDOW_TITLE = "Ajouter un livre";

    //Mon model et interface

    private final Database database;
    private final MainWindowLayout mainWindowLayout;
    private final AdditionWindowLayout additionWindowLayout;

    Controller(Database database, MainWindowLayout mainWindowLayout, AdditionWindowLayout additionWindowLayout) {
        this.database = database;
        this.mainWindowLayout = mainWindowLayout;
        this.additionWindowLayout = additionWindowLayout;

        mainWindowLayout.setAlgList(database.listAlg);
        mainWindowLayout.getTextField().textProperty().addListener((observable, oldValue, newValue) -> textFieldChanged(newValue));


    }

    void runMainWindow() {
        new Window(MAIN_WINDOW_TITLE, mainWindowLayout);
    }

    void runAdditionWindow() {
        new Window(ADDITION_WINDOW_TITLE, additionWindowLayout);

    }

    private void textFieldChanged(String txt) {
        Algorithm selectedAlg = mainWindowLayout.getSelectedAlg();
        if (selectedAlg == null) {
            mainWindowLayout.setMsg(getNullAlgorithmMsg());
            return;
        }

        if (txt == null) {
            mainWindowLayout.setMsg(getNullKeyMsg());
            return;
        }

        Integer key = parseInt(txt);
        if (key == null) {
            mainWindowLayout.setMsg(getInvalidKeyMsg(txt));
            return;
        }

        Livre livre = selectedAlg.iterate(database.listLivres, key);
        if (livre == null) {
            mainWindowLayout.setMsg(getLivreNotFoundMsg(key));
            return;
        }

        mainWindowLayout.setMsg(getLivreFoundMsg(livre));
    }

    private static String getNullAlgorithmMsg() {
        return NULL_ALGORITHM_MSG;
    }

    private static String getNullKeyMsg() {
        return NULL_KEY_MSG;
    }

    private static String getInvalidKeyMsg(String txt) {
        return String.format(INVALID_KEY_MSG, txt);
    }

    private static String getLivreFoundMsg(Livre livre) {
        return String.format(LIVRE_FOUND_MSG, livre.key, livre.name);
    }

    private static String getLivreNotFoundMsg(int key) {
        return String.format(LIVRE_NOT_FOUND_MSG, key);
    }

    private static Integer parseInt(String txt) {
        int n;
        try {
            n = Integer.parseInt(txt);
        } catch (NumberFormatException e) {
            return null;
        }

        return n >= 0 ? n : null;
    }
}
