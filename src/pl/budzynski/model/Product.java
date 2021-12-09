package pl.budzynski.model;
/**
 * Model class for product.
 *
 */
public class Product {
    private String name;
    private double price;

    /**
     * Class constructor.
     * Set Product name and price.
     * @param name Product name.
     * @param price Product price.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    /**
     * Getter.
     * @return Product name.
     */
    public String getName() {
        return name;
    }
    /**
     * Getter.
     * @return Product price.
     */
    public double getPrice() {
        return price;
    }
    /**
     * Setter
     * @param price Product price.
     * @return Nothing.
     */
    public void setPrice(double price) {
        this.price = price;
    }

}
