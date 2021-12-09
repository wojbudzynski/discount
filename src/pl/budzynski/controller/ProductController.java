package pl.budzynski.controller;

import pl.budzynski.model.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
/**
 * Class controller for product.
 *
 */
public class ProductController {
    List<Product> products= new ArrayList<Product>();
    /**
     * Adds input discount data.
     * @return Nothing.
     */
    public void addBaseData() {
        addProduct(new Product("A",1500));
        addProduct(new Product("B",500));
    }
    /**
     * Adds a product to the list.
     * Calls a validating method.
     * @param product Added product.
     * @return Nothing.
     */
    public void addProduct(Product product) {
        if(validate(product))
            products.add(product);
    }
    /**
     * Validating method.
     * Rounds the value to one grosz up.
     * Check if there are 5 products already. If there ate the product will not be added.
     * Check if product prise is greater than 0. If not the product will not be added.
     * @param product Added product.
     * @return Nothing.
     */
    private boolean validate(Product product){

        BigDecimal bd = new BigDecimal(product.getPrice()).setScale(2, RoundingMode.UP);
        product.setPrice(bd.doubleValue());

        if(products.size()==5)
            System.out.println("Za dużo produktów. Można dodać maksymalnie 5. Produkt nie został dodany.");
        else if (product.getPrice()<=0)
            System.out.println("Niepoprawna cena produktu. Produkt nie został dodany.");
        else
            return true;

        return false;
    }
    /**
     * Getter.
     * @return Products list.
     */
    public List<Product> getProducts(){
        return products;
    }
}
