class AlgorithmLineaire implements Algorithm {
    private static final String NAME = "Algorithme linéaire";

    @Override
    public Livre iterate(Livre[] list, int key) {
        for (Livre livre : list) {
            if (livre.key == key) return livre;
        }
        return null;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
