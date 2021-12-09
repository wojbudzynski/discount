package pl.budzynski.model;

public class Discount {
    private double value;

    public Discount(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
