package pl.budzynski.model;
/**
 * Model class for discount.
 *
 */
public class Discount {
    private double value;
    /**
     * Class constructor.
     * Set discount value.
     * @param value Discount value.
     */
    public Discount(double value) {
        this.value = value;
    }
    /**
     * Getter.
     * @return Discount value.
     */
    public double getValue() {
        return value;
    }
}
