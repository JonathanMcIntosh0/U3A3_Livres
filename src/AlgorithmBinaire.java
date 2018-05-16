import java.util.Arrays;

class AlgorithmBinaire implements Algorithm {
    private static final String NAME = "Algorithme Binaire";

    @Override
    public Livre iterate(Livre[] list, int key) {
        int midIndex = (list.length - 1) / 2;
        Livre midLivre = list[midIndex];

        if (midLivre.key == key) return midLivre;
        if (list.length == 1) return null;

        if (midLivre.key > key) {
            return iterate(Arrays.copyOfRange(list, 0, midIndex), key);
        } else {
            return iterate(Arrays.copyOfRange(list, midIndex + 1, list.length), key);
        }
    }

    @Override
    public String toString() {
        return NAME;
    }
}
