import java.util.Arrays;

class AlgorithmBinaire implements Algorithm {
    private static final String NAME = "Algorithme Binaire";

    @Override
    public Livre iterate(Livre[] list, int key) {
        int midIndex = (list.length - 1) / 2;
        Livre midLivre = list[midIndex];

        if (midLivre.key == key) return midLivre;

        if (midLivre.key > key) {
            if (midIndex == 0) return null;
            return iterate(Arrays.copyOfRange(list, 0, midIndex), key);
        } else {
            if (list.length == midIndex + 1) return null;
            return iterate(Arrays.copyOfRange(list, midIndex + 1, list.length), key);
        }
    }

    @Override
    public String toString() {
        return NAME;
    }
}
