package KI306.Sterniuk.Lab3;

/**
 * Клас кулі.
 */
public class Bullet {
    private String material;
    private double weight;
    public Bullet(String material, double weight) {
        this.material = material;
        this.weight = weight;
    }
    public String getMaterial() { return material; }
    public double getWeight() { return weight; }
}
