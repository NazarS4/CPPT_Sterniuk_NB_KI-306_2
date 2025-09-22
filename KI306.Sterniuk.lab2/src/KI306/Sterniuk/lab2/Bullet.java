package KI306.Sterniuk.lab2;

/**
 * Клас, що описує кулю.
 */
public class Bullet {
    private String material;
    private double weight; // грами

    public Bullet(String material, double weight) {
        this.material = material;
        this.weight = weight;
    }

    public String getMaterial() { return material; }
    public double getWeight() { return weight; }
}
