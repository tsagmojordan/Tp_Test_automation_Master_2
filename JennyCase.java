public class JennyCase {
    public double value;
    public String name;
    public JennyCase(double value, String name) {
        this.value = value;
        this.name = name;
    }
    public String toString() {
        return name + "=" + value;
    }
}
