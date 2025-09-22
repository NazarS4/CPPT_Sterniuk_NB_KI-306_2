package KI306.Sterniuk.lab2;


/**
 * Клас, що описує гільзу.
 */
public class Shell {
    private String material;
    private double length; // мм

    public Shell(String material, double length) {
        this.material = material;
        this.length = length;
    }

    public String getMaterial() { return material; }
    public double getLength() { return length; }
}
