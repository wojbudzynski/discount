package pl.budzynski.controller;

import pl.budzynski.model.Discount;

/**
 * Class controller for discount.
 *
 */
public class DiscountController {
    Discount discount;
    /**
     * Getter.
     * @return Discount value.
     */
    public double getDiscount() {
        return discount.getValue();
    }
    /**
     * Setter
     * Calls a validating method.
     * @param discount Discount value.
     * @return Nothing.
     */
    public void setValue(Discount discount) {
        if(validate(discount.getValue()))
            this.discount=discount;
    }
    /**
     * Validating method.
     * Check if discount value is greater than 0. If not it is set as 0.
     * @param value Discount value.
     * @return Nothing.
     */
    private boolean validate(double value) {
        if (value<0)
            System.out.println("Niepoprawna wartość rabatu. Ustawiam rabat = 0zł.");
        else
            return true;
        return false;
    }
    /**
     * Adds input discount data.
     * @return Nothing.
     */
    public void addBaseData() {
        setValue(new Discount(100));
    }
}
