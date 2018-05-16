public class Livre {
    final String name;
    final int key;

    Livre(String name, int key) {
        this.name = name;
        this.key = key;
    }

    @Override
    public String toString() {
        return String.format("Name : %s, Key : %d", name, key);
    }
}
