package KI306.Sterniuk.lab2;


/**
 * Клас, що описує порох.
 */
public class Gunpowder {
    private double weight; // грами
    private String type;

    public Gunpowder(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public double getWeight() { return weight; }
    public String getType() { return type; }
}
