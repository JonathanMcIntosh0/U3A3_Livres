class AlgorithmLineaireTrier implements Algorithm {
    private static final String NAME = "Algorithme linéaire Trier";

    @Override
    public Livre iterate(Livre[] list, int key) {
        for (Livre livre : list) {
            if (livre.key == key) return livre;
            if (livre.key > key) return null;
        }
        return null;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
