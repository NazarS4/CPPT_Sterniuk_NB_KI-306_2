package KI306.Sterniuk.Lab3;

/**
 * Клас пороху.
 */
public class Gunpowder {
    private String type;
    private double weight;
    public Gunpowder(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }
    public String getType() { return type; }
    public double getWeight() { return weight; }
}
