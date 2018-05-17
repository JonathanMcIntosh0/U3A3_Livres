public class Livre {
    public final String name;
    public final int key;

    public Livre(int key, String name) {
        this.name = name;
        this.key = key;
    }

    @Override
    public String toString() {
        return String.format("Name : %s, Key : %d", name, key);
    }
}
