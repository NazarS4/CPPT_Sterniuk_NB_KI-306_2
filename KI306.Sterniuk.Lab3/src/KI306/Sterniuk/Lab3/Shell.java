package KI306.Sterniuk.Lab3;

/**
 * Клас гільзи.
 */
public class Shell {
    private String material;
    private double length;
    public Shell(String material, double length) {
        this.material = material;
        this.length = length;
    }
    public String getMaterial() { return material; }
    public double getLength() { return length; }
}
