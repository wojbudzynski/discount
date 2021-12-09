package pl.budzynski.controller;

public class DiscountController {
    double value;

    public double getDiscount() {
        return value;
    }

    public void setValue(double value) {
        if(validate(value))
            this.value = value;
    }

    private boolean validate(double value) {
        if (value<0)
            System.out.println("Niepoprawna wartość rabatu. Ustawiam rabat = 0zł.");
        else
            return true;
        return false;
    }

    public void addBaseData() {
        setValue(100);
    }
}
